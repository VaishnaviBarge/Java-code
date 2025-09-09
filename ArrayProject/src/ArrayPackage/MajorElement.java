package ArrayPackage;

import java.util.Scanner;

public class MajorElement {

	public static void main(String[] args) {
		int[] nums= {1,5,5,5,6,5};
		int majority=0;
		
		System.out.println("Enter your choice");
		System.out.println("1.BruteForce");
		System.out.println("2.FrequencyCount");
		System.out.println("3.MooresVoting");
		Scanner sc= new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println(findMajorityElementByBruteForce(nums));
			
			break;
		case 2:
			System.out.println(findMajorityElementByFrequencyCount(nums));
			break;
		case 3:
			System.out.println(findMajorityElementByMooresVoting(nums));
			break;
		default:
			sc.close();
			return;
			
		}
	}
		public static int findMajorityElementByBruteForce(int[] nums) {
	        int n = nums.length;
			for(int i=0;i<n;i++) {
				int count=0;
				for(int j=0;j<n;j++) {
					if(nums[i]==nums[j]) {
						count++;
					}
				}
				if(count>n/2) {
					return nums[i];
				}
			}
			return -1;
		}
		
		public static int findMajorityElementByFrequencyCount(int[] nums) {
			int n=nums.length;
			int[] freq=new int[100005];
			
			for(int num: nums) {
				freq[num]++;
				if(freq[num]>n/2)
					return num;
			}
			return -1;
		}
		
		public static int findMajorityElementByMooresVoting(int[] nums) {
			int count=0;
			int candidate=0;
			
			for(int num:nums) {
				if(count==0) {
					candidate=num;
				}
				count+=(num==candidate)?1:-1;
			}
			return candidate;
		}
}
