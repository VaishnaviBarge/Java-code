package MathBasic;

import java.util.Scanner;

public class BasicMathMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your Choice :");
		int n=9474;
		int m=40;
		MathInfo mt=new MathInfo();
//		System.out.println("digits in number is :"+mt.CountDigit(n));
//		System.out.println("Reverse of degit is :"+mt.ReverseDigit(n));
//		System.out.println("is number Palindrom :"+mt.checkIfPalintrom(n));
//		System.out.println("is Number Armstrong :"+mt.Armstrong(n));
		System.out.println("All division of n is:"+mt.AllDivisionNumber(n));
//		System.out.println("All division of n in more optimized way:"+mt.AllDivisionNumber2(n));
//		System.out.println("Is number is Prime  :"+mt.IsPrime(n));
//		System.out.println("Is number is Prime in more optimized way:"+mt.IsPrime2(n));
//		System.out.println("The GCD ad LCF is : "+mt.GCDLCF(n, m));
	}

}
