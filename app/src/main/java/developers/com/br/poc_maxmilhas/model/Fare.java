
package developers.com.br.poc_maxmilhas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fare {

    @SerializedName("grossamount")
    @Expose
    private Integer grossamount;
    @SerializedName("totalbasefare")
    @Expose
    private Integer totalbasefare;
    @SerializedName("adultbasefare")
    @Expose
    private Integer adultbasefare;
    @SerializedName("totalfare")
    @Expose
    private Integer totalfare;
    @SerializedName("totalsurcharge")
    @Expose
    private Integer totalsurcharge;
    @SerializedName("adulttotalfare")
    @Expose
    private Integer adulttotalfare;
    @SerializedName("totalcommission")
    @Expose
    private String totalcommission;

    public Integer getGrossamount() {
        return grossamount;
    }

    public void setGrossamount(Integer grossamount) {
        this.grossamount = grossamount;
    }

    public Integer getTotalbasefare() {
        return totalbasefare;
    }

    public void setTotalbasefare(Integer totalbasefare) {
        this.totalbasefare = totalbasefare;
    }

    public Integer getAdultbasefare() {
        return adultbasefare;
    }

    public void setAdultbasefare(Integer adultbasefare) {
        this.adultbasefare = adultbasefare;
    }

    public Integer getTotalfare() {
        return totalfare;
    }

    public void setTotalfare(Integer totalfare) {
        this.totalfare = totalfare;
    }

    public Integer getTotalsurcharge() {
        return totalsurcharge;
    }

    public void setTotalsurcharge(Integer totalsurcharge) {
        this.totalsurcharge = totalsurcharge;
    }

    public Integer getAdulttotalfare() {
        return adulttotalfare;
    }

    public void setAdulttotalfare(Integer adulttotalfare) {
        this.adulttotalfare = adulttotalfare;
    }

    public String getTotalcommission() {
        return totalcommission;
    }

    public void setTotalcommission(String totalcommission) {
        this.totalcommission = totalcommission;
    }

}
