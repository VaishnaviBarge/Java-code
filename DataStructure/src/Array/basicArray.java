package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class basicArray {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {1,2,4,3,3,4,5};
		//Find the maximum and minimum element in an array.
//		findMinMax(arr);
		
		//Reverse an array.
//		reverseArray(arr);
		
		//Search an element in an array (linear search).
//		linearSearch(arr);
		
		//Find the second largest and second smallest element.
//		secondMin(arr);
//		SecondLagest(arr);
		
		//Check if an array is sorted.
//		isSorted(arr);
		
		//Find duplicates in an array.
		findDublicate(arr);
	}
	
	public static void findMinMax(int[] arr) {
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("min:"+min);
		System.out.println("max:"+max);
	}
	
	public static void reverseArray(int[] arr) {
		int j=arr.length-1;
		int temp;
		for(int i=0;i<(arr.length/2);i++) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j--]=temp;
		}
		System.out.println("Reverse Array :"+ Arrays.toString(arr));
	}
	
	public static void linearSearch(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to search :");
		int n=sc.nextInt();
		boolean b=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("Element found at index "+i);
				b=true;
				break;
			}
			
		}
		if(!b) {
			System.out.println("Element not found !");
		}
	}
	
	public static void secondMin(int[] arr) {
		int firstMin=Integer.MAX_VALUE;
		int secondMin=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<firstMin) {
				secondMin=firstMin;
				firstMin=arr[i];
			}
			else if(arr[i]<secondMin && arr[i]!=firstMin) {
				secondMin=arr[i];
			}
		}
		if(secondMin==Integer.MAX_VALUE) {
			System.out.println("No second Smallest Element may be all are same");
		}
		else {
			System.out.println("Second Min is :"+secondMin);
		}
		
	}

	public static void SecondLagest(int[] arr) {
		int firstLarge=Integer.MIN_VALUE;
		int secondLarge=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLarge) {
				secondLarge=firstLarge;
				firstLarge=arr[i];
			}
			else if(arr[i]>secondLarge && arr[i]!=firstLarge) {
				secondLarge=arr[i];
			}
		}
		if(secondLarge==Integer.MIN_VALUE) {
			System.out.println("The given array don't have second large number"
					+ " may be all numbers are same");
		}
		else {
			System.out.println("Second largest element is :"+ secondLarge);
		}
	}
	
	public static void isSorted(int[] arr) {
		boolean b=true;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1]) {
				b=false;
				break;
			}
		}
		if(!b) {
			System.out.println("Array is not sorted");
		}
		else {
			System.out.println("Array is sorted");
		}
	}
	
	public static void findDublicate(int[] arr) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int num: arr) {
			if(set.contains(num)) {
				System.out.println("num :"+num);
			}
			else {
				set.add(num);
			}
		}
		
	}
	
}
