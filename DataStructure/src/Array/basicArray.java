package Array;

import java.util.Arrays;
import java.util.Scanner;

public class basicArray {

	public static void main(String[] args) {
		
		//min max problem
		int arr[]= {1,2,3,4,5};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
//		System.out.println("min :"+min);
//		System.out.println("max :"+max);
		
		//reverse array without using extra space
		
		int end=arr.length-1;
		
		int temp;
		for(int start=0;start<arr.length/2;start++) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			end--;
		}
//		System.out.println("Reversed Array :"+Arrays.toString(arr));
		
		// search an element in array
//		System.out.println("Enter the element to search");
//		Scanner sc=new Scanner(System.in);
//		int k=sc.nextInt();
//		boolean b=false;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==k) {
//				System.out.println(" found at index : "+i);
//				b=true;
//				break;
//			}
//		}
//		if(b==true) {
//			System.out.println("element found");
//		}
//		else {
//			System.out.println("element not found ");
//		}
		
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax) {
				secondMax=firstMax;
				firstMax=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=firstMax){
				secondMax=arr[i];
			}
		}
		if(secondMax==Integer.MIN_VALUE) {
			System.out.println("All Elements are same :");
		}
		else {
			System.out.println("First Largest Number :"+ firstMax);
			System.out.println("Second Largest Number :"+ secondMax);
		}
	}

}
