package ArrayPackage;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[]= {20,10,22,13,15,20};
		System.out.println("Even number :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println("Odd number :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
