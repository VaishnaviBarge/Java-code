package array2;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr= {3,2,5,7,6,2};
//		System.out.println(betterSolution(arr));
		System.out.println(secondLargest(arr));
	}
	
	public static int betterSolution(int[] arr ) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	
	public static int secondLargest(int[] arr) {
		int second=Integer.MIN_VALUE;
		int first=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>first) {
				second=first;
				first=i;
			}
			else if(second<i && i!=first) {
				second=i;
			}
		}
		if(second==Integer.MIN_VALUE) {
			System.out.println("May be all number are same ");
			return 0;
		}
		return second;
	}

}
