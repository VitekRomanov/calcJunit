package example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import JunitExample.JunitExample.Calc;

public class TestCalc {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BEFORE CLASS");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AFTER CLASS");
	}

	private Calc c;
	@Before
	public void setUp() throws Exception {
		System.out.println("BEFORE");
		c = new Calc();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("AFTER");
	}

	@Test
	public void testAdd() {
		assertEquals(7, c.add(5, 2));
	}

	@Test
	public void testDiv() {
		assertEquals(4, c.div(6, 2));
	}

}
