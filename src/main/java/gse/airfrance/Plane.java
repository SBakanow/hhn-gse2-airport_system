package gse.airfrance;

/**
 * Class that represents a plane in the air transportation planning system.
 *
 * @author Emin Hallaceli
 */
public class Plane {

  private final String model;
  private final String serialNum;
  private final String tailNr;

  private double hoursFlown;

  /**
   * Constructor for a plane.
   */
  public Plane(final String model, final String serialNum, final String tailNr) {
    this.model = model;
    this.serialNum = serialNum;
    this.tailNr = tailNr;
    hoursFlown = 0;
  }

}
