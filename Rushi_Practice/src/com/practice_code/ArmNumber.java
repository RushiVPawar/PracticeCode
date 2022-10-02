package com.practice_code;

public class ArmNumber {
	
	public static void main(String[] args) {
		
		 int a=153;

		 int b=a%10;
		 int c=(a/10)%10;
		 int d=(a/100);
		 
		 if(a==((b*b*b)+(c*c*c)+(d*d*d))) {
			 System.out.println("Number is armstrong");
		 }
		 else {
			 System.out.println("Number is not armstrong");
		 }
	}

}

