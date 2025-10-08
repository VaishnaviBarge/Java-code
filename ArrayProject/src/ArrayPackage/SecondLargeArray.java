package ArrayPackage;

public class SecondLargeArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax) {
				secondMax=firstMax;
				firstMax=arr[i];
			}
			else if(arr[i]>secondMax  && arr[i]!=firstMax) {
				secondMax=arr[i];
			}
		}
		if(secondMax==Integer.MIN_VALUE) {
			System.out.println("No Second Large element may be all elements are same");
		}
		else {
			System.out.println("second element"+ secondMax);
			System.out.println("first element"+ firstMax);
		}

	}

};
