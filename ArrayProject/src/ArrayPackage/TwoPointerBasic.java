package ArrayPackage;

import java.util.Arrays;

public class TwoPointerBasic {

	public static void main(String[] args) {
		int[] arr= {1,3,24,5,6,7,9,3,5,6,1};
		int target=8;
		Arrays.sort(arr);
		int count=countPairsWithSum(arr, target);
		System.out.println("Count is :"+count);
	}
		

	public static int countPairsWithSum(int[] arr, int target) { 
		int count=0;
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				count++;
				System.out.println("count :"+count);
				right--;
				left++;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		return count;
	}
}
