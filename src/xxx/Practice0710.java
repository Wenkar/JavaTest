package xxx;

import java.util.Arrays;

public class Practice0710 {
	public static void main(String[] args) {
		int[] intArray = {200, 300, 100};
		Arrays.sort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		int num = Arrays.binarySearch(intArray,200);
		 System.out.println(num);
		
	}
}
