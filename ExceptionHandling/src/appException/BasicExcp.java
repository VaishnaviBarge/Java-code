package appException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicExcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		try {
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[0]);
			System.out.println("Hello..");
			float ans=n1/n2;
			System.out.println("Result is "+ans);
		}
		catch(ArithmeticException|InputMismatchException|ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		/*catch(InputMismatchException ex) {
			System.out.println("Exception is :"+ex);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception is :"+ex);
		}*/
		catch(Exception ex) {
			System.out.println("Exception is :"+ex);
		}
		finally {
			System.out.println("kuch to gadbad he re baba");
		}
		System.out.println("thank you");
	}

}
