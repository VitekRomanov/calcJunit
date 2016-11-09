package JunitExample.JunitExample;

import java.util.Arrays;

public class CalckMaxMin {

	    public static  float calculateMaxMin(int a, int b, int c,int d)throws IllegalArgumentException{
			float arr[] = {a, b, c, d};
	        Arrays.sort(arr);
			if(arr[0]==0){
				throw new IllegalArgumentException("b mast be positiv");}

	        return (arr[3]/arr[0]);
	    }
	

}
