package miw.apaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportTest {

    private Report report;

    @BeforeEach
    void before() {
        this.report = new Report("This is a test", "1");
    }

    @Test
    void testGetId(){
        assertEquals("1",this.report.getId());
    }

    @Test
    void testGetClass(){
        assertEquals(true,this.report.getSafeLanding());
    }

    @Test
    void testSetId(){
        this.report.setId("3");
        assertEquals("3" ,this.report.getId());
    }

    @Test
    void testMessage(){
        this.report.setMessage("This is a test 2");
        assertEquals("This is a test 2" ,this.report.getMessage());
    }
}
