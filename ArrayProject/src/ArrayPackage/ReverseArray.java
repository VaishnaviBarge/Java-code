package ArrayPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[5];
		System.out.println("Enter five elements");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array : "+Arrays.toString(arr));
		int start=0;
		int end=arr.length-1;
		while(start<end) {	
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("Reverse Array : "+Arrays.toString(arr));
	}

}
