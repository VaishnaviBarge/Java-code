package ArrayPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ArrayDifference {

	public static void main(String[] args) {
		int[] A= {1,4,6};
		int[] B= {1,4,4,6};
		System.out.println("A-B :"+sameArray(A, B));
	}
	public static List<Integer> DifferenceAB(int[] A,int[] B) {
		Set<Integer> setB=new HashSet<Integer>();
		
		for(int num:B) setB.add(num);
		
		List<Integer> Result=new ArrayList<Integer>();
		Vector<Integer> v=new Vector<Integer>();
		for(int num:A) {
			if(!setB.contains(num)) {
				Result.add(num);
			}
		}
		return Result;
	}
	
	public static List<Integer> common(int[] A,int[] B) {
		Set<Integer> setB=new HashSet<Integer>();
		
		for(int num:B) setB.add(num);
		
		List<Integer> Result=new ArrayList<Integer>();
		
		for(int num:A) {
			if(setB.contains(num)) {
				Result.add(num);
			}
		}
		return Result;
	}
	
	public static List<Integer> SymmetricDifference(int[] A,int[] B) {
		Set<Integer> setB=new HashSet<Integer>();
		for(int num:B) setB.add(num);
		
		Set<Integer> setA=new HashSet<Integer>();
		for(int num:A) setA.add(num);
		
		List<Integer> Result=new ArrayList<Integer>();
		for(int num:setA) {
			if(!setB.contains(num)) {
				Result.add(num);
			}
		}
		for(int num:setB) {
			if(!setA.contains(num)) {
				Result.add(num);
			}
		}
		
		return Result;
	}
	
	public static boolean sameArray(int[] arr1,int[] arr2) {
		Set<Integer> setA=new HashSet<>();
		Set<Integer> setB=new HashSet<>();
		
//		if(arr1.length!=arr2.length) return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int num:arr1) setA.add(num);
		for(int num:arr2) setB.add(num);
		
		boolean isEquals=setB.equals(setA);
		return isEquals;
	}

}
