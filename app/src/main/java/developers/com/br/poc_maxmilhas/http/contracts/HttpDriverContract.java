package developers.com.br.poc_maxmilhas.http.contracts;

import java.util.Map;

/**
 * Created by AndreCoelho on 02/01/2018.
 */

public interface HttpDriverContract {

    void send(String url,
              String method,
              Map<String,Object> fields,
              Map<String,String> headers,
              Map<String,Object> query,
              HttpHandlerContract handler,
              boolean download);
}
