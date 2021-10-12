package gse.airfrance;

/**
 * The boardingpass class for the airport management system.
 *
 * @author Dennis Schneider, Marvin Simon, Dennis Adler
 */
public class BoardingPass {

  private final Passenger thePassenger;
  private final Flight theFlight;
  private final Seat theSeat;

  private String terminal;
  private String gate;

  BoardingPass(Passenger passenger, Flight flight, Seat seat) {
    this.theSeat = seat;
    this.thePassenger = passenger;
    this.theFlight = flight;
  }

  public Passenger getThePassenger() {
    return thePassenger;
  }

  public String getTerminal() {
    return terminal;
  }

  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  public Flight getTheFlight() {
    return theFlight;
  }

  public Seat getTheSeat() {
    return theSeat;
  }

  public String getGate() {
    return gate;
  }

  public void setGate(String gate) {
    this.gate = gate;
  }

  public void show() {
    thePassenger.show();
    theSeat.show();
  }
}
