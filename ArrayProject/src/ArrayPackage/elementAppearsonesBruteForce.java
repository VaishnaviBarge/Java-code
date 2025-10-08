package ArrayPackage;

public class elementAppearsonesBruteForce {

	public static void main(String[] args) {
		int[] nums= {1,1,2,2,3,3,5,5,3,4,7};
		int n=nums.length;
		
		for(int i=0;i<n;i++) {
			int count=0;
			
			for(int j=0;j<n;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(nums[i]);
			}
		}
		
		

	}

}
