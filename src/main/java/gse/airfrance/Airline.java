package gse.airfrance;


import java.util.HashSet;
import java.util.Set;

/**
 * The airline class for the airport management system.
 *
 * @author Furkan Aydin
 */
public class Airline {

  private String name;
  private final String IATACode;
  private final Set<Pilot> employees = new HashSet<>();
  private final Set<Flight> theFlights = new HashSet<>();

  public Airline(String IATACode, String name) {
    this.IATACode = IATACode;
    this.name = name;
    System.out.println(this + " created.");
  }

  public String getName() {
    return name;
  }

  public String getIATACode() {
    return IATACode;
  }

  public Set<Pilot> getEmployees() {
    return employees;
  }

  public Set<Flight> getTheFlights() {
    return theFlights;
  }

  public void addEmployee(Pilot employee) {
    employees.add(employee);
  }

  public void addTheFlights(Flight theFlight) {
    theFlights.add(theFlight);
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + name + " " + IATACode;
  }

  public void expensive() {
    System.out.println(this + " is expensive");
  }

  public void show() {
    System.out.println("Offered by " + name + " (" + IATACode + ")");
  }
}
