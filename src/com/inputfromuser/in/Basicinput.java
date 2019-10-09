package com.inputfromuser.in;

import java.util.Scanner;

public class Basicinput {

	public static void main(String[] args) {

		Scanner sc=	new Scanner(System.in);
		System.out.println("enter ur number;");
		
	//int number=sc.nextInt();
		String s1=sc.next();
		System.out.println(sc.hashCode());
		System.out.println(sc.next());
		System.out.println();
		//System.out.println("square of a number: "+number*number);
	}

}
