package com.practice_code;

public class DuplicateChar {
	public static void main(String[] args) {
		
		String str = "rushikesh";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			for(int j=i+1;j<str.length();j++) {
				char bh= str.charAt(j);
				if(ch==bh) {
					System.out.println(ch);
				}
			}
		}
	}

}
