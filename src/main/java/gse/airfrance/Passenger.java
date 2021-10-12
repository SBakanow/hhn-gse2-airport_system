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
  private final ArrayList<BoardingPass> theBoardingPasses = new ArrayList<>();

  //Passenger Builder
  public Passenger(String name) {
    this.name = name;
    System.out.println(this + " created.");
  }

  public void addBoardingPass(BoardingPass boardingPass) {
    theBoardingPasses.add(boardingPass);
  }

  public ArrayList<BoardingPass> getTheBoardingPasses() {
    return theBoardingPasses;
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

  public void show() {
    System.out.print(name);
  }
}
