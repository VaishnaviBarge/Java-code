package ArrayPackage;

public class SecondSmallestArray {

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9};
		
		int firstMin=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<firstMin) {
				secondMin=firstMin;
				firstMin=arr[i];
			}
			else if(arr[i]<secondMin && arr[i]!=firstMin) {
				secondMin=arr[i];
			}
		}
		if(secondMin==Integer.MAX_VALUE) {
			System.out.println("No second Smallest Element may be all are same");
		}
		else {
			System.out.println("Second smallest element :"+secondMin);
		}
	}
}
