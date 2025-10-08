package array2;

import java.util.Arrays;

public class LeftRotateBy1 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
//		leftRotate(arr);
//		rightRotate(arr);
//		rotateLeftByK(arr,4);
		rightRotatebyK(arr,4);
	}
	
	public static void leftRotate(int[] arr) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rightRotate(int[] arr) {
		int temp=arr[arr.length-1];
		System.out.println(temp);
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateLeftByK(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		int[] temp= new int[k];
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];
		}
		for(int i=k;i<n;i++) {
			arr[i-k]=arr[i];
		}
		for(int i=n-k;i<n;i++) {
			arr[i]=temp[i-(n-k)];
		}
		System.out.println("Temp"+ Arrays.toString(arr));
	}
	
	public static void rightRotatebyK(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		int[] temp= new int[k];
		int j=0;
		for(int i=n-1;i>=n-k;i--) {
			temp[j]=arr[i];
			j++;
		}
		for(int i=0;i<n-k;i++) {
			arr[i+k]=arr[i];
		}
		for(int i=0;i<n-k;i++) {
			arr[i]=temp[i];
		}
		System.out.println(Arrays.toString(arr));
		
	}
//	System.out.println("Temp"+ Arrays.toString(temp));
}
