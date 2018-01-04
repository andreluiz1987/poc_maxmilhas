package developers.com.br.poc_maxmilhas.services;

import android.util.Log;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

import developers.com.br.poc_maxmilhas.http.contracts.HttpHandlerContract;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by AndreCoelho on 02/01/2018.
 */

public class RetrofitUtils {

    public static final String TAG = "RetrofitUtils";
    public static final boolean D = true;

    /**
     * Base URL
     */
    public static final String BASE_URL = "http://developer.goibibo.com";

    public static RetrofitGenericRequest getGenericRequest() {
        return RetrofitClient.getClient(BASE_URL).create(RetrofitGenericRequest.class);
    }

    /**
     * Enqueues any request.
     *
     * @param call
     * @param handler
     */
    public static void enqueue(Call<ResponseBody> call, HttpHandlerContract handler) {

        final HttpHandlerContract _handler = (handler == null) ? emptyHandler : handler;

        //Calling the handle when the request starts.
        _handler.onRequestStarted();

        //Enqueuing the request.
        call.enqueue(new Callback<ResponseBody>() {

            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                try {

                    if (D) Log.d(TAG, "Trying to parse response.");

                    /**
                     * 1) If response is successfull with HTTP status code then parse the body.
                     * If body is a valid JSON then send it to the success method.
                     */
                    if (response.isSuccessful()) {

                        if (D)
                            Log.d(TAG, "Response is successful with a status code: " + response.code());
                        //if(D) Log.d(TAG, response.body().string());

                        JsonObject object = new JsonParser().parse(response.body().string()).getAsJsonObject();

                        //Trying to convert the response object from a string to a JSON object.
                        JsonElement error = object.get("error");

                        //If the error field is not null then throw an error.
                        //If conversion was successfull then we simply call the handler.
                        if (error == null || error.isJsonNull()) {
                            if (D)
                                Log.d(TAG, "No error field present on response. Sending resulting data to handler.");
                            _handler.onRequestSuccessful(object);
                        } else {
                            if (D)
                                Log.d(TAG, "An error field is present on the response. Ending request with failure.");
                            _handler.onRequestFailed(error.toString(), 0);
                        }


                    } else {
                        if (D)
                            Log.d(TAG, "Request failed with message: " + response.errorBody().string());

                        //_handler.onRequestFailed(response.errorBody().string(), response.code());
                        throw new Exception("Internal server error.");
                    }
                } catch (IOException io) {
                    if (D)
                        Log.d(TAG, "An exception was thrown when parsing the request. Message is: " + io.getMessage());
                    _handler.onRequestFailed(io.getMessage(), 0);
                } catch (NullPointerException npe) {
                    //This message should not be broadcast to client.
                    if (D)
                        Log.d(TAG, "A null pointer exception was thrown with message: " + npe.getMessage());
                    _handler.onRequestFailed(npe.getMessage(), 0);
                } catch (Exception ex) {
                    if (D)
                        Log.d(TAG, "An exception was thrown when parsing the request. Message is: " + ex.getMessage());

                    if (response.code() == 200) {
                        _handler.onRequestSuccessful(new JsonObject());
                    } else if (response.code() == 500) {
                        if (D) Log.d(TAG, "A Internal Server Error appear.");
                        _handler.onRequestFailed("O servidor se encontra com problemas no momento.", 500);
                    } else {
                        _handler.onRequestFailed(ex.getMessage(), 0);
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                if (D) Log.d(TAG, "Request failed with message: " + t.getMessage());
                _handler.onRequestFailed(t.getMessage(), 0);
            }
        });

        //Calling the handler informing that the request has been sent.
        //There is no guarantee that this method will be called prior to onRequestSuccessfull or
        //onRequestFailed.
        _handler.onRequestSent();
    }

    /**
     * Empty handler to be used in case none is passed as argument to enqueue method.
     */
    private static final HttpHandlerContract emptyHandler = new HttpHandlerContract() {
        @Override
        public void onRequestStarted() {

        }

        @Override
        public void onRequestSent() {

        }

        @Override
        public void onRequestSuccessful(JsonObject response) {

        }

        @Override
        public void onProgress(long progress, long length) {

        }

        @Override
        public void onRequestFailed(String response, int status) {

        }

        @Override
        public void onRequestError(String response, int status) {

        }

        @Override
        public void onRequestHalted() {

        }
    };
}
