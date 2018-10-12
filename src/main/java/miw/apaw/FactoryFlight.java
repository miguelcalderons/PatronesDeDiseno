package miw.apaw;

import java.util.HashMap;
import java.util.Map;

public class FactoryFlight {

    private static final FactoryFlight factory = new FactoryFlight();

    private Map<String, Integer> flights;

    private int flight;

    FactoryFlight() {
        this.flights = new HashMap<>();
        this.flight = 0;
    }

    public static FactoryFlight getFactory() {
        return factory;
    }

    public int getKey(String key) {
        return flights.computeIfAbsent(key, k -> flight++);
    }

    public void removeReference(String key) {
        this.flights.remove(key);
    }

}


