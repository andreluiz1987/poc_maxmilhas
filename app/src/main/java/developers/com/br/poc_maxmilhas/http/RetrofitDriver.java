package developers.com.br.poc_maxmilhas.http;

import java.util.Map;

import developers.com.br.poc_maxmilhas.http.contracts.HttpHandlerContract;
import developers.com.br.poc_maxmilhas.services.RetrofitGenericRequest;
import developers.com.br.poc_maxmilhas.services.RetrofitUtils;

/**
 * Created by AndreCoelho on 02/01/2018.
 */

public class RetrofitDriver extends HttpDriver {

    @Override
    public void send(String url, String method,
                     Map<String, Object> fields,
                     Map<String, String> headers,
                     Map<String, Object> query,
                     HttpHandlerContract handler,
                     boolean download) {

        //Fetches the service from the Retrofit builder.
        RetrofitGenericRequest service = RetrofitUtils.getGenericRequest();

        //Parses the URL.
        String cleanUrl = parseUrl(url, query);

        if (method == HttpService.METHOD_GET) {
            RetrofitUtils.enqueue(service.performGet(cleanUrl, fields, headers), handler);
        } else {
            RetrofitUtils.enqueue(service.performPost(cleanUrl, fields, headers), handler);
        }
    }

    /**
     * For this driver we have to parse the URL with the following rules:
     * 1) For each object in query, replace any occurrence of {object.key} for the corresponding
     * string representation of the object, properly encoded.
     * <p>
     * 2) Remove from query the objects that were replaced.
     * <p>
     * 3) Append the correct method (HTTP or HTTPs).
     *
     * @param url
     * @param query
     * @return
     * @todo Do it all. Nothing is yet implemented.
     */
    private String parseUrl(String url, Map<String, Object> query) {
        return url;
    }
}