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
    
    @Test
    public void testStringToInteger() {
        Conversions c = new Conversions();

        assertEquals(123, c.stringToInteger("123"));
        assertEquals(-50, c.stringToInteger("-50"));
        assertEquals(0, c.stringToInteger("abc"));
        assertEquals(0, c.stringToInteger(null));
    }
    
    @Test
    public void testIntegerToString() {
        Conversions c = new Conversions();

        assertEquals("0", c.integerToString(0));
        assertEquals("99", c.integerToString(99));
        assertEquals("-7", c.integerToString(-7));
    }
}