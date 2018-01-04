
package developers.com.br.poc_maxmilhas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fare_ {

    @SerializedName("totalsurcharge")
    @Expose
    private Integer totalsurcharge;
    @SerializedName("totalfare")
    @Expose
    private Integer totalfare;
    @SerializedName("totalbasefare")
    @Expose
    private Integer totalbasefare;
    @SerializedName("totalcommission")
    @Expose
    private Integer totalcommission;

    public Integer getTotalsurcharge() {
        return totalsurcharge;
    }

    public void setTotalsurcharge(Integer totalsurcharge) {
        this.totalsurcharge = totalsurcharge;
    }

    public Integer getTotalfare() {
        return totalfare;
    }

    public void setTotalfare(Integer totalfare) {
        this.totalfare = totalfare;
    }

    public Integer getTotalbasefare() {
        return totalbasefare;
    }

    public void setTotalbasefare(Integer totalbasefare) {
        this.totalbasefare = totalbasefare;
    }

    public Integer getTotalcommission() {
        return totalcommission;
    }

    public void setTotalcommission(Integer totalcommission) {
        this.totalcommission = totalcommission;
    }

}
