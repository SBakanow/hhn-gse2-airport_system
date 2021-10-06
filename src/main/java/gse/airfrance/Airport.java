package gse.airfrance;

import java.util.ArrayList;
import java.util.List;

/**
 * The airport class for the airport management system.
 *
 * @author Noah Schmidt
 */
public final class Airport {

  //Max
  private final byte MAX_NUMBER_CITIES = 3;

  //Airport
  private String name;
  private final String IATACode;

  //List
  private final List<Flight> departures = new ArrayList<>();
  private final List<Flight> arrivals = new ArrayList<>();
  private final City[] catchments = new City[MAX_NUMBER_CITIES];


  //Counter
  private int currentNumberCities = 0;

  /**
   * The constructor takes the name, IATACode.
   *
   * @param name     The name of this Airline
   * @param IATACode The IATACode associated with the Airport
   */
  public Airport(final String name, final String IATACode) {
    this.name = name;
    this.IATACode = IATACode;
    System.out.println(this + " created.");
  }
  
  /**
   * Get the name of the airport.
   *
   * @return The name of the airport.
   */
  public String getName() {
    return name;
  }

  /**
   * Get the IATACode.
   *
   * @return The IATACode.
   */
  public String getIATACode() {
    return IATACode;
  }

  /**
   * Get a list of departures.
   *
   * @return List of departures.
   */
  public List<Flight> getDepartures() {
    return departures;
  }

  /**
   * Get a List of arrivals.
   *
   * @return List of arrivals.
   */
  public List<Flight> getArrivals() {
    return arrivals;
  }

  /**
   * Get a list of catchments.
   *
   * @return List of Cities.
   */
  public City[] getCatchments() {
    return catchments;
  }

  /**
   * Set the name of the Airport.
   *
   * @param name The new name for the airport.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Add a departure to the list.
   *
   * @param departure Flight to be added.
   */
  public void addDeparture(final Flight departure) {
    departures.add(departure);
  }

  /**
   * Add an arrival to the list.
   *
   * @param arrival Flight to be added.
   */
  public void addArrival(final Flight arrival) {
    arrivals.add(arrival);
  }

  /**
   * Add a city to the list.
   *
   * @param catchment City to be added.
   * @return true if the current number of cities is not above the max number.
   */
  public boolean addCatchment(City catchment) {
    boolean result = false;
    if (catchment != null && currentNumberCities < MAX_NUMBER_CITIES) {
      catchments[currentNumberCities] = catchment;
      currentNumberCities++;
      result = true;
    }
    return result;
  }

  /**
   * Method sends back a String of the airports name and IATACode.
   *
   * @return String of the airport.
   */
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + name + " " + IATACode;
  }

  public void show() {
    System.out.print(name + " (" + IATACode + ")" + " near ");
    catchments[0].show();
  }
}
