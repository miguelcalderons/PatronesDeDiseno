package miw.apaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportBuilderTest {

    private Report report;
    private String Message = "This is a report test 3";

    @Test
    void testFirstBuild() {
        report = new ReportBuilder(Message,"1").build();

        assertEquals("1",report.getId());
        assertEquals("This is a report test 3" ,report.getMessage());
    }

    @Test
    void testFullBuild() {
        report = new ReportBuilder("Report test Full","2").SafeLanding(false).build();

        assertEquals("2",report.getId());
        assertEquals("Report test Full" ,report.getMessage());
        assertEquals(false, report.getSafeLanding());
    }
}
