package array2;

import java.util.Arrays;

public class MovesZeros {

	public static void main(String[] args) {
		int[] arr = {2,4,3,5,0,2,0,5,0};
		int n=arr.length;
		int j=-1;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		int temp;
		for(int i=j+1;i<n;i++) {
			if(arr[i]!=0) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
		System.out.println("Array is "+ Arrays.toString(arr));
	}

}
