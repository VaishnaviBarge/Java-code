package RecurtionBasic;

import java.util.Arrays;

public class RecurtionInfo {
	public void f(int i,int n) {
		if(i>n) {
			return;
		}
		System.out.println(i);
		f(i+1,n);
	}
	public void reverseF(int i,int n) {
		if(n<i) {
			return;
		}
		System.out.println(n);
		reverseF(i,n-1);
	}
	
	public void backtrackf(int i,int n) {
		if(i>n) {
			return;
		}
		
		backtrackf(i+1,n);
		System.out.println(n);
	}
	
	public int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	
	public int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public void reverseArr(int Arr[]) {
		reverseHelper(0,Arr.length,Arr);
		System.out.println(Arrays.toString(Arr));
	}
	
//	public void reverseHelper(int l,int r,int[] arr) {
//		if(l>=r) return;
//		int temp=arr[l];
//		arr[l]=arr[r];
//		arr[r]=temp;
//		reverseHelper(l+1,r-1,arr);
//	}
	
	public void reverseHelper(int i,int n,int[] arr) {
		if(i>=n/2) return;
		int temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1]=temp;
		reverseHelper(i+1,n,arr);
	}
	
	
}
