package array2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfSortedArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,9,7,5};
		int[] arr2= {2,2,3,4,4,5,8,9};
		
		ArrayList<Integer> intersection=InsertionOfSorted(arr1, arr2);
		System.out.println("Intersection of the array is :"+intersection);
	}
	
	public static ArrayList<Integer> InsertionOfSorted(int[] arr1,int[] arr2){
		ArrayList<Integer> intersection=new ArrayList<Integer>();
		
		int n1=arr1.length;
		int n2=arr2.length;
		int[] visited=new int[n2];
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(arr1[i]==arr2[j] && visited[j]==0) {
					intersection.add(arr1[i]);
					visited[j]=1;
					break;
				}
				if(arr2[j]>arr1[i]) {
					break;
				}
			}
		}
		return intersection;
	}
	public static ArrayList<Integer> optimalIntersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> intersection=new ArrayList<Integer>();
		
		int n1=arr1.length;
		int n2=arr2.length;
		
		int i=0,j=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				j++;
			}
			else {
				intersection.add(arr1[i]);
				i++;
				j++;
			}
		}
		return intersection;

	}

}
