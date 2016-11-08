package JunitExample.JunitExample;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CircleArea {
	
	public static double circleAreaCalc (double r)
	throws IllegalArgumentException{
		if(r<=0){
		throw new IllegalArgumentException("Radius must be posiv");
		}
		double area = new BigDecimal(3.14*r*r).setScale(2, RoundingMode.UP).doubleValue();
	return  area;
	}
}

