package JunitExample.JunitExample;

public class CoordinateQuarter {
	
	    public int coordinateQuarterCheker(double x, double y)
	    throws IllegalArgumentException{
	    
			if(x==0 & y==0){
			throw new IllegalArgumentException("Centre Coordinate");
			}
			if(x==0 || y==0){
			throw new IllegalArgumentException("Axis");}
			   		
	    		int Quarter = 0;
				if (x>0 && y>0) {Quarter = 1;}
	    		if (x>0 && y<0) {Quarter = 2;}
	    		if (x<0 && y<0) {Quarter = 3;}
	    		if (x<0 && y>0) {Quarter = 4;}
				return Quarter;
	    
	}

}