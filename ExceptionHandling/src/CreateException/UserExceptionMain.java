package CreateException;

import java.util.Scanner;

public class UserExceptionMain {

	public static void display(String name,int age,float percentage) throws InvalidAgeException, InvalidPercentageException, Exception
		{
			try {
				if(age<18) {
					throw new InvalidAgeException();
				}
				if(percentage<60) {
					throw new InvalidPercentageException();
				}
				System.out.println("Valid Profile !");
			}
			catch(InvalidAgeException|InvalidPercentageException ex) {
				System.out.println("Exception is "+ ex);
				throw ex;
			}
			catch(Exception ex) {
				System.out.println("Exception is "+ ex);
				throw ex;
			}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		System.out.println("Enter your Percentage :");
		float percentage=sc.nextFloat();
		try {
			display(name,age,percentage);
			System.out.println("Congrats...!");
		} catch (InvalidAgeException|InvalidPercentageException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("thankyou..");
	}
	

}
