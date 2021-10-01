package GSE.AirFrance;

import java.util.Date;
/**
 * The flight class for the airport management system
 *
 * @author Marvin Simon
 * @version 0.1
 */
public class Flight {
    private final short MAX_NUMBER_PASSENGERS = 853;
    private final byte MAX_NUMBER_STOPS = 5;
    private final byte MAX_NUMBER_CO_PILOTS= 2;
    private final Date date;
    private final short flightNum; //GSE.AirFrance.Flight number 1 to 4 digits long means 16bit should be enough (65536)

    private Passenger[] thePassengers = new Passenger[MAX_NUMBER_PASSENGERS];
    private Airport[] origins = new Airport[5];
    private Airport[] destinations = new Airport[5];
    private Pilot[] coPilots = new Pilot[2];
    private Pilot captain;
    private Plane resource;
    private Airline theAirline;

    private int currentNumberOrigins = 0;
    private int currentNumberDestinations = 0;
    private int currentNumberCoPilots = 0;
    private int currentNumberPassengers = 0;

    private boolean delayed = false;

    public Flight(Date date, short flightNum) {
        this.date = date;
        this.flightNum = flightNum;
    }

    // Begin of the getters
    public Plane getResource() {
        return resource;
    }

    public Pilot getCaptain() {
        return captain;
    }

    public Pilot[] getCoPilots() {
        return coPilots;
    }

    public Airline getTheAirline() {
        return theAirline;
    }

    public Passenger[] getThePassengers() {
        return thePassengers;
    }

    public Airport[] getDestinations() {
        return destinations;
    }

    public Airport[] getOrigins() {
        return origins;
    }

    public short getFlightNum() {
        return flightNum;
    }

    public Date getDate() {
        return date;
    }

    public boolean isDelayed() {
        return delayed;
    }

    // Begin of the setters
    public void setResource(Plane resource) {
        this.resource = resource;
    }

    public void setCaptain(Pilot captain) {
        this.captain = captain;
    }

    public void setTheAirline(Airline theAirline) {
        this.theAirline = theAirline;
    }

    public boolean addOrigin(Airport origin) {
        boolean result = false;
        if(origin != null && currentNumberOrigins < MAX_NUMBER_STOPS) {
            origins[currentNumberOrigins] = origin;
            currentNumberOrigins++;
            result = true;
        }
        return result;
    }

    public boolean addDestination(Airport destination) {
        boolean result = false;
        if(destination != null && currentNumberDestinations < MAX_NUMBER_STOPS) {
            destinations[currentNumberDestinations] = destination;
            currentNumberDestinations++;
            result = true;
        }
        return result;
    }

    public boolean addPassenger(Passenger passenger) {
        boolean result = false;
        if(passenger != null && currentNumberPassengers < MAX_NUMBER_PASSENGERS) {
            thePassengers[currentNumberPassengers] = passenger;
            currentNumberPassengers++;
            result = true;
        }
        return result;
    }

    public boolean addCoPilot(Pilot coPilot) {
        boolean result = false;
        if(coPilot != null && currentNumberCoPilots < MAX_NUMBER_CO_PILOTS) {
            coPilots[currentNumberCoPilots] = coPilot;
            currentNumberCoPilots++;
            result = true;
        }
        return result;
    }

    public String toString() {
        return this.getClass().getTypeName() + " " + this.getClass().getSimpleName();
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }
}
