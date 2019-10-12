package com.inputfromuser.in;

import java.util.Arrays;

public class ThirdLargestNdSmallestNumber {
	
	static int thirdlargestno(int ary[] ,int total_no) {
		Arrays.sort(ary);
		return ary[total_no-3];
		
	}
	static int thirdSmallestNo(int[]ary1) {
		Arrays.sort(ary1);
		
		/*for (int i = 0; i < ary1.length; i++) {
			for (int j = i+1; j < ary1.length; j++) {
				if(ary1[i]>ary1[j]) {
					int temp=ary1[i];
					ary1[i]=ary1[j];
					ary1[j]=temp;
				}
				
			}
		}
		*/
		return ary1[2];
			
	}

	public static void main(String[] args) {
		
		int ary[]= {2,3,5,2,1};
		int ary1[]= {5,6,2,3,1,8};
System.out.println("largest nunbet"+" "+thirdlargestno(ary, 5));
System.out.println("smallest number"+" "+thirdSmallestNo(ary1));
	}

}
