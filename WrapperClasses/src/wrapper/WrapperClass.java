package wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		
		//primitive Data Type 
		int n1=10;
		//Boxing- converting primitive data type to Nonprimitive 
		Integer iobj=new Integer(n1);
		//Unboxing- Convert object to primitive type 
		int x=iobj.intValue();
		
		//Java 5 onwards:
		int a=100;
		//Autoboxing
		Integer iobj2=a;
		int y=iobj2;
		
		String str="10";
		//String to Int
		int i=Integer.parseInt(str);
		//Int to String 
		String str2=Integer.toString(i);
		
		Integer j=i;
		
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toOctalString(i));
		
	}
}
