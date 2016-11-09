package example;

import static org.junit.Assert.*;

import org.junit.Test;

import JunitExample.JunitExample.CalckMaxMin;

public class TestCalckMaxMin {

	@Test
    public void calculateMaxMinPositive() {
        assertTrue("array[{2}{2}{3}{4}] expect 4/2=2 ", 2==CalckMaxMin.calculateMaxMin(2, 2, 3, 4));
    }

    @Test
    public void calculateMaxMinNegative() {
        assertTrue("array[{2}{2}{3}{4}] expect 4/2=2 ", 0.25==CalckMaxMin.calculateMaxMin(-4, -2, -3, -1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateMaxMinZero() {
    	CalckMaxMin.calculateMaxMin(1, 2, 0, 4);
    }
}