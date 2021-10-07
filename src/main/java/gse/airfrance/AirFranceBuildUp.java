package gse.airfrance;

/**
* BuildUp class for Airport Management System.
**/
public class AirFranceBuildUp {

  private Airport jfk;
  private Airport fra;

  private Flight inFlight;
  private Flight outFlight;

  private City frankfurt;
  private City nyc;

  private Passenger denis;
  private Passenger sergej;

  private Airline af;

  private Seat b12;
  private Seat c12;
  private Seat c34;

  private Pilot whitaker;

  private Plane F_HPJA;


  public static void main(String[] args) {
    var test = new AirFranceBuildUp();
    System.out.println("____________________________________");
    test.inFlight.show();
    System.out.println();
    System.out.println("____________________________________");
    test.outFlight.show();
  }

  public AirFranceBuildUp() {
    F_HPJA = new Plane("Airbus A380", "219031", "F-HPJA");
    jfk = new Airport("John F Kennedy Airport", "JFK");
    fra = new Airport("Rhein-Main-Airport", "FRA");
    frankfurt = new City("Frankfurt");
    nyc = new City("New York City");
    denis = new Passenger("Denis Troccolo");
    sergej = new Passenger("Sergej Bakanow");
    c12 = new Seat("Economy", 12, 'C');
    b12 = new Seat("Economy", 12, 'B');
    c34 = new Seat("Economy", 34, 'C');
    af = new Airline("AF", "Air France");
    whitaker = new Pilot("John Whitaker");
    inFlight = new Flight("2021-10-01", "AF1441");
    outFlight = new Flight("2021-10-04", "AF1321");

    buildAirline();
    buildPassengers();
    buildAirports();
    buildCities();
    buildPilots();
    buildSeats();
    buildPlane();
    buildFlight();
  }

  /**
    * @author Emin Hallaceli
    */
  private void buildPlane() {
    F_HPJA.addMission(inFlight);
    F_HPJA.addMission(outFlight);

    F_HPJA.addSeat(c34);
    F_HPJA.addSeat(b12);
    F_HPJA.addSeat(c12);
  }

  /**
    * @author Noah Schmidt
    */
  private void buildAirports() {
    jfk.addArrival(inFlight);
    jfk.addDeparture(outFlight);
    jfk.addCatchment(nyc);

    fra.addDeparture(inFlight);
    fra.addArrival(outFlight);
    fra.addCatchment(frankfurt);
  }

  /**
    * @author Denis Troccolo
    */
  private void buildCities() {
    frankfurt.addInfrastructure(fra);
    nyc.addInfrastructure(jfk);
  }

  /**
    * @author Dennis Adler
    */
  private void buildPassengers() {
    denis.addSeat(c12);
    denis.addSeat(c34);
    sergej.addSeat(b12);
  }

  /**
    * @author Dennis Schneider
    */
  private void buildSeats() {
    c12.setTheFlight(inFlight);
    c12.setThePassenger(denis);
    c12.setThePlane(F_HPJA);
    b12.setThePlane(F_HPJA);
    b12.setTheFlight(inFlight);
    b12.setThePassenger(sergej);

    c34.setThePassenger(denis);
    c34.setTheFlight(outFlight);
    c34.setThePlane(F_HPJA);
  }

  /**
    * @author Furkan Aydin
    */
  private void buildAirline() {
    af.addEmployee(whitaker);
    af.addTheFlights(inFlight);
    af.addTheFlights(outFlight);
  }

  /**
    * @author Sergej Bakanow
    */
  private void buildPilots() {
    whitaker.addAssignment(inFlight);
    whitaker.addAssignment(outFlight);
    whitaker.setEmployer(af);
  }

  /**
    * @author Marvin Simon
    */
  private void buildFlight() {
    inFlight.setCaptain(whitaker);
    inFlight.setResource(F_HPJA);
    inFlight.setTheAirline(af);
    inFlight.addDestination(jfk);
    inFlight.addOrigin(fra);
    inFlight.addSeats(c12);
    inFlight.addSeats(b12);
    outFlight.setCaptain(whitaker);
    outFlight.setResource(F_HPJA);
    outFlight.setTheAirline(af);
    outFlight.addDestination(fra);
    outFlight.addOrigin(jfk);
    outFlight.addSeats(c34);
  }
}
