package gse.airfrance;

import java.util.ArrayList;

/**
 * Class that represents a plane in the air transportation planning system.
 *
 * @author Emin Hallaceli
 */
public class Plane {

  private static final int MAX_NUM_OF_SEATS = 853;
  private static final int MIN_NUM_OF_SEATS = 10;

  private final String model;
  private final String serialNum;
  private final String tailNr;
  private final Seat[] theSeats = new Seat[MAX_NUM_OF_SEATS];

  private double hoursFlown;
  private ArrayList<Flight> missions;

  /**
   * Constructor for a plane.
   */
  public Plane(final String model, final String serialNum, final String tailNr) {
    this.model = model;
    this.serialNum = serialNum;
    this.tailNr = tailNr;
    hoursFlown = 0;
    missions = new ArrayList<>();
    System.out.println(this.toString() + " created");
  }

  // Start of getters
  public String getModel() {
    return model;
  }

  public String getSerialNum() {
    return serialNum;
  }

  public String getTailNr() {
    return tailNr;
  }

  public Seat[] getTheSeats() {
    return theSeats;
  }

  public double getHoursFlown() {
    return hoursFlown;
  }

  public ArrayList<Flight> getMissions() {
    return missions;
  }

  // Start of setters/"adders"
  /**
   * Adds a seat to the list of seats.
   *
   * @param seat      seat to add.
   * @param position  position of the added seat.
   * @return false if
   *<ul>
   *   <li>the given seat is a null reference</li>
   *   <li>the position is greater then the max number of seats</li>
   *   <li>a seat already exists on the given position</li>
   *</ul> otherwise true
   */
  public boolean addSeat(final Seat seat, final int position) {
    if (seat == null || position < MAX_NUM_OF_SEATS || theSeats[position] != null) {
      return false;
    }

    theSeats[position] = seat;
    return true;
  }
}
