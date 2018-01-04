package developers.com.br.poc_maxmilhas.http;

import android.util.Log;

import com.google.gson.JsonObject;

import developers.com.br.poc_maxmilhas.http.contracts.HttpHandlerContract;

/**
 * Created by AndreCoelho on 02/01/2018.
 */

public class BaseHttpHandler implements HttpHandlerContract {

    private static final String TAG = "BaseHttpHandler";
    private static final boolean D = true;

    @Override
    public void onRequestStarted() {
        if(D) Log.d(TAG,"onRequestStarted");
    }

    @Override
    public void onRequestSent() {
        if(D) Log.d(TAG,"onRequestSent");
    }

    @Override
    public void onRequestSuccessful(JsonObject response) {
        if(D) Log.d(TAG,"onRequestSuccessful response: " + response.toString());
    }

    @Override
    public void onProgress(long progress, long length) {
        if(D) Log.d(TAG,"onProgress progress: " + progress + " length: " + length);
    }

    @Override
    public void onRequestFailed(String response, int status) {
        if(D) Log.d(TAG,"onRequestFailed response: " + response + " status: " + status);
    }

    @Override
    public void onRequestError(String response, int status) {
        if(D) Log.d(TAG,"onRequestError response: " + response + " status: " + status);
    }

    @Override
    public void onRequestHalted() {
        if(D) Log.d(TAG,"onRequestHalted");
    }
}
