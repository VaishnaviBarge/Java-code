package ArrayPackage;

import java.util.Arrays;

public class TwoArrayEquals {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,3,4};
		int[] arr2= {4,3,2,3,1,4};
		System.out.println(AreArrayEqual(arr1, arr2));
	}
	
	public static boolean AreArrayEqual(int[] arr1,int[] arr2) {
		if(arr1.length!=arr2.length) return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
	}

}
