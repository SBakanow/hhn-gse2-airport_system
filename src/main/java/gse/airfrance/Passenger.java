package gse.airfrance;

import java.util.ArrayList;

/**
 * Passenger Class for AirFrance Project.
 *
 * @author Dennis Adler
 */
public class Passenger {

  private String name;
  //Seat List
  private final ArrayList<Seat> theSeats = new ArrayList<>();
  
  //Passenger Builder
  public Passenger(String name) {
    this.name = name;
    System.out.println(this + " created.");
  }
  
  //get Passenger Name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //toString Method
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + name;
  }
}
