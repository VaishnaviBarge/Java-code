package Array;

public class MathamaticOp {
	public static void main(String[] args) {
		int n=5252;
//		factorial(n);
//		fibonacci(10);
//		prime(2);
		System.out.println("is palindrom: "+ palindrom(n));
	}
	public static void factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
			System.out.print(fact+" ");
		}
		System.out.println("Factorial is :"+fact);
	}
	public static void fibonacci(int n) {
		int a=0,b=1;
		for(int i=0;i<n;i++) {				//
			System.out.println(a+" ");		// a=0,1,1,2,3...
			int next=a+b;					//next=1,2,3,5,8
			a=b;							//a=1,1,2,3,5
			b=next;							//b=1,2,3,5,8...
		}
	}
	
	public static boolean prime(int n) {
		if(n<=1) return false;
		if(n==2) return true;
		if(n%2==0)return false;
		for(int i=3;i*i<=n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static boolean palindrom(int n) {
		String str=String.valueOf(n);
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static boolean isPalindrome(int n) {
		if(n<0) return false;
		
		int temp=n;
		int reverse=0;
		while(n!=0) {
			int digit = n%10;
			reverse = reverse * 10 + digit;
			n/=10;
		}
		return temp==reverse;
	}
}
