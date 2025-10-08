package array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOfSortedArray {

	public static void main(String[] args) {
		int[] arr1= {1,3,4,6,7,8};
		int[] arr2= {2,2,3,4,7,8,9};
//		HashSet<Integer> set=new HashSet<Integer>();
//		for(int i:arr1) {
//			set.add(i);
//		}
//		for(int i:arr2) {
//			set.add(i);
//		}
//		int[] union=new int[set.size()];
//		int i=0;
//		for(int it:set) {
//			union[i++]=it;
//		}
//		System.out.println("Union Array is :"+Arrays.toString(union));
		ArrayList<Integer> union=optimalUnion(arr1, arr2);
		System.out.println(union);
	}
	
	public static ArrayList<Integer> optimalUnion(int[] arr1,int[] arr2) {
		ArrayList<Integer> union=new ArrayList<Integer>();
		int i=0,j=0;
		int n=arr1.length,m=arr2.length;
		System.out.println("test1");
		while( i<n &&  j<m) {
			if(arr1[i]<=arr2[j]) {
				addifNotDup(union,arr1[i]);
				i++;
				System.out.println("test2");
			}
			else if(arr2[j]<arr1[i]) {
				addifNotDup(union, arr2[j]);
				j++;
			}
			else {
				addifNotDup(union,arr1[i]);
				i++;
				j++;
			}
		}
		while(i<n) {
			addifNotDup(union, arr1[i]);
			i++;
			System.out.println("test3");
		}
		while(j<m) {
			addifNotDup(union, arr2[j]);
			System.out.println("test4");
			j++;
		}
		return union;
	}
	
	public static void addifNotDup(ArrayList<Integer> union,int num) {
		if(union.isEmpty()||union.get(union.size()-1)!=num) {
			union.add(num);
			System.out.println("test5");
		}
	}

}
