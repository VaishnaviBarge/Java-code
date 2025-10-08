package ArrayPackage;

import java.util.Arrays;
import java.util.Scanner;

public class checkIfArrayAreEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr1= {1,2,4,5,6};
		int[] arr2= {6,2,5,3,1};
		System.out.println("Enter your choice");
		System.out.println("1.By Sorting");
		System.out.println("2.By Frequency");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println(arraysEqualSorting(arr1, arr2));
			break;
		case 2:
			System.out.println(arrayEqualFrequencyCount(arr1, arr2));
			break;
		}

	}
	
	public static boolean arraysEqualSorting(int[] arr1,int[] arr2) {
		if(arr1.length!=arr2.length) return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean arrayEqualFrequencyCount(int[] arr1,int[] arr2) {
		if(arr1.length!=arr2.length) return false;
		
		boolean[] visited=new boolean[arr2.length];
		for(int i=0;i<arr1.length;i++) {
			boolean found=false;
			for(int j=0;j<arr2.length;j++) {
				if(!visited[j]&& arr1[i]==arr2[j]) {
					visited[j]=true;
					found=true;
					break;
				}
			}
			if(!found) return false;
		}
		return true;
	}

}
