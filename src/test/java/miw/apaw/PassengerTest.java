package miw.apaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    private Passenger passenger;

    @BeforeEach
    void before() {
        this.passenger = new Passenger("1", "John", "JohnDoe@test.com", true);
    }

    @Test
    void testGetId(){
        assertEquals("1",this.passenger.getId());
    }

    @Test
    void testGetName(){
        assertEquals("John",this.passenger.getName());
    }
    @Test
    void testGetEmail(){
        assertEquals("JohnDoe@test.com",this.passenger.getEmail());
    }

    @Test
    void testGetClass(){
        assertTrue(this.passenger.getFirstClass());
    }

    @Test
    void testSetId(){
        this.passenger.setId("3");
        assertEquals("3" ,this.passenger.getId());
    }

    @Test
    void testSetName(){
        this.passenger.setName("Juan");
        assertEquals("Juan" ,this.passenger.getName());
    }

    @Test
    void testSetEmail(){
        this.passenger.setEmail("juanperez@test.com");
        assertEquals("juanperez@test.com" ,this.passenger.getEmail());
    }

    @Test
    void testSetClass(){
        this.passenger.setClass(false);
        assertFalse(this.passenger.getFirstClass());
    }



}
