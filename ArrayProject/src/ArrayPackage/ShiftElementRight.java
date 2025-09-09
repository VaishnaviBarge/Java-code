package ArrayPackage;

public class ShiftElementRight {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		int last=arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		System.out.println("Right Roteted Array is like :");
		for(int value: arr) {
			System.out.println(value+" ");
		}
	}

}
