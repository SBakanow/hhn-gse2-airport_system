package gse.airfrance;

/**
 * Seat class for AirFrance Project
 *
 * @author Dennis Schneider
 */

public class Seat {

  final String location;
  boolean reserved = false;

  public Seat(String location) {
    this.location = location;
    System.out.println(this + " created");
  }

  /**
   * Getter Class for the location of the Seat
   *
   * @return Seat ID
   */
  public String getLocation() {
    return location;
  }
  public boolean getReserved(){
    return reserved;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + getLocation();
  }

  /**
   * Marks a seat as reserved
   */
  public void reserveSeat() {
    reserved = true;
    System.out.println(this + "is reserved");
  }

  /**
   * Cancels reservation of seat
   */
  public void cancelReservation(){
    reserved = false;
    System.out.println(this + "was canceled ");
  }
}
