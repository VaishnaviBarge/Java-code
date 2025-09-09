package basciquestions;

import java.util.Scanner;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentance");
		String sent=sc.nextLine();
		String filter="";
		for(int i=0;i<sent.length();i++) {
			char ch=sent.charAt(i);
			if(ch!=' ') {
				filter+=ch;
			}
		}
		System.out.println(filter);
				
	}
}
