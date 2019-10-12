package com.inputfromuser.in;

public class FibonacciSeries {

	 static int first =0, second=1,next=0;

	
	
	public static void main(String[] args) {

		int limit=15;
	    System.out.println(first+" "+second); 
	    
	    testfibonacci(limit-2);
	    
		
	        	}
	
static void testfibonacci(int limit) {
	if(limit>0) {
		next = first+second;
		first=second;
		second=next;
		
System.out.println("  "+next);	

testfibonacci(limit-1);
	}
	
	
	
}
}