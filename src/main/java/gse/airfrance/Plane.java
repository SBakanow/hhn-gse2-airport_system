package gse.airfrance;

import java.util.ArrayList;

/**
 * Class that represents a plane in the air transportation planning system.
 *
 * @author Emin Hallaceli
 */
public class Plane {

  private static final int MAX_NUM_OF_SEATS = 853;

  private final String model;
  private final String serialNum;
  private final Seat[] theSeats = new Seat[MAX_NUM_OF_SEATS];
  private final ArrayList<Flight> missions = new ArrayList<>();

  private String tailNr;
  private double hoursFlown;
  private int numberOfSeats;

  /**
   * Constructor for a plane in an air transportation planning system.
   *
   * @param model     the model of the plane.
   * @param serialNum the serial number of the plane.
   * @param tailNr    the tail number of the plane.
   */
  public Plane(final String model, final String serialNum, final String tailNr) {
    this.model = model;
    this.serialNum = serialNum;
    this.tailNr = tailNr;
    hoursFlown = 0.0;
    numberOfSeats = 0;
    System.out.println(this + " created");
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
   * @return false if
   *<ul>
   *   <li>the given seat is a null reference</li>
   *   <li>the maximum number of seats is already reached</li>
   *</ul> otherwise true
   */
  public boolean addSeat(final Seat seat) {
    if (seat == null || numberOfSeats == MAX_NUM_OF_SEATS) {
      return false;
    }

    theSeats[numberOfSeats] = seat;
    numberOfSeats++;
    return true;
  }

  /**
   * Adds a mission to the list of missions.
   *
   * @param mission the mission to add.
   */
  public void addMission(final Flight mission) {
    missions.add(mission);
  }

  public void setTailNr(String tailNr) {
    this.tailNr = tailNr;
  }

  public void setHoursFlown(double hours) {
    hoursFlown = hours;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + model + " serialNum:" + serialNum
        + " tailNr:" + tailNr;
  }

  public void use() {
    System.out.println(this + "is used");
  }
}
