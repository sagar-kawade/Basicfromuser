package com.inputfromuser.in;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc1=new Scanner(System.in);
		System.out.println("enter input number :");
		int no= sc1.nextInt();
		
		testprime(no);
		// sc1.close();
		
		
		
	}

	static void testprime(int no) {
		int temp;
		boolean primeno=true;
		for (int i = 2; i <=no/2; i++) {
			temp=no%i;
			if (temp==0) {
				primeno=false;
				break;
			}
		}
		if(primeno)
			   System.out.println(" is a Prime Number"+" "+no );
			else
			   System.out.println(" is not a Prime Number"+" "+no);
		   
		
		
	}
}
