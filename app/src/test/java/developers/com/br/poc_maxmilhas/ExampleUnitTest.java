package developers.com.br.poc_maxmilhas;

import org.junit.Test;

import developers.com.br.poc_maxmilhas.http.HttpService;
import developers.com.br.poc_maxmilhas.http.SynchronizationServices;
import developers.com.br.poc_maxmilhas.model.Constants;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void validRequest() throws Exception{

        HttpService.request(SynchronizationServices.class)
                .service("filter")
                .get()
                .withField(Constants.GoibiboAPI.APP_ID, Constants.GoibiboAPI.APPLICATION_ID)
                .withField(Constants.GoibiboAPI.APP_KEY, Constants.GoibiboAPI.APPLICATION_KEYS)
                .withField(Constants.FlighSearcjAPI.SOURCE, "CNF")
                .withField(Constants.FlighSearcjAPI.DESTINATION, "CGH")
                .withField(Constants.FlighSearcjAPI.DATE_OF_DEPARTURE, "20180212")
                .withField(Constants.FlighSearcjAPI.DATE_OF_ARRIVAL, "")
                .withField("seatingclass", "E")
                .withField("adults", "1")
                .withField("infants", "0")
                .withField("counter", "0")
                .send();
    }
}