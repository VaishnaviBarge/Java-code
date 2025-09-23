package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class basicArray {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {1,2,4,3,3,4,5};
		//1. Find the maximum and minimum element in an array.
//		findMinMax(arr);
		
		//2. Reverse an array.
//		reverseArray(arr);
		
		//3. Search an element in an array (linear search).
//		linearSearch(arr);
		
		//4. Find the second largest and second smallest element.
//		secondMin(arr);
//		SecondLagest(arr);
		
		//5. Check if an array is sorted.
//		isSorted(arr);
		
		//6 .Find duplicates in an array.
//		findDublicate(arr);
		
		//7. Rotation of array by k
//		RotationByK(arr);
		
		//8. missingNumber in array having elements  1 to n 
//		FindMissingNo();
		
		//9. multiple missing number
//		MultipleMissingNo();
		
		//10. merge two array
//		MergeTwoArray();
		
		//11. merge two sorted array
		MergeSortedArray();
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
	
	public static void RotationByK(int[] arr) {
		int k=6;
		int n=arr.length;
		k=k%n;
		
		int[] temp=new int[k];
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];
		}
		for(int i=k;i<n;i++) {
			arr[i-k]=arr[i];
		}
		for(int i=n-k;i<n;i++) {
			arr[i]=temp[i-(n-k)];
		}
		System.out.println("temp Array :"+ Arrays.toString(arr));
		
	}
	
	public static void FindMissingNo() {
		int[] arr= {1,3,4,5};
		int n=arr.length+1;
		int totalSum=n*(n+1)/2;
		int sumArray=0;
		for(int i=0;i<arr.length;i++) {
			sumArray+=arr[i];
		}
		int missingVal=totalSum-sumArray;
		System.out.println("the missing numbe rin array is :"+ missingVal);
	}
	
	public static void MultipleMissingNo() {
		int[] arr= {1,2,3,5,7,8};
		int n=8;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int i=1;i<=n;i++) {
			if(!set.contains(i)) {
				System.out.println(i+" ");
			}
		}
	}
	
	public static void MergeTwoArray() {
		int[] arr1= {1,3,5,6};
		int[] arr2= {2,4,7};
		int k=arr1.length;
		int l=arr2.length;
		int n=arr1.length+arr2.length;
		
		int[] arr=new int[n];
		
		for(int i=0;i<k;i++) {
			arr[i]=arr1[i];
		}
		System.out.println("Array is :"+Arrays.toString(arr));
		int j=0;
		for(int i=k;i<n;i++) {
			arr[i]=arr2[j++];
		}
		System.out.println("Array is :"+Arrays.toString(arr));
	}
	
	public static void MergeSortedArray(){
		int[] arr1= {0,1,3,5,6,8};
		int[] arr2= {2,4,7,9};
		int m=arr1.length;
		int l=arr2.length;
		int n=arr1.length+arr2.length;
		
		int[] arr=new int[n];
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr[k++]=arr1[i++];
			}
			else {
				arr[k++]=arr2[j++];
			}
		}
		System.out.println("Array is :"+Arrays.toString(arr));
		while(i<arr1.length) {
			arr[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			arr[k++]=arr2[j++];
		}
		System.out.println("Array is :"+Arrays.toString(arr));
	}
}
