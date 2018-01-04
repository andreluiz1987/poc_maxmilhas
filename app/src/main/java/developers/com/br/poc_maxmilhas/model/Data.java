
package developers.com.br.poc_maxmilhas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("returnflights")
    @Expose
    private List<Object> returnflights = null;
    @SerializedName("onwardflights")
    @Expose
    private List<Onwardflight> onwardflights = null;

    public List<Object> getReturnflights() {
        return returnflights;
    }

    public void setReturnflights(List<Object> returnflights) {
        this.returnflights = returnflights;
    }

    public List<Onwardflight> getOnwardflights() {
        return onwardflights;
    }

    public void setOnwardflights(List<Onwardflight> onwardflights) {
        this.onwardflights = onwardflights;
    }

}
