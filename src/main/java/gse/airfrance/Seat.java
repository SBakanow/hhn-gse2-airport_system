package gse.airfrance;

/**
 * Seat class for AirFrance Project.
 *
 * @author Dennis Schneider
 */

public class Seat {

  private final String location;
  private final int row;
  private final char seat;

  
  private Plane thePlane;

  public Seat(String location, int row, char seat) {
    this.location = location;
    this.row = row;
    this.seat = seat;
    System.out.println(this + " created.");
  }

  /**
   * Getter Class for the location of the Seat.
   *
   * @return Seat ID
   */
  public String getLocation() {
    return location;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + location + " " + seat + row;
  }

  /**
   * Cancels reservation of seat.
   */
  public void reserve(Passenger passenger, Flight flight) {
    System.out.println(passenger + " reserved seat for : " + flight);
  }


  public Plane getThePlane() {
    return thePlane;
  }

  public int getRow() {
    return row;
  }

  public char getSeat() {
    return seat;
  }

  public void setThePlane(Plane thePlane) {
    this.thePlane = thePlane;
  }

  public void show() {
    System.out.print(" on seat " + row + seat);
  }
}
