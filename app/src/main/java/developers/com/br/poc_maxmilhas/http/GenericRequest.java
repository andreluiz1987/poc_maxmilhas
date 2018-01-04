package developers.com.br.poc_maxmilhas.http;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import developers.com.br.poc_maxmilhas.http.contracts.HttpHandlerContract;
import developers.com.br.poc_maxmilhas.http.contracts.HttpRequestContract;
import developers.com.br.poc_maxmilhas.services.RetrofitUtils;

/**
 * Created by AndreCoelho on 02/01/2018.
 */


public abstract class GenericRequest implements HttpRequestContract {

    private static final String TAG = "GenericRequest";
    private static final boolean D = true;

    /**
     * Instantiate the driver.
     */
    private static HttpDriver driver = new RetrofitDriver();

    /**
     * The base url. This must include the protocol used. If none is specified then
     * HTTP is used.
     */
    protected String BASE_URL = RetrofitUtils.BASE_URL;

    /**
     * Endpoint URL.
     */
    protected String URL = "";


    /**
     * The HTTP verb. Available options are POST and GET at the moment.
     */
    protected String method = "POST";


    /**
     * Default protocol to use (whether it is HTTP or HTTPS).
     */
    protected String protocol = "http";


    /**
     * Map containing all fields that will be sent along with the request.
     * Used for POST requests only.
     */
    protected Map<String,Object> fields = new HashMap<>();


    /**
     * Map containing a list of extra headers that will be sent along with the request.
     */
    protected Map<String,String> headers = new HashMap<>();


    /**
     * Map containing all query string parameters that will be sent along with the request.
     * This can be used for both GET and POST verbs.
     */
    protected Map<String,Object> query = new HashMap<>();

    /**
     * The http handler used to manage server response.
     */
    protected HttpHandlerContract handler = null;

    @Override
    public HttpRequestContract post() {
        this.method = "POST";
        return this;
    }

    @Override
    public HttpRequestContract get() {
        this.method = "GET";
        return this;
    }

    @Override
    public HttpRequestContract secure(boolean flag) {
        this.protocol = (flag) ? "https" : "http";
        return this;
    }

    @Override
    public HttpRequestContract withField(String key, Object value) {
        fields.put(key,value);
        return this;
    }

    @Override
    public HttpRequestContract withFields(Map<String, Object> fields) {
        this.fields.putAll(fields);
        return this;
    }

    @Override
    public HttpRequestContract withHeader(String key, String value) {
        headers.put(key,value);
        return this;
    }

    @Override
    public HttpRequestContract withHeaders(Map<String, String> headers) {
        this.headers.putAll(headers);
        return this;
    }

    @Override
    public HttpRequestContract withQuery(String key, String value) {
        query.put(key,value);
        return this;
    }

    @Override
    public HttpRequestContract withQueries(Map<String, String> queries) {
        this.query.putAll(queries);
        return this;
    }

    @Override
    public HttpRequestContract withHandler(HttpHandlerContract handler) {
        this.handler = handler;
        return this;
    }

    @Override
    public void send() {
        this.driver.send(BASE_URL + URL,method,fields,headers,query,handler,false);
    }

    /**
     * @param service
     * @return
     */
    @Override
    public HttpRequestContract service(String service) {

        try {
            Method method = this.getClass().getMethod("_" + service);
            method.invoke(this);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            if(handler != null) {
                handler.onRequestFailed("The service " + service + " was not found on this collection.",0);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            if(handler != null) {
                handler.onRequestFailed("The service " + service + " threw an exception when executing.",0);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            if(handler != null) {
                handler.onRequestFailed("The service " + service + " cannot be accessed.",0);
            }
        }

        return this;
    }
}
