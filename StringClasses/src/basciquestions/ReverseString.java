package basciquestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sent=sc.nextLine();
		String reverse="";
		
		for(int i=sent.length()-1;i>=0;i--) {
			reverse+=sent.charAt(i);
		}
		System.out.println(reverse);
	}

}
