package JunitExample.JunitExample;

public class Calc {
	
	public int add(int a,int b){
		return a+b;
		
	}
	
	public int div(int a,int b)throws IllegalArgumentException{
		if(b<=0){
		throw new IllegalArgumentException("b mast be positiv");}				
	
		return a/b;
    }
}