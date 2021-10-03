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
  private String IATACode;
  private Set<Pilot> employees = new HashSet<>();
  private Set<Flight> theFlights = new HashSet<>();

  public Airline(String IATACode,String name)
  {
    this.IATACode = IATACode;
    this.name = name;

    System.out.println(this + " created.");
  }

  public String getName()
  {
    return name;
  }

  public String getIATACode()
  {
    return IATACode;
  }

  public Set<Pilot> getEmployees()
  {
    return employees;
  }

  public Set<Flight> getTheFlights()
  {
    return theFlights;
  }

  public void setEmployee(Pilot employee)
  {
    employees.add(employee);
  }

  public void setTheFlights(Flight theFlight)
  {
    theFlights.add(theFlight);
  }

  @Override
  public String toString()
  {
    return this.getClass().getSimpleName() + " " + getName();
  }

  public void expensive()
  {
    System.out.println(this + " is expensive");
  }






}
