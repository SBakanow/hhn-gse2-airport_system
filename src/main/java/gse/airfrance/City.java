package gse.airfrance;


/**
 * This class represents the City class for the airport management system.
 *
 * @author Denis Troccolo
 */
public final class City {
  /**
   * The constructor takes in the name of the city.
   *
   * @param name The name of the city.
   */
  public City(final String name) {
    infrastructures = new Airport[5];
    this.name = name;
    arrayPosition = 0;
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
    if (arrayPosition < infrastructures.length && airport != null) {
      infrastructures[arrayPosition] = airport;
      ++arrayPosition;
      return true;
    }
    return false;
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
   * Get the list of airports.
   *
   * @return The list of airports.
   */
  public Airport[] getInfrastructures() {
    return infrastructures;
  }

  /**
   * Get the name of the city.
   *
   * @return The name of the city.
   */
  public String getName() {
    return name;
  }


  @Override
  public String toString() {
    return String.format(City.class.getSimpleName() + " " + name);
  }


  private final Airport[] infrastructures;
  private String name;
  // Since Java can't do local static, we need a private position field to
  // know where in the static array we are and to make sure not to go out
  // of bounds when we try to add more elements into the array than possible.
  private byte arrayPosition;

  public void show() {
    System.out.println(name);
  }
}
