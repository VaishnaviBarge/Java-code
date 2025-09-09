package ArrayPackage;

import java.util.Deque;
import java.util.LinkedList;

public class LargestSubarrayWithLimit {

	public static void main(String[] args) {
		 int[] nums = {8, 2, 4, 7};
	     int k = 4;
	     System.out.println(longestSubarray(nums, k));
	}
	public static int longestSubarray(int[] nums,int k) {
		Deque<Integer> maxDeque=new LinkedList<Integer>();
		Deque<Integer> minDeque=new LinkedList<Integer>();
		
		int left=0;
		int result=0;
		
		for(int right=0;right<nums.length;right++) {
			
			// maintain maxDeque in decreasing order
			while(!maxDeque.isEmpty() && nums[right]>maxDeque.peekLast()) {
				maxDeque.pollLast();
			}
			maxDeque.addLast(nums[right]);
			while(!minDeque.isEmpty() && nums[right]<minDeque.peekLast()) {
				minDeque.pollLast();
			}
			minDeque.addLast(nums[right]);
			
			while(maxDeque.peekFirst()-minDeque.peekFirst()>k) {
				if(maxDeque.peekFirst()==nums[left]) {
					maxDeque.pollFirst();
				}
				if(minDeque.peekFirst()==nums[left]) {
					minDeque.pollFirst();
				}
				left++;
			}
			result=Math.max(result, right-left+1);
			
			
		}
		
		return result;
	}

}
