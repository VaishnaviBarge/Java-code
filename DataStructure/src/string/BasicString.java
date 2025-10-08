package string;

import java.util.Arrays;
import java.util.HashMap;

public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=3;
		String str="hello java it is full";
		StringBuilder str1;
		StringBuffer str2;
		// Reverse a String
//		System.out.println("Reversed String is :"+ ReverseString(str));
		
		//Check Palindrom
//		System.out.println("is String Palindrome :"+ CheckIfPalidrome(str));
		
		//count vowels and consonants
//		CountVowelConsonant(str);
		
		//Count Frequency of vowels;
//		VowelFrequency(str);
		
		//Remove white space manually
//		RemoveWhiteSpace(str);
		
		//Check If Anagrams
		CheckIfAnagrams(str,str);
	}
	
	public static String  ReverseString(String str) {
		char[] arr=str.toCharArray();
		int j=arr.length-1;
		char temp;
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j--]=temp;
		}
		String str2=new String(arr);
		return str2;
	}
	
	public static boolean  CheckIfPalidrome(String str) {
		char[] arr=str.toCharArray();
		int j=arr.length-1;
		boolean palindrom = true;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]!=arr[j]) {
				palindrom=false;
			}
		}
		return palindrom;
	}
	
	public static void CountVowelConsonant(String str) {
		str=str.toLowerCase();
		int vowels=0;
		int consonants=0;
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("Number of consonants is :"+ consonants);
		System.out.println("Number of vowels is :"+ vowels);
		
		
	}
	public static void VowelFrequency(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			if("aeiou".indexOf(ch)!=-1) {
				map.put(ch, map.getOrDefault(ch	, 0 )+1);
			}
		}
		
		System.out.println(map);
	}
	
	public static void RemoveWhiteSpace(String str) {
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				sb.append(str.charAt(i));
			}
		}
		System.out.println("after removing whitespace : "+ sb);
	}
	
	public static void CheckIfAnagrams(String str1,String str2) {
		str1=str1.replace(" ", "").toLowerCase();
		str2=str2.replace(" ", "").toLowerCase();
		
		System.out.println(str1);
		System.out.println(str2);
		if(str1.length()!=str2.length()) {
			System.out.println("Not Anagrams");
			return;
		}
		
		int[] count=new int[26];
		
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)-'a']++;
			count[str2.charAt(i)-'a']--;
		}
		for(int c:count) {
			if(c!=0) {
				System.out.println("Not Anagrams");
				return;
			}
		}
		System.out.println("Anagrams");
		
		
	}
}
