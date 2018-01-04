package developers.com.br.poc_maxmilhas.services;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AndreCoelho on 02/01/2018.
 */

public class RetrofitClient {

    /**
     * Retrofit static instance.
     */
    private static Retrofit retrofit = null;


    /**
     * Returns a retrofit cleitn based on a specific URL.
     *
     * @param baseUrl
     * @return
     */
    public static Retrofit getClient(String baseUrl) {

        if (retrofit==null) {
            OkHttpClient client = new OkHttpClient.Builder().
                    readTimeout(60, TimeUnit.SECONDS)
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
