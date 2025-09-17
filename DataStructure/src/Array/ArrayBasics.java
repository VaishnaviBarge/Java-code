package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		//Array Declaration
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		//inserting value in array
		System.out.println("Enter "+arr.length+"Element in the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("==============================");
		
		//display the array
		
		System.out.println("The array is like :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//updating the element of array :
		
		System.out.println("Enter the index to update in the array between 0 to "+ (arr.length-1)+" : ");
		int index=sc.nextInt();
		
		System.out.println("Enter the new value of element :");
		int value=sc.nextInt();
		
		arr[index]=value;
		System.out.println("till now "+Arrays.toString(arr));
		//inserting a new element in array
		
		int arr2[]=new int[arr.length+1];
		
		System.out.println("Enter index to enter new element between (0 to "+(arr.length-1)+" ) :");
		int index2=sc.nextInt();
		System.out.println("Enter the new value :");
		int newVal=sc.nextInt();
		for(int i=0;i<index2;i++) {
			arr2[i]=arr[i];
		}
		arr2[index]=newVal;
		
		System.out.println("till now "+Arrays.toString(arr2));
		for(int i=index2;i<arr.length;i++) {
			arr2[i+1]=arr[i];
			System.out.println(arr[2]);
			System.out.println(arr2[i]+ " " +arr[i-1]);
		}
	System.out.println("New array is as follow : "+Arrays.toString(arr2));
	}
}
