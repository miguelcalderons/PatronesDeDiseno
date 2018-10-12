package miw.apaw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryFlightTest {

    @Test
    void testGetReference() {
        FactoryFlight referencesFactory = new FactoryFlight();
        assertEquals(0, referencesFactory.getKey("one"));
        assertEquals(1, referencesFactory.getKey("two"));
    }

    @Test
    void testRemoveReference() {
        FactoryFlight referencesFactory = new FactoryFlight();
        assertEquals(0, referencesFactory.getKey("one"));
        referencesFactory.removeReference("one");
        assertEquals(1, referencesFactory.getKey("one"));
    }

}
