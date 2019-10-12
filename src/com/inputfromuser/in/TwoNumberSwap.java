package com.inputfromuser.in;

public class TwoNumberSwap {
	static int x = 20;  
	static  int y = 30;  
	 
	static void swappingnumber() {
		  
		  x = x + y;  
		  y = x - y;  
		  x = x - y;  
		  System.out.println("value of x:" + x);  
		  System.out.println("value of y:" + y);  

	}
	public static void main(String[] args) {
		
		System.out.println("Before swapping");
		System.out.println("value of x:" + x);  
		  System.out.println("value of y:" + y);  
		  
		System.out.println("After swapping");
		swappingnumber();
	}

}
