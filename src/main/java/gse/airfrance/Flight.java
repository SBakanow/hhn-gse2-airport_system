package gse.airfrance;

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
  private final int flightNum;

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

  public Flight(Date date, int flightNum) {
    this.date = date;
    this.flightNum = flightNum;
    System.out.println(this + " created");
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

  public int getFlightNum() {
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

  /**
   * Set the captain of the flight.
   *
   * @param captain Set the captain of the flight
   */
  public void setCaptain(Pilot captain) {
    this.captain = captain;
  }

  /**
   * Set the airline which is advertising the flight.
   *
   * @param theAirline Airline which advertised the flight
   */
  public void setTheAirline(Airline theAirline) {
    this.theAirline = theAirline;
  }

  /**
   * Add origin airports to the flight.
   * There can be more than one origin airport because stopovers are possible.
   * There can be at max 5 stop overs.
   * The stopover must be a valid airport, not a null reference.
   *
   * @param origin Origin Airport
   * @return True if the origin was successfully added.
   */
  public boolean addOrigin(Airport origin) {
    boolean result = false;
    if(origin != null && currentNumberOrigins < MAX_NUMBER_STOPS) {
      origins[currentNumberOrigins] = origin;
      currentNumberOrigins++;
      result = true;
    }
    return result;
  }

  /**
   * Add destination airports to the flight.
   * There can be more than one destination airport because stopovers are possible.
   * There can be at max 5 stop overs.
   * The stopover must be a valid airport, not a null reference.
   *
   * @param destination Destination Airport
   * @return True if the destination was successfully added.
   */
  public boolean addDestination(Airport destination) {
    boolean result = false;
    if(destination != null && currentNumberDestinations < MAX_NUMBER_STOPS) {
      destinations[currentNumberDestinations] = destination;
      currentNumberDestinations++;
      result = true;
    }
    return result;
  }

  /**
   * Every plane has a different capacity of passengers, but with the AIRBUS370 we got a maximum of 853.
   * This method can be used to add a passenger to the flight.
   * There can be no more than 853 passengers.
   * There is no check with the machine used if max capacity is reached/over capacity.
   * There can be no passanger added with a null reference.
   *
   * @param passenger Passenger to be added (one at a time)
   * @return True if the action was successful, else false.
   */
  public boolean addPassenger(Passenger passenger) {
    boolean result = false;
    if(passenger != null && currentNumberPassengers < MAX_NUMBER_PASSENGERS) {
      thePassengers[currentNumberPassengers] = passenger;
      currentNumberPassengers++;
      result = true;
    }
    return result;
  }

  /**
   * Every flight needs at least one co-pilot but at most 2.
   * This function is to add the co-pilots.
   * No null references possible.
   *
   * @param coPilot Co-Pilot to be added.
   * @return True if the action was successful, else false
   */
  public boolean addCoPilot(Pilot coPilot) {
    boolean result = false;
    if(coPilot != null && currentNumberCoPilots < MAX_NUMBER_CO_PILOTS) {
      coPilots[currentNumberCoPilots] = coPilot;
      currentNumberCoPilots++;
      result = true;
    }
    return result;
  }

  /**
   * Method sends back a String of the flight with the number and date it will be performed.
   *
   * @return String of the flight
   */
  public String toString() {
    return this.getClass().getSimpleName() + " number "+ flightNum + " starting at " + date.toString();
  }

  public void setDelayed(boolean delayed) {
    this.delayed = delayed;
  }

  /**
   * Prints the flight and a note if the flight is delayed or in time/schedule.
   *
   * @return Returns the value of delayed
   */
  public boolean delayed() {
    String out = this.toString();
    out += delayed ? " is delayed!" : " is not delayed!";
    System.out.println(out);

    return delayed;
  }
}
