package ArrayPackage;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		

	}
	
	public static int maxSubArray(int[] nums) {
		int currentSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int num:nums) {
			currentSum+=num;
			maxSum=Math.max(maxSum, currentSum);
			if(currentSum<0) {
				currentSum=0;
			}
		}
		return maxSum;
	}

}
