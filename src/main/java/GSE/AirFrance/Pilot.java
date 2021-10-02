package GSE.AirFrance;

import java.util.HashSet;
import java.util.Set;

/**
 * The pilot class for the airport management system.
 *
 * @author Sergej Bakanow
 */

public class Pilot {

  /**
   * The name of the pilot.
   */
  private String name;
  /**
   * The Airline the pilot works for.
   */
  private Airline employer;
  /**
   * The different flight assignments the pilot has.
   */
  private Set<Flight> assignments = new HashSet<>();

  public Pilot() {
    System.out.println(this + " created");
  }

  /**
   * Returns the name of the pilot.
   * @return The name of the pilot.
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the airline the pilot works for.
   * @return the airline the pilot works for.
   */
  public Airline getEmployer() {
    return employer;
  }

  /**
   * Returns all flight assignments of the pilot.
   * @return ALl flight assignments of the pilot.
   */
  public Set<Flight> getAssignments() {
    return assignments;
  }

  /**
   * Sets the name of the pilot.
   * @param name The name of the pilot.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the airline the pilot works for.
   * @param employer The airline the pilot works for.
   */
  public void setEmployer(Airline employer) {
    this.employer = employer;
  }

  /**
   * Adds flight assignment for the pilot.
   * @param assignment The flight assignment for the pilot.
   */
  public void addAssignment(Flight assignment) {
    assignments.add(assignment);
  }

  /**
   * Returns the class and pilot name as String.
   * @return The class and pilot name.
   */
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + getName();
  }

  /**
   * Hires a pilot.
   */
  public void hire() {
    System.out.println(this + " is hired");
  }

  /**
   * Fires a pilot.
   */
  public void fire() {
    System.out.println(this + " is fired");
  }
}

