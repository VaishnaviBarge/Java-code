package ArrayPackage;

import java.util.Arrays;

public class TwoPointerRemoveDuplicates {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,1,4,5};
		int k=removeDuplicates(num);
		System.out.println("new Length :"+k);
		for(int i=0;i<k;i++) {
			System.out.println(num[i]+"");
		}

	}
	public static int removeDuplicates(int[] num) {
		Arrays.sort(num);
		if(num.length==0) return 0;
		int i=0;
		for(int j=1;j<num.length;j++) {
			if(num[j]!=num[i]) {
				i++;
				num[i]=num[j];
			}
		}
		return i+1;
	}

}
