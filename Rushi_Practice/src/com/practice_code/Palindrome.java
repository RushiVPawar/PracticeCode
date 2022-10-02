package com.practice_code;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		getPalindrome(a);
				
	}
		
	public static void getPalindrome(int a)
	{
	int num=a;
	 int reverse=0;
	
	while(num!=0)
	{
		reverse=reverse*10;
	reverse=reverse+num%10;
			num=num/10;
			
	 }
	
	//int b=reverse;
	if(a==reverse)
	{
	System.out.println("number is palindrome");	
	}
	else {
		System.out.println("not");
	}
	
	
	
}
}