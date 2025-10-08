package rotationQuestions;

import java.util.Arrays;

public class RightRotationByOne {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int end=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=end;
		System.out.println("Rotating right :"+Arrays.toString(arr));
	}

}
