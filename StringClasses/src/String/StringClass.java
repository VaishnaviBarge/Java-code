package String;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		System.out.println(str);
		str=str+"World";
		System.out.println(str);
		str=str+"!";
		System.out.println(str);
		
		System.out.println("Methods in string class ");
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf('l'));
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.concat("good bye"));
		System.out.println(str);
		str=str.concat("goog bye");
		System.out.println(str);
		
		//String Buffer
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.substring(2,4));
		System.out.println(sb.charAt(2));
		
		//StringBuilder
		
/*
 * A mutable sequence of characters. This class provides an API compatiblewith StringBuffer, but with no
 * guarantee of synchronization.This class is designed for use as a drop-in replacement for StringBuffer
 * in places where the string buffer was beingused by a single thread (as is generally the case).
 * Where possible,it is recommended that this class be used in preference to StringBuffer as it will
 * be faster under most implementations. 
 * The principal operations on a StringBuilder are the append and insert methods, which are overloaded 
 * so as to accept data of any type. Each effectivelyconverts a given datum to a string and then appends 
 * or inserts the characters of that string to the string builder. The append method always adds these 
 * characters at the endof the builder; the insert method adds the characters ata specified point. 
 * For example, if z refers to a string builder objectwhose current contents are "start", thenthe method
 *  callz.append("le") would cause the stringbuilder to contain "startle", whereas z.insert(4, "le") 
 *  would alter the string builder tocontain "starlet". 
 * In general, if sb refers to an instance of a StringBuilder,then sb.append(x) has the same effect as 
 * sb.insert(sb.length(), x). 
 */
		
	
	}

}
