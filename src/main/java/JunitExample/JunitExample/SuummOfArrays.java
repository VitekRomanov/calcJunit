package JunitExample.JunitExample;

public class SuummOfArrays {


    public static int[] concatArray(int[] arr1, int[] arr2){
        int[] newArray = new int[newLength];
		int[] r = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, r, 0, arr2.length);
		System.arraycopy(arr2, 0, r, arr1.length, arr2.length);
		return r;
	}

}
