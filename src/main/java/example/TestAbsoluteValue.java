package example;

import static org.junit.Assert.*;


import org.junit.Test;

import JunitExample.JunitExample.AbsoluteValue;


public class TestAbsoluteValue {

	 @Test
	    public void AbsoluteValuePositive() {
	        String temp = AbsoluteValue.absoluteValue(100500);
	        assertTrue( "expected positiv, but number is "+ temp, "positiv"==temp);
	    }

	    @Test
	    public void AbsoluteValueNegative() {
	        String temp = AbsoluteValue.absoluteValue(-34);
	        assertTrue("expected negativ, but number is "+ temp, "negativ"==temp);
	    }
	    
}

