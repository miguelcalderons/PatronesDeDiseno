package miw.apaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class FlightTest {

    private Flight flight;

    @BeforeEach
    void before() {
        this.flight = new Flight("NO400", "USA", Flight.Weather.WINDY);
    }

    @Test
    void testGetDestination(){
        assertEquals("USA",this.flight.getDestination());
    }

    @Test
    void testGetDate(){
        assertEquals("NO400",this.flight.getNoFlight());
    }

    @Test
    void testGetWeather() {
        assertEquals(Flight.Weather.WINDY ,this.flight.getWeather());
    }

    @Test
    void testSetDate(){
        this.flight.setFlightDate(LocalDateTime.of(2018, 01, 21, 00, 00));
        LocalDateTime date =  LocalDateTime.of(2018, 01, 21, 00, 00);
        assertEquals(date ,this.flight.getTime());
    }

    @Test
    void testSetDestination(){
        this.flight.setDestination("Irland");
        assertEquals("Irland" ,this.flight.getDestination());
    }

    @Test
    void testSetWeather() {
        this.flight.setWeather(Flight.Weather.SUNNY);
        assertEquals(Flight.Weather.SUNNY ,this.flight.getWeather());
    }



}
