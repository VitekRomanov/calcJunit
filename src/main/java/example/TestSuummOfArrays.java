package example;

import static org.junit.Assert.*;

import org.junit.Test;

import JunitExample.JunitExample.SuummOfArrays;

public class TestSuummOfArrays {

	@Test	
	public void concatArrays() throws Exception {
	int[] array1 = {1, 2, 3};
	int[] array2 = {4,5,6};
	int[] resArr = {1, 2, 3, 4, 5, 6};
	assertArrayEquals(resArr, SuummOfArrays.concatArray(array1,array2));
	
	}


}
