package developers.com.br.poc_maxmilhas.sync;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import developers.com.br.poc_maxmilhas.http.BaseHttpHandler;
import developers.com.br.poc_maxmilhas.http.HttpService;
import developers.com.br.poc_maxmilhas.http.SynchronizationServices;
import developers.com.br.poc_maxmilhas.model.Constants;
import developers.com.br.poc_maxmilhas.model.Data;
import developers.com.br.poc_maxmilhas.model.FlightSearch;

/**
 * Created by AndreCoelho on 02/01/2018.
 */

public class SynchronizeFlight extends BaseHttpHandler {

    public void getFligths(FlightSearch flightSearch) {

        HttpService.request(SynchronizationServices.class)
                .service("filter")
                .get()
                .withField(Constants.GoibiboAPI.APP_ID, Constants.GoibiboAPI.APPLICATION_ID)
                .withField(Constants.GoibiboAPI.APP_KEY, Constants.GoibiboAPI.APPLICATION_KEYS)
                .withField(Constants.FlighSearcjAPI.SOURCE, flightSearch.getOrigin())
                .withField(Constants.FlighSearcjAPI.DESTINATION, flightSearch.getDestination())
                .withField(Constants.FlighSearcjAPI.DATE_OF_DEPARTURE, flightSearch.getDateDeparture())
                .withField(Constants.FlighSearcjAPI.DATE_OF_ARRIVAL, flightSearch.getDateArrival())
                .withField("seatingclass", "E")
                .withField("adults", "1")
                .withField("infants", "0")
                .withField("counter", "0")
                .withHandler(this)
                .send();
    }

    @Override
    public void onProgress(long progress, long length) {
        super.onProgress(progress, length);
    }

    @Override
    public void onRequestHalted() {
        super.onRequestHalted();
    }

    @Override
    public void onRequestStarted() {
        super.onRequestStarted();
    }

    @Override
    public void onRequestError(String response, int status) {
        super.onRequestError(response, status);
    }

    @Override
    public void onRequestFailed(String response, int status) {
        super.onRequestFailed(response, status);
    }

    @Override
    public void onRequestSuccessful(JsonObject response) {
        super.onRequestSuccessful(response);

        Data data = new Gson().fromJson(response, Data.class);
    }

    @Override
    public void onRequestSent() {
        super.onRequestSent();
    }
}
