package example;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import JunitExample.JunitExample.CircleArea;
import JunitExample.JunitExample.CoordinateQuarter;

public class TestCoordinateQuarter {
	
	static CoordinateQuarter coords;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		coords = new CoordinateQuarter();
	}

    @Test
    public void checkFirstQuarter() {
        assertTrue("dont FirstQuarter", 1==coords.coordinateQuarterCheker(4,4));
    }

    @Test
    public void checkSecondQuarter() {
        assertTrue("dont Seconduarter", 2==coords.coordinateQuarterCheker(-4,4));
    }

    @Test
    public void checkTherdQuarter() {
        assertTrue("dont SecondQuarter", 3==coords.coordinateQuarterCheker(-4,-4));
    }

    @Test
    public void checkFourthQuarter() {
        assertTrue("dont FourthQuarter", 4==coords.coordinateQuarterCheker(4,-4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void yAxis() {
    	coords.coordinateQuarterCheker(0,4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void xAxis() {
    	coords.coordinateQuarterCheker(4,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void centreCoordinate() {
    	coords.coordinateQuarterCheker(0,0);
    }
}