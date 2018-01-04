package developers.com.br.poc_maxmilhas.http;

import developers.com.br.poc_maxmilhas.http.contracts.HttpRequestContract;

/**
 * Created by AndreCoelho on 02/01/2018.
 */


public abstract class HttpService {

    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";

    private HttpRequestContract service = null;

    /**
     * Creates a new request given a specific class. This service is intended to be
     * used for general purposes meaning that all HTTP Requests must be passed through
     * this class.
     *
     * @param service
     */
    public static HttpRequestContract request(Class<? extends HttpRequestContract> service) {
        try {
            HttpRequestContract instance = service.newInstance();
            return instance;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
