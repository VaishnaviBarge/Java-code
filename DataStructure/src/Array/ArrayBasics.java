package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//Array Declaration
		Scanner sc=new Scanner(System.in);
		
		
		//inserting value in array
		
		//display the array
		
		
		//updating the element of array :
//		
		
		//inserting a new element in array
		
	//Delete by index
		
	//Delete by value
	
	
	}
	
	public int[] createArray() {
		System.out.println("Enter the number of element you want in array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+arr.length+"Element in the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("==============================");
		
		return arr;
	}
	
	public void displayArray(int[] arr) {
		System.out.println("The array is like :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("==============================");
	}
	
	public int[] updateArray(int[] arr) {
		System.out.println("Enter the index to update in the array between 0 to "+ (arr.length-1)+" : ");
		int index=sc.nextInt();
		
		System.out.println("Enter the new value of element :");
		int value=sc.nextInt();
		
		arr[index]=value;
		System.out.println("till now "+Arrays.toString(arr));
		return arr;
		
	}
	
	public int[] insertArray(int[] arr) {
		int arr2[]=new int[arr.length+1];
		
		System.out.println("Enter index to enter new element between (0 to "+(arr.length-1)+" ) :");
		int index2=sc.nextInt();
		System.out.println("Enter the new value :");
		int newVal=sc.nextInt();
		for(int i=0;i<index2;i++) {
			arr2[i]=arr[i];
		}
		
		arr2[index2]=newVal;
		
		System.out.println("till now "+Arrays.toString(arr2));
		for(int i=index2;i<arr.length;i++) {
			arr2[i+1]=arr[i];
		}
		System.out.println("New array is as follow : "+Arrays.toString(arr2));
	
		return arr2;
		
	}
	public int[] DeleteValue(int[] arr) {
		System.out.println("Enter the value to delete the element :");
		int key=sc.nextInt();
		boolean found=false;
		int[] arr3=new int[arr.length-1];
		for(int i=0,j=0;i<arr.length;i++) {
			if(!found && arr[i]==key) {
				found=true;
				continue;
			}
			if(j<arr.length-1) {
				arr3[j++]=arr[i];
			}
		}
		System.out.println("After deleting element array is as follow : "+Arrays.toString(arr3));
		return arr3;
		
	}
	
	public int[] DeleteIndex(int[] arr) {
		System.out.println("Enter the index to delete the element :");
		int key=sc.nextInt();
		boolean found=false;
		int[] arr3=new int[arr.length-1];
		for(int i=0,j=0;i<arr.length;i++) {
			if(i==key) {
				found=true;
				continue;
			}
			if(j<arr.length-1) {
				arr3[j++]=arr[i];
			}
		}
		System.out.println("After deleting element array is as follow : "+Arrays.toString(arr3));
		return arr3;
		
	}
	
}
