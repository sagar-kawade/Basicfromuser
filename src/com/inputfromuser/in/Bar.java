package com.inputfromuser.in;

public class Bar extends Foo{
	int x=5;
	void m1() {
		System.out.println("X="+x);
	}

	public static void main(String[] args) {
		
		
		Foo f=new Bar();
		f.m1();
	}

}

class Foo{

	
	 Foo() {
              m1();
	 
	 }

	void m1() {
		System.out.println("Foo");
	}


}