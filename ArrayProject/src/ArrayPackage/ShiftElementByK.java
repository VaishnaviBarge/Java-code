package ArrayPackage;

public class ShiftElementByK {

	public static void main(String[] args) {
		//for left rotation 
		//copy elements from k to end
		//copy first K element to end
		
		int[] arr= {1,2,3,4,5,6,7,8,9,0};
		int k=5;
		int n=arr.length;
		k=k%n;
		int[] rotated=new int[n];
		int index=0;
		for(int i=k;i<n;i++) {
			rotated[index++]=arr[i];
		}
		for(int i=0;i<k;i++) {
			rotated[index++]=arr[i];
		}
		System.out.println("Final Array :");
		for(int val: rotated) {
			System.out.println(val+" ");
		}

	}

}
