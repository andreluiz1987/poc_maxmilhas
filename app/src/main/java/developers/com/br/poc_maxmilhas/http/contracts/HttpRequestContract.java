package developers.com.br.poc_maxmilhas.http.contracts;

import java.util.Map;

/**
 * Created by AndreCoelho on 02/01/2018.
 */


public interface HttpRequestContract {

    /**
     * Forces a POST request.
     * @return
     */
    HttpRequestContract post();


    /**
     * Forces a GET request. For get requests no body data is sent
     * along.
     * @return
     */
    HttpRequestContract get();


    /**
     * Forces a HTTS request.
     *
     * @param flag
     * @return
     */
    HttpRequestContract secure(boolean flag);

    /**
     * Adds an extra field to the request.
     *
     * @param key       the key name as it will be retrieved on the server.
     * @param value     the data.
     * @return
     */
    HttpRequestContract withField(String key, Object value);


    /**
     * Adds several extra field to the request.
     *
     * @param fields Map containing all extra fields.
     * @return
     */
    HttpRequestContract withFields(Map<String,Object> fields);


    /**
     * Add an extra header to the request.
     * @param key   The header name.
     * @param value The header value.
     * @return
     */
    HttpRequestContract withHeader(String key, String value);


    /**
     * Adds several extra field to the request.
     *
     * @param headers Map containing all extra headers.
     * @return
     */
    HttpRequestContract withHeaders(Map<String,String> headers);


    /**
     * Add an extra query string parameter to the request url.
     * @param key   the query string name
     * @param value the query string value.
     * @return
     */
    HttpRequestContract withQuery(String key, String value);


    /**
     * Adds several extra query strings to the request.
     * @param queries
     * @return
     */
    HttpRequestContract withQueries(Map<String,String> queries);

    /**
     * Sets the handler that will be used when interpreting the request.
     * @return
     */
    HttpRequestContract withHandler(HttpHandlerContract handler);

    /**
     * The service requested from the server.
     *
     * @param service
     * @return
     */
    HttpRequestContract service(String service);

    /**
     * Sends the request.
     */
    void send();
}