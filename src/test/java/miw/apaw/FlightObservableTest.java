package miw.apaw;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class FlightObservableTest {

    @Test
    void test() {
        FlightObservable flightObservable = new FlightObservable();
        Consumer<String> subscription = flightObservable.subscribe(
                s-> System.out.println("Funciona!!! " + s)
        );
        flightObservable.subscribe(s-> System.out.println("Funciona 2do!!! " + s));
        flightObservable.accept("flight 2");
        flightObservable.unsubscribe(subscription);
        flightObservable.accept("Flight 3");
    }

    @Test
    void testAssert() {
        FlightObservable observable = new FlightObservable();
        observable.subscribe((String s) -> assertEquals("test", s));
        observable.accept("test");
    }
}
