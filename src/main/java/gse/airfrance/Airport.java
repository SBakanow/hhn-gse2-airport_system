package gse.airfrance;

public final class Airport {

    //Airport
    private String name;
    private final String IATACode;

    //List
    private List<Flight> departures;
    private List<Flight> arrivals;
    private List<City> catchments;

    //Max
    private final byte MAX_NUMBER_CITIES = 3;

    //Counter
    private int currentNumberCities = 0;

    /**
     * The constructor takes the name, IATA-Code and associated city
     *
     * @param name     The name of this Airline
     * @param iataCode The IATA-Code associated with the Airport
     * @param city     The associated City
     */
    public Airport(final String name, final String IATACode) {
        this.name = name;
        this.IATACode = IATAode;
        departures = new Flight[];
        arrivals = new Flight[];
        catchments = new City[MAX_NUMBER_CITIES;
        System.out.println(this + " created.");
    }


    /**
     * Get the name of the airport.
     *
     * @return The name of the airport.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the IATA-Code.
     *
     * @return The IATA-Code.
     */
    public String getIATACode() {
        return IATACode;
    }

    /**
     * Get a list of departures.
     *
     * @return List of departures.
     */
    public List<Flight> getDepartures() {
        return departures;
    }

    /**
     * Get a List of arrivals.
     *
     * @return List of arrivals.
     */
    public List<Flight> getArrivals() {
        return arrivals;
    }

    /**
     * Get a list of catchments.
     *
     * @return List of Cities.
     */
    public List<City> getCatchments() {
        return catchments;
    }

    /**
     * Set the name of the Airport.
     *
     * @param name The new name for the airport.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Add a departure to the list.
     *
     * @param departure Flight to be added.
     */
    public void addDeparture(final Flight departure) {
        departures.add(departure);
    }

    /**
     * Add an arrival to the list.
     *
     * @param arrival Flight to be added.
     */
    public void addArrival(final Flight arrival) {
        arrivals.add(arrival);
    }

    /**
     * Add a city to the list.
     *
     * @param catchment City to be added.
     * @return true if the current number of cities is not above the max number.
     */
    public boolean addCatchment(City catchment) {
        boolean result = false;
        if (catchment != null && currentNumberCities < MAX_NUMBER_CITIES) {
            catchments.add(catchment);
            currentNumberCities++;
        }
    }

    /**
     * Method sends back a String of the airports name and IATA-Code.
     *
     * @return String of the airport.
     */
    public String toString()
        return this.getClass().getSimpleName() + " " + name + " | IATA-Code " + iataCode
    }
}
