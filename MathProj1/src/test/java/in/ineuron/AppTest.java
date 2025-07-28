package in.ineuron;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import in.ineuron.*;
import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testSumWithPositiveNumber() {
        MathApp ar = new MathApp();
        int actual = ar.add(10, 20);
        int expected = 30;
        assertEquals(actual, expected);
    }

    public void testSumWithNegativeNumber() {
        MathApp ar = new MathApp();
        int actual = ar.add(-10, -20);
        int expected = -30;
        assertEquals(actual, expected);
    }

    public void testSumWithMixedNumber() {
        MathApp ar = new MathApp();
        int actual = ar.add(-10, 20);
        int expected = 10;
        assertEquals(actual, expected);
    }

    public void testSumWithZero() {
        MathApp ar = new MathApp();
        int actual = ar.add(0, 0);
        int expected = 0;
        assertEquals(actual, expected);
    }

}
