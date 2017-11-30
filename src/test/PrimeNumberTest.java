package test;

import main.PrimeNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {

    private PrimeNumber number;
    @Before
    public void init() {
        number = new PrimeNumber(); }

    @Test
     public void primeNumberCheckTest() {
        assertTrue(number.primeNumberCheck(3));
        assertFalse(number.primeNumberCheck(1));
        assertFalse(number.primeNumberCheck(4));
    }

}