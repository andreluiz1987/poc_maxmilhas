package developers.com.br.poc_maxmilhas.model;

/**
 * Created by AndreCoelho on 03/01/2018.
 */

public class FlightSearch {

    private String origin;
    private String destination;
    private String dateDeparture;
    private String dateArrival;
    private String numberPassenger;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    public String getNumberPassenger() {
        return numberPassenger;
    }

    public void setNumberPassenger(String numberPassenger) {
        this.numberPassenger = numberPassenger;
    }
}
