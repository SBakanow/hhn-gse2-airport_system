package gse.airfrance;

/**
 * Seat class for AirFrance Project
 *
 * @author Dennis Schneider
 */

public class Seat {

  private final String location;
  private Passenger thePassenger;
  private Flight theFlight;


  private Plane thePlane;

  public Seat(String location) {
    this.location = location;
    System.out.println(this + " created.");
  }

  /**
   * Getter Class for the location of the Seat
   *
   * @return Seat ID
   */
  public String getLocation() {
    return location;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + location;
  }

  /**
   * Cancels reservation of seat
   */
  public void reserve() {
    System.out.println(this + " reserved.");
  }

  public Passenger getThePassenger() {
    return thePassenger;
  }

  public void setThePassenger(Passenger thePassenger) {
    this.thePassenger = thePassenger;
  }

  public Flight getTheFlight() {
    return theFlight;
  }

  public void setTheFlight(Flight theFlight) {
    this.theFlight = theFlight;
  }

  public Plane getThePlane() {
    return thePlane;
  }

  public void setThePlane(Plane thePlane) {
    this.thePlane = thePlane;
  }
}
