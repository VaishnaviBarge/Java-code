package ArrayPackage;

import java.util.Arrays;

public class TwoPointerMergeSortedArray {

	public static void main(String[] args) {
		int[] arr1= {1,3,6};
		int[] arr2= {2,5,7};
		
//		int merged=mergeArray(arr1,arr2);
		System.out.println("Merged Array :"+ Arrays.toString(mergeArray(arr1, arr2)));
	}
	
	public static int[] mergeArray(int[] arr1,int[] arr2) {
		int[] result=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k++]=arr1[i++];
			}
			else {
				result[k++]=arr2[j++];
			}
		}
		while(i<arr1.length) {
			result[k++]=arr1[i++];
		}
		while(j<arr1.length) {
			result[k++]=arr2[j++];
		}
		return result;
	}
}
