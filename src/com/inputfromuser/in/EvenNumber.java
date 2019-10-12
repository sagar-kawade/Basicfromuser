package com.inputfromuser.in;

import java.util.Scanner;

public class EvenNumber {

	
	
	public static void main(String[] args) {
  int no  ;
  String str="sagarkawade";
  System.out.println(str.length());
  
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the number :");
   no=sc.nextInt();
String  result =(no==0? "even":"odd");
		System.out.println(result);
		
		
	}

}
