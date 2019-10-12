package com.inputfromuser.in;

import java.util.Arrays;

public class StringAnagram {
	static void testAnagram(String s1,String s2) {
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		boolean status=true;
		if(str1.length()!=str2.length()) {
			status=false;
		}
		else {
			char[]ary1=str1.toLowerCase().toCharArray();
			char[]ary2=str2.toLowerCase().toCharArray();
			Arrays.sort(ary1);
			Arrays.sort(ary2);
			status=Arrays.equals(ary1, ary2);
			if(status)
				System.out.println("string is Anagram :"+" "+str1+" "+str2);
			else
				System.out.println(" not string is Anagram:"+" "+str1+" "+str2);
			
		}
	
	}
	public static void main(String[] args) {
		testAnagram("java",  "avaj");
	}

}
