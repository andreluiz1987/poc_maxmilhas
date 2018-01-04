package developers.com.br.poc_maxmilhas.http.contracts;

import com.google.gson.JsonObject;

/**
 * Created by AndreCoelho on 02/01/2018.
 */
public interface HttpHandlerContract {

    /**
     * This method is called whenever the request is started.
     */
    void onRequestStarted();


    /**
     * ,
     * This method is called right after the request is sent.
     */
    void onRequestSent();


    /**
     * This method is called when the request is successful.
     *
     * @param response
     */
    void onRequestSuccessful(JsonObject response);


    /**
     * This method is called everytime a file update is detected.
     *
     * @param progress
     */
    void onProgress(long progress, long length);

    /**
     * Called when the request failed. A status code is also provided.
     *
     * @param response
     * @param status
     */
    void onRequestFailed(String response, int status);


    /**
     * Called when the request failed. A status code is also provided.
     *
     * @param response
     * @param status
     */
    void onRequestError(String response, int status);


    /**
     * Called when the request is interrupted by the user.
     */
    void onRequestHalted();
}