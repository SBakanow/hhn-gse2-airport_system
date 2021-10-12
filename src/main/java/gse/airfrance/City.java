package gse.airfrance;


/**
 * This class represents the City class for the airport management system.
 *
 * @author Denis Troccolo
 */
public final class City {
  private final Airport[] infrastructure = new Airport[5];
  private String name;
  private byte currentNumberOfInfrastructure = 0;

  /**
   * The constructor takes in the name of the city.
   *
   * @param name The name of the city.
   */
  public City(final String name) {
    this.name = name;
    System.out.println(this + " created.");
  }

  /**
   * Takes an airport as an argument and adds it to the list.
   * The list can hold a maximum of five airports, any attempt to add more
   * than that will do nothing.
   *
   * @param airport The airport to add.
   * @return True if the operation was successful, otherwise false.
   */
  public boolean addInfrastructure(final Airport airport) {
    if (currentNumberOfInfrastructure < infrastructure.length && airport != null) {
      infrastructure[currentNumberOfInfrastructure] = airport;
      ++currentNumberOfInfrastructure;
      return true;
    }
    return false;
  }

  /**
   * Get the list of airports.
   *
   * @return The list of airports.
   */
  public Airport[] getInfrastructure() {
    return infrastructure;
  }

  /**
   * Get the name of the city.
   *
   * @return The name of the city.
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name of the city.
   *
   * @param name of the city.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
    * Show the name of the city.
    */
  public void show() {
    System.out.println(name);
  }

  @Override
  public String toString() {
    return City.class.getSimpleName() + " " + name;
  }
}
