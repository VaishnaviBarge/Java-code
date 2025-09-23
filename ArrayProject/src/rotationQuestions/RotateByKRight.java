package rotationQuestions;

import java.util.Arrays;

public class RotateByKRight {
	public static void main(String[] args) {
		int k=5;
		int[] arr= {1,4,2,5,3,7,6,0,2,3};
		int n=arr.length;
		k=k%n;
		int[] temp=new int[k];
		int j=0;
		for(int i=n-k;i<n;i++ ) {//i=n-1;i>n-k;i--
			temp[j++]=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("temp:"+Arrays.toString(temp));
		
		for(int i=n-k-1;i>=0;i--) {
			System.out.println(i);
			arr[i+k]=arr[i];
		}
		System.out.println("Arr:"+Arrays.toString(arr));
			
		for(int i=0;i<temp.length;i++) {
			arr[i]=temp[i];
		}
		
		System.out.println("Final reversed Array :"+Arrays.toString(arr));
	}
}
