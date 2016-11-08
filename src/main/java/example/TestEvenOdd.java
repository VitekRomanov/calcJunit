package example;

import static org.junit.Assert.*;

import org.junit.Test;

import JunitExample.JunitExample.EvenOdd;

public class TestEvenOdd {

	 @Test
	    public void EvenNumber() {
	       double temp = EvenOdd.evenOdd(6);
	        assertTrue( "expected 36, but number is "+ temp, 36==temp);
	    }

	    @Test
	    public void OddNumber() {
	    	double temp = EvenOdd.evenOdd(3);
	        assertTrue("expected 27, but number is "+ temp, 27==temp);
	    }
	    
	    @Test
	    public void ZerroNumber() {
	    	double temp = EvenOdd.evenOdd(0);
	        assertTrue("expected 0, but number is "+ temp, 0==temp);
	    }

}
