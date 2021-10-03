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

}
