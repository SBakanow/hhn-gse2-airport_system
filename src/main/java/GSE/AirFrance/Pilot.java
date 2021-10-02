package GSE.AirFrance;

import java.util.HashSet;
import java.util.Set;

/**
 * The pilot class for the airport management system.
 *
 * @author Sergej Bakanow
 */

public class Pilot {

  private String name;
  private Airline employer;
  private Set<Flight> assignments = new HashSet<>();

  public Pilot() {
    System.out.println(this + " created");
  }

  public String getName() {
    return name;
  }

  public Airline getEmployer() {
    return employer;
  }

  public Set<Flight> getAssignments() {
    return assignments;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmployer(Airline employer) {
    this.employer = employer;
  }

  public void addAssignment(Flight assignment) {
    assignments.add(assignment);
  }

  public String toString() {
    return this.getClass().getSimpleName() + " " + getName();
  }

  public void hire() {
    System.out.println(this + " is hired");
  }

  public void fire() {
    System.out.println(this + " is fired");
  }
}

