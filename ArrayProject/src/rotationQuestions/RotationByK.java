package rotationQuestions;

import java.util.Arrays;

public class RotationByK {

	public static void main(String[] args) {
		int k=3;
		int[] arr= {1,4,2,5,3,7,6};
		int n=arr.length;
		k=k%n;
		
		int[] temp=new int[k];
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];
		}
//		System.out.println("temp Array :"+ Arrays.toString(temp));
		
		for(int i=k;i<n;i++) {
			arr[i-k]=arr[i];
		}
		for(int i=n-k;i<n;i++) {
			arr[i]=temp[i-(n-k)];
		}
		System.out.println("temp Array :"+ Arrays.toString(arr));
		
	}

}
