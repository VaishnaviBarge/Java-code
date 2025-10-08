package ArrayPackage;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		//Declaration + Allocation
		int[] num=new int[5];
		System.out.println("Enter 5 digits :");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		//display
		System.out.println("Your array is like");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		//Declare + Initialization
		int[] arr= {1,2,3,4,5};
		System.out.println("\nPredefined Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//updated by index
		int n=arr.length;
		System.out.println("Enter index where to update element (0 to"+(n-1)+") : ");
		int updateIndex=sc.nextInt();
		System.out.println("Enter the updated Value :");
		int newValue=sc.nextInt();
		
		arr[updateIndex]=newValue;
		
		System.out.println("Updated array will be :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//inserting new element in existing array
		
		System.out.println("Enter the position to insert new element in Array :");
		int pos=sc.nextInt();
		System.out.println("Enter the value to insert :");
		int valueToInsert=sc.nextInt();
		
		int newArr[]=new int[n+1];
		for(int i=0;i<pos;i++) {
			newArr[i]=arr[i];
		}
		newArr[pos]=valueToInsert;
		for(int i=pos;i<n;i++) {
			newArr[i+1]=arr[i];
		}
		
		System.out.println("After insertion :");
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
		//Deletion by Index
		System.out.println("Enter the index to delete(0 to"+(n-1)+") : ");
		int indexToDelete=sc.nextInt();
		int[] newArr1=new int[n-1];
		for(int i=0,j=0;i<n;i++) {
			if(i==indexToDelete) continue;
			newArr1[j++]=arr[i];
		}
		System.out.println("Array after deleting element by index :");
		for(int i=0;i<newArr1.length;i++) {
			System.out.print(newArr1[i]+" ");
		}
		
		//Delete by value
		System.out.println("Enter the value to delete ( 0 to "+(n-1)+") :");
		int valueToDelete=sc.nextInt();
		boolean found=false;
		int[] newArr2=new int[n-1];
		for(int i=0,j=0;i<n;i++) {
			if(!found && arr[i]==valueToDelete) {
				found=true;
				continue;
			}
			if(j<n-1) {
				newArr2[j++]=arr[i];
			}
		}
		if(found) {
			System.out.println("After deleting that value the arre is like :");
			for(int i=0;i<newArr2.length;i++) {
				System.out.print(newArr2[i]+" ");
			}
		}
		else {
			System.out.println("Value not found in array");
		}
		sc.close();
	}

}
