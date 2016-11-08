package example;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import JunitExample.JunitExample.Calc;

public class TestCalc {
	static Calc c;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		c = new Calc();
	}

	@Test
	public void testAdd() {
		assertEquals(7, c.add(5, 2));
	}

	@Test
	public void testDiv() {
		assertEquals(2 , c.div(6,3));
	}
	@Test(expected = IllegalArgumentException.class)
    public void yAxis() {
    	c.div(3,0);
		
	}
}

