package gse.airfrance;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The flight class for the airport management system.
 *
 * @author Marvin Simon
 * @version 0.1
 */
public class Flight {

  private final short MAX_NUMBER_OF_PASSES_PER_FLIGHT = 853;
  private final byte MAX_NUMBER_STOPS = 5;
  private final byte MAX_NUMBER_CO_PILOTS = 2;
  private final LocalDateTime localDateTime;
  private final String flightNum;

  private final BoardingPass[] theBoardingPasses =
      new BoardingPass[MAX_NUMBER_OF_PASSES_PER_FLIGHT];
  private final Airport[] origins = new Airport[MAX_NUMBER_STOPS];
  private final Airport[] destinations = new Airport[MAX_NUMBER_STOPS];
  private final Pilot[] coPilots = new Pilot[MAX_NUMBER_CO_PILOTS];
  private Pilot captain;
  private Plane resource;
  private Airline theAirline;

  private int currentNumberOrigins = 0;
  private int currentNumberDestinations = 0;
  private int currentNumberCoPilots = 0;
  private int currentNumberOfPasses = 0;

  public Flight(LocalDateTime localDateTime, String flightNum) {
    this.localDateTime = localDateTime;
    this.flightNum = flightNum;
    System.out.println(this + " created.");
  }

  // Begin of the getters

  public LocalDateTime getLocalDate() {
    return localDateTime;
  }

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

  public BoardingPass[] getTheBoardingPasses() {
    return theBoardingPasses;
  }

  public Airport[] getDestinations() {
    return destinations;
  }

  public Airport[] getOrigins() {
    return origins;
  }

  public String getFlightNum() {
    return flightNum;
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
   * There can be at max 5 stopovers.
   * The stopover must be a valid airport, not a null reference.
   *
   * @param origin Origin Airport
   * @return True if the origin was successfully added.
   */
  public boolean addOrigin(Airport origin) {
    boolean result = false;
    if (origin != null && currentNumberOrigins < MAX_NUMBER_STOPS) {
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
    if (destination != null && currentNumberDestinations < MAX_NUMBER_STOPS) {
      destinations[currentNumberDestinations] = destination;
      currentNumberDestinations++;
      result = true;
    }
    return result;
  }

  /**
   * Every plane has a different capacity of seats, but with the AIRBUS380 we got a maximum of 853.
   * This method can be used to add a seat to the flight.
   * There can be no more than 853 seats.
   * There is no check with the machine used if max capacity is reached/over capacity.
   * There must not be a seat added with a null reference.
   *
   * @param pass Seat to be added (one at a time)
   * @return True if the action was successful, else false.
   */
  public boolean addBoardingPass(BoardingPass pass) {
    boolean result = false;
    if (pass != null && currentNumberOfPasses < MAX_NUMBER_OF_PASSES_PER_FLIGHT) {
      theBoardingPasses[currentNumberOfPasses] = pass;
      currentNumberOfPasses++;
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
    if (coPilot != null && currentNumberCoPilots < MAX_NUMBER_CO_PILOTS) {
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
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " number " + flightNum + " starting at "
        + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
  }

  /**
   * Prints the flight and a note that the flight is delayed.
   */
  public void delayed() {
    System.out.println(this + " is delayed!");
  }

  /**
   * Prints the flight and a note that the flight is canceled.
   */
  public void canceled() {
    System.out.println(this + " is canceled.");
  }

  public void show() {
    int boardingPassCount = 0;
    System.out.println("Flight " + flightNum + " on "
        + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
    theAirline.show();
    System.out.print("Flown by ");
    captain.show();
    if (currentNumberCoPilots != 0) {
      for (var coPilot : coPilots) {
        if (coPilot != null) {
          System.out.print(" and ");
          coPilot.show();
        }
      }
    }
    System.out.println();
    System.out.print("departing ");
    origins[0].show();
    System.out.print("arriving ");
    destinations[0].show();
    System.out.print("using ");
    resource.show();
    System.out.print("Carrying passengers ");
    for (var boardingPass : theBoardingPasses) {
      if (boardingPass != null) {
        if (boardingPassCount != 0) {
          System.out.print(" and ");
        }
        boardingPass.show();
        boardingPassCount++;
      }
    }
  }
}
