package miw.apaw.strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {


    @Test
    void testStrategyPatron(){
        String distance = "2500 Kilometros";
        FlightDistance flightDistance = new FlightDistance(distance);
        flightDistance.setStrategy(new China(distance));
        flightDistance.Distance();
        flightDistance.setStrategy(new USA(distance));
        flightDistance.Distance();
    }
}
