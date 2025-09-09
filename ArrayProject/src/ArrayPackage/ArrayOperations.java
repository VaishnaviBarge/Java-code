package ArrayPackage;

import java.util.Scanner;

public class ArrayOperations {
		Scanner sc=new Scanner(System.in);
		
		public static void Display(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		public static void Update(int[] arr,int index,int newValue) {
			if (index >= 0 && index < arr.length) {
				arr[index]=newValue;
			}
			System.out.println("Updated array will be :");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		public static int[] Insert(int[] arr,int index, int value) {
			int newArr[]=new int[arr.length+1];
			for(int i=0;i<index;i++) {
				newArr[i]=arr[i];
			}
			newArr[index]=value;
			for(int i=index;i<arr.length;i++) {
				newArr[i+1]=arr[i];
			}
			
//			System.out.println("After insertion :");
//			for(int i=0;i<newArr.length;i++) {
//				System.out.print(newArr[i]+" ");
//			}
			return newArr;
		}
		
		public static int[] DeleteByIndex(int arr[],int index) {
			int[] newArr1=new int[arr.length-1];
			for(int i=0,j=0;i<arr.length;i++) {
				if(i==index) continue;
				newArr1[j++]=arr[i];
			}
			System.out.println("Array after deleting element by index :");
			for(int i=0;i<newArr1.length;i++) {
				System.out.print(newArr1[i]+" ");
			}
			return newArr1;
		}
		
		public static int[] DeleteByValue(int arr[],int valueToDelete) {
			boolean found=false;
			int[] newArr2=new int[arr.length-1];
			for(int i=0,j=0;i<arr.length;i++) {
				if(!found && arr[i]==valueToDelete) {
					found=true;
					continue;
				}
				if(j<arr.length-1) {
					newArr2[j++]=arr[i];
				}
			}
			if (!found) {
	            System.out.println("Value not found.");
	            return arr;
	        }
	        return newArr2;
		}
}
