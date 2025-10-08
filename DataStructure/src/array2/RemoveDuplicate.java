package array2;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,4,4,5};
		removeDuplicate(arr);
	}
	
	public static void removeDuplicate(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		int index=0;
		for(int i:set) {
			arr[index]=i;
			index++;
		}
		for(int i=index;i<arr.length;i++) {
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
