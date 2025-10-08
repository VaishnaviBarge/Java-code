package ArrayPackage;

public class ShiftElementByKinRight {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int k=2;
		int n=arr.length;
		k=k%n;
//		int leftRotation=n-k;
		int[] rotated=new int[n];
		int index=0;
		for(int i=n-k;i<n;i++) {
			rotated[index++]=arr[i];
		}
		for(int i=0;i<n-k;i++) {
			rotated[index++]=arr[i];
		}
		
		System.out.println("Final Array :");
		for(int val: rotated) {
			System.out.println(val+" ");
		}


	}

}
