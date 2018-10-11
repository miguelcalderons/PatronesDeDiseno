package miw.apaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryFlightTest {

    private Flight flight;

    @BeforeEach
    void before() {
        this.flight = new Flight("NO400", "USA");
    }

    @Test
    void testAddFlight(){
        //assertEquals("NO400", FactoryFlight.addFlight(this.flight));
    }
}
