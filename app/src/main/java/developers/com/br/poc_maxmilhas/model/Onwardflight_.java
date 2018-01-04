
package developers.com.br.poc_maxmilhas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Onwardflight_ {

    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("DepartureTime")
    @Expose
    private String departureTime;
    @SerializedName("flightcode")
    @Expose
    private String flightcode;
    @SerializedName("Group")
    @Expose
    private String group;
    @SerializedName("farebasis")
    @Expose
    private String farebasis;
    @SerializedName("depterminal")
    @Expose
    private String depterminal;
    @SerializedName("holdflag")
    @Expose
    private String holdflag;
    @SerializedName("deptime")
    @Expose
    private String deptime;
    @SerializedName("codeshare")
    @Expose
    private String codeshare;
    @SerializedName("ibibopartner")
    @Expose
    private String ibibopartner;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("platingcarrier")
    @Expose
    private String platingcarrier;
    @SerializedName("qtype")
    @Expose
    private String qtype;
    @SerializedName("arrterminal")
    @Expose
    private String arrterminal;
    @SerializedName("flightno")
    @Expose
    private String flightno;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("FlHash")
    @Expose
    private String flHash;
    @SerializedName("stops")
    @Expose
    private String stops;
    @SerializedName("seatsavailable")
    @Expose
    private String seatsavailable;
    @SerializedName("carrierid")
    @Expose
    private String carrierid;
    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("PromotionId")
    @Expose
    private String promotionId;
    @SerializedName("fare")
    @Expose
    private Fare_ fare;
    @SerializedName("CabinClass")
    @Expose
    private String cabinClass;
    @SerializedName("warnings")
    @Expose
    private String warnings;
    @SerializedName("ArrivalTime")
    @Expose
    private String arrivalTime;
    @SerializedName("onwardflights")
    @Expose
    private List<Object> onwardflights = null;
    @SerializedName("aircraftType")
    @Expose
    private String aircraftType;
    @SerializedName("operatingcarrier")
    @Expose
    private String operatingcarrier;
    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("internationalsearch")
    @Expose
    private String internationalsearch;
    @SerializedName("splitduration")
    @Expose
    private String splitduration;
    @SerializedName("bookingclass")
    @Expose
    private String bookingclass;
    @SerializedName("DataSource")
    @Expose
    private String dataSource;
    @SerializedName("multicitysearch")
    @Expose
    private String multicitysearch;
    @SerializedName("depdate")
    @Expose
    private String depdate;
    @SerializedName("arrtime")
    @Expose
    private String arrtime;
    @SerializedName("arrdate")
    @Expose
    private String arrdate;
    @SerializedName("TravelTime")
    @Expose
    private String travelTime;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getFlightcode() {
        return flightcode;
    }

    public void setFlightcode(String flightcode) {
        this.flightcode = flightcode;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFarebasis() {
        return farebasis;
    }

    public void setFarebasis(String farebasis) {
        this.farebasis = farebasis;
    }

    public String getDepterminal() {
        return depterminal;
    }

    public void setDepterminal(String depterminal) {
        this.depterminal = depterminal;
    }

    public String getHoldflag() {
        return holdflag;
    }

    public void setHoldflag(String holdflag) {
        this.holdflag = holdflag;
    }

    public String getDeptime() {
        return deptime;
    }

    public void setDeptime(String deptime) {
        this.deptime = deptime;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public void setCodeshare(String codeshare) {
        this.codeshare = codeshare;
    }

    public String getIbibopartner() {
        return ibibopartner;
    }

    public void setIbibopartner(String ibibopartner) {
        this.ibibopartner = ibibopartner;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPlatingcarrier() {
        return platingcarrier;
    }

    public void setPlatingcarrier(String platingcarrier) {
        this.platingcarrier = platingcarrier;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    public String getArrterminal() {
        return arrterminal;
    }

    public void setArrterminal(String arrterminal) {
        this.arrterminal = arrterminal;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlHash() {
        return flHash;
    }

    public void setFlHash(String flHash) {
        this.flHash = flHash;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public String getSeatsavailable() {
        return seatsavailable;
    }

    public void setSeatsavailable(String seatsavailable) {
        this.seatsavailable = seatsavailable;
    }

    public String getCarrierid() {
        return carrierid;
    }

    public void setCarrierid(String carrierid) {
        this.carrierid = carrierid;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public Fare_ getFare() {
        return fare;
    }

    public void setFare(Fare_ fare) {
        this.fare = fare;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public List<Object> getOnwardflights() {
        return onwardflights;
    }

    public void setOnwardflights(List<Object> onwardflights) {
        this.onwardflights = onwardflights;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getOperatingcarrier() {
        return operatingcarrier;
    }

    public void setOperatingcarrier(String operatingcarrier) {
        this.operatingcarrier = operatingcarrier;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getInternationalsearch() {
        return internationalsearch;
    }

    public void setInternationalsearch(String internationalsearch) {
        this.internationalsearch = internationalsearch;
    }

    public String getSplitduration() {
        return splitduration;
    }

    public void setSplitduration(String splitduration) {
        this.splitduration = splitduration;
    }

    public String getBookingclass() {
        return bookingclass;
    }

    public void setBookingclass(String bookingclass) {
        this.bookingclass = bookingclass;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getMulticitysearch() {
        return multicitysearch;
    }

    public void setMulticitysearch(String multicitysearch) {
        this.multicitysearch = multicitysearch;
    }

    public String getDepdate() {
        return depdate;
    }

    public void setDepdate(String depdate) {
        this.depdate = depdate;
    }

    public String getArrtime() {
        return arrtime;
    }

    public void setArrtime(String arrtime) {
        this.arrtime = arrtime;
    }

    public String getArrdate() {
        return arrdate;
    }

    public void setArrdate(String arrdate) {
        this.arrdate = arrdate;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

}
