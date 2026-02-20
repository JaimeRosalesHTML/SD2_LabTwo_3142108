// Name: Jaime Rosales
// Student Number: 3142108

package griffith;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConversionsTest {

    @Test
    public void testEuroToDollar() {
        Conversions c = new Conversions();

        assertEquals(110.0, c.euroToDollar(100.0), 0.0001);
        assertEquals(0.0, c.euroToDollar(0.0), 0.0001);
        assertEquals(-55.0, c.euroToDollar(-50.0), 0.0001);
    }
    
    @Test
    public void testDollarToEuro() {
        Conversions c = new Conversions();

        assertEquals(100.0, c.dollarToEuro(110.0), 0.0001);
        assertEquals(0.0, c.dollarToEuro(0.0), 0.0001);
        assertEquals(-50.0, c.dollarToEuro(-55.0), 0.0001);
    }
}