package com.inputfromuser.in;

public class ReverseNum {
	
	/*static int reversenumber(int num) {
		 int reverse_num=0;
		while(num>0) {
			reverse_num=reverse_num*10 + num%10;
			num=num/10;
		}	
		
	return reverse_num;
	}*/
	

	public static void main(String[] args) {
		int num=4569;
			 int reverse_num=0;
				while(num>0) {
					reverse_num=reverse_num*10 + num%10;
					num=num/10;
				}	
				
			
System.out.println("Reverse digit ="+"  "+reverse_num);

	}

}
