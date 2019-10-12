package com.inputfromuser.in;

public class TwoNumberSwap {
	static int first = 20;  
	static  int second = 30;  
	 
	static void swappingnumber() {
		  
		  first = first + second;  
		  second = first - second;  
		  first = first - second;  
		  System.out.println("value of x:" + first);  
		  System.out.println("value of y:" + second);  

	}
	public static void main(String[] args) {
		
		System.out.println("Before swapping");
		System.out.println("value of x:" + first);  
		  System.out.println("value of y:" + second);  
		  
		System.out.println("After swapping");
		swappingnumber();
	}

}
