package com.inputfromuser.in;

import java.util.Scanner;

public class SamplePalindrome {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in); 
System.out.println("input String from user");
String str1=sc.nextLine(); 
testpalindrome(str1);
	}
	
	static void testpalindrome(String str1) {
		String revrs="";		 
		 int length=str1.length();
		 
		 for (int i =length-1;i>=0; i--) 
			  revrs=revrs+str1.charAt(i);
		 
		 if(str1.equals(revrs))
			 System.out.println("its palindrome"+" "+str1);
		 else
			 System.out.println("its not palindrome"+" "+str1);


	}

}
