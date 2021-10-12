package gse.airfrance;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * BuildUp class for Airport Management System.
 **/
public class AirFranceBuildUp {

  private final BoardingPass[] boardingPasses = new BoardingPass[3];
  private final Airport jfk;
  private final Airport fra;
  private final Flight inFlight;
  private final Flight outFlight;
  private final City frankfurt;
  private final City nyc;
  private final Passenger denis;
  private final Passenger sergej;
  private final Airline af;
  private final Seat b12;
  private final Seat c12;
  private final Seat c34;
  private final Pilot whitaker;
  private final Plane F_HPJA;


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
    inFlight = new Flight(LocalDate.now().atTime(LocalTime.now()), "AF1441");
    outFlight = new Flight(LocalDate.now().plusDays(7).atTime(12, 59), "AF1321");

    buildAirline();
    buildPassengers();
    buildAirports();
    buildCities();
    buildPilots();
    buildSeats();
    buildPlane();
    buildBoardingPass();
    buildFlight();
  }

  public static void main(String[] args) {
    AirFranceBuildUp airFranceTransportationSystem = new AirFranceBuildUp();
    System.out.println("____________________________________");
    airFranceTransportationSystem.inFlight.show();
    System.out.println();
    System.out.println("____________________________________");
    airFranceTransportationSystem.outFlight.show();
  }

  /**
   * @author Dennis Adler, Dennis Schneider, Marvin Simon
   */
  private void buildBoardingPass() {
    boardingPasses[0] = new BoardingPass(denis, inFlight, c12);
    boardingPasses[1] = new BoardingPass(sergej, inFlight, b12);
    boardingPasses[2] = new BoardingPass(denis, outFlight, c34);
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
    denis.addBoardingPass(boardingPasses[0]);
    denis.addBoardingPass(boardingPasses[1]);
    sergej.addBoardingPass(boardingPasses[2]);
  }

  /**
   * @author Dennis Schneider
   */
  private void buildSeats() {
    c12.setThePlane(F_HPJA);
    b12.setThePlane(F_HPJA);
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
    inFlight.addBoardingPass(boardingPasses[0]);
    inFlight.addBoardingPass(boardingPasses[1]);
    outFlight.setCaptain(whitaker);
    outFlight.setResource(F_HPJA);
    outFlight.setTheAirline(af);
    outFlight.addDestination(fra);
    outFlight.addOrigin(jfk);
    outFlight.addBoardingPass(boardingPasses[2]);
  }
}
