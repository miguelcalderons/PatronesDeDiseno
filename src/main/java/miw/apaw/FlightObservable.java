package miw.apaw;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FlightObservable {

    private List<Consumer<String>> flights;
    private static FlightObservable observable = new FlightObservable();

    FlightObservable() {
        this.flights = new ArrayList<>();
    }

    public static FlightObservable getObservable() {
        return observable;
    }

    public Consumer<String> subscribe(Consumer<String> consumer) {
        this.flights.add(consumer);
        return consumer;
    }

    public void unsubscribe(Consumer<String> consumer) {
        this.flights.remove(consumer);
    }

    public void accept(String data) {
        this.flights.forEach(c -> c.accept(data));
    }
}