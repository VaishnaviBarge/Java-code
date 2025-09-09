package ArrayPackage;

public class SlidingWindowFixed {

	public static void main(String[] args) {
		int[] arr= {1,2,4,3,5,6,3,8};
		int k=3;
		System.out.println("Max Sum ="+maxSumSubArray(arr,k));
	}
	public static int maxSumSubArray(int[] arr,int k) {
		int windowSum=0;
		int maxSum=0;
		//first window
		for(int i=0;i<k;i++) {
			windowSum+=arr[i];
		}
		maxSum=windowSum;
		
		//slide window
		for(int i=k;i<arr.length;i++) {
			windowSum += arr[i]-arr[i-k];
			maxSum=Math.max(maxSum, windowSum);
		}
		return maxSum;
	}
}
