package ArrayPackage;

public class SlidingWindowVariable {

	public static void main(String[] args) {
		int[] arr= {2,4,3,5,6,3};
		int k=15;
		System.out.println("Max Sum ="+ minSubArraylen(k,arr));

	}
	
	public static int minSubArraylen(int target,int[] arr) {
		int minLen=Integer.MAX_VALUE;
		int start=0;
		int sum=0;
		
		for(int end=0;end<arr.length;end++) {
			sum+=arr[end];
			while(sum>=target) {
				minLen=Math.min(minLen, end-start+1);
				sum-=arr[start++];
			}
		}
		
		return minLen==Integer.MAX_VALUE?0:minLen;
	}

}
