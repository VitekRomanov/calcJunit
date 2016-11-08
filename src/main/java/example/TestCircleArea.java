package example;

import static org.junit.Assert.*;

import org.junit.Test;

import JunitExample.JunitExample.CircleArea;

public class TestCircleArea {

    @Test
    public void calculateCircleArea() {
    	double temp = CircleArea.circleAreaCalc(3);
        assertTrue("Radius 4 and Area=", 28.26==temp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateCircleAreaNegative() {
    	CircleArea.circleAreaCalc(-4);

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateCircleAreaZero() {
    	CircleArea.circleAreaCalc(0);
    }
}
