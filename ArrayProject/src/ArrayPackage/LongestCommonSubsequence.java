package ArrayPackage;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 1};
        int[] arr2 = {3, 4, 1, 2, 1};

        List<Integer> lcs = longestSubsequence(arr1, arr2);
        System.out.println("LCS: " + lcs);

	}
	
	public static List<Integer> longestSubsequence(int[] arr1,int[] arr2){
		int m=arr1.length,n=arr2.length;
		
		int[][] dp=new int[m+1][n+1];
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(arr1[i-1]==arr2[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		System.out.println("Length"+dp[m][n]);
		
		List<Integer> lcs=new ArrayList<Integer>();
		
		int i=m , j=n;
		
		while(i>0 && j>0) {
			if(arr1[i-1]==arr2[j-1]) {
				lcs.add(arr1[i-1]);
				i--;
				j--;
			}
			else if(dp[i-1][j]>dp[i][j-1]) {
				i--;
			}
			else {
				j--;
			}
		}
		
		return lcs;
	}

}
