package miw.apaw;

import java.util.HashMap;
import java.util.Map;

public class FactoryFlight {

    private static final FactoryFlight factory = new FactoryFlight();

    private Map<String, Flight> flights;

    private FactoryFlight() {
        this.flights = new HashMap<>();
    }

    public static FactoryFlight getFactory() {
        return factory;
    }

    public Flight getFlight(String noFlight) {
        return flights.get(noFlight);
    }

    public String addFlight(Flight flight) {
        String id = flight.getNoFlight();
        flights.put(id,flight);
        return id;
    }

    public void modifyFlight(Flight flight) {
        addFlight(flight);
    }

    public void removeFlight(String noFlight) {
        this.flights.remove(noFlight);
    }

}
