package developers.com.br.poc_maxmilhas.services;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by AndreCoelho on 02/01/2018.
 */


public interface RetrofitGenericRequest {

    @FormUrlEncoded
    @POST
    Call<ResponseBody> performPost(@Url String url, @FieldMap Map<String, Object> params, @HeaderMap Map<String, String> headers);

    @GET
    Call<ResponseBody> performGet(@Url String cleanUrl, @QueryMap Map<String, Object> fields, @HeaderMap Map<String, String> headers);
}
