package miw.apaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaptainTest {

    private Captain captain;

    @BeforeEach
    void before() {
        this.captain = new Captain("1", "John", "JohnDoe@test.com");
    }

    @Test
    void testGetId(){
        assertEquals("1",this.captain.getId());
    }

    @Test
    void testGetName(){
        assertEquals("John",this.captain.getName());
    }
    @Test
    void testGetEmail(){
        assertEquals("JohnDoe@test.com",this.captain.getEmail());
    }

    @Test
    void testSetId(){
        this.captain.setId("3");
        assertEquals("3" ,this.captain.getId());
    }

    @Test
    void testSetName(){
        this.captain.setName("Juan");
        assertEquals("Juan" ,this.captain.getName());
    }

    @Test
    void testSetEmail(){
        this.captain.setEmail("juanperez@test.com");
        assertEquals("juanperez@test.com" ,this.captain.getEmail());
    }



}
