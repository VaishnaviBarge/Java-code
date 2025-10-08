package ArrayPackage;

import java.util.Arrays;

public class TwoPointerReverse {

	public static void main(String[] args) {
		int arr[]= {1,4,2,6,4,3,7};
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			right--;
			left++;
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(Arrays.toString(arr)); 
		

	}

}
