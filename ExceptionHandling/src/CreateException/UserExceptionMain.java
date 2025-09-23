package CreateException;

import java.util.Scanner;

public class UserExceptionMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new InvalidAgeException();
			}
		}
		catch(InvalidAgeException ex) {
			System.out.println("Exception is "+ ex);
		}
		System.out.println("Thank you");
	}

}
