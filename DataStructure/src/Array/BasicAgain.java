package Array;

public class BasicAgain {

	public static void main(String[] args) {
		int[] arr= {1,4,2,5,3,6,7};
		int n=123321;
//		secondLargest(arr);
//		secondSmallest(arr);
//		reverseInteger(n);
//		countDigit(n);
		palindromeReverse(n);
	}
	
	public static void secondLargest(int[] arr) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int n:arr) {
			if(n>first) {
				second=first;
				first=n;
			}
			else if( n>second && n!=first) {
				second=n;
			}
		}
		if(second==Integer.MIN_VALUE) {
			System.out.println("There is no second no. may be all nuber are same");
		}
		else {
			System.out.println("Second Largest Number is :"+ second);
		}
		
	}
	
	
	public static void secondSmallest(int[] arr) {
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		
		for(int n:arr) {
			if(n<first) {
				second=first;
				first=n;
			}
			else if(n<second && n!=first) {
				second=n;
			}
		}
		if(second==Integer.MAX_VALUE) {
			System.out.println("May be all numbers are same");
		}
		else {
			System.out.println("Second Smallest number is :"+second);
		}
	}
	
	public static void countDigit(int n) {
		int count=0;
		while(n>0) {
//			int lastDig=n%10;
//			System.out.println(lastDig);
			n=n/10;
			count ++;
		}
		System.out.println(count);
	}
	
	
	public static void reverseInteger(int n) {
		int reverse=0;
		while(n>0) {
			int lastDig=n%10;
			reverse=(reverse*10)+lastDig;
			n=n/10;
		}
		System.out.println(reverse);
	}
	
	public static void palindromeReverse(int n) {
		int temp=n;
		int reverse=0;
		while(n>0) {
			int lastDig=n%10;
			reverse=(reverse*10)+lastDig;
			n=n/10;
		}
		if(reverse==temp) {
			System.out.println("yes it's palindrome");
		}
		else {
			System.out.println("No its not palindrome");
		}
	}
	
	public static void palindromeTwoPointer(int n) {
		
	}
}
