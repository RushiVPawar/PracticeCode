package com.practice_code;

public class EachLetterReverse {
	
	public void getEachWordReverse(String str) {
		
		String[] eachWord = str.split(" ");
		String revStr = "";
		
		for(int i=0;i<eachWord.length;i++) {
			
			String word = eachWord[i];
			String revWord = "";
			
			for(int j = word.length()-1;j>=0;j--) {
				
				revWord = revWord + word.charAt(j);
				
			}
			
			revStr = revStr + revWord + "";
			
		}
		System.out.println(revStr);
	}
public static void main(String[] args) {
	EachLetterReverse obj = new EachLetterReverse();
	String strGiven = " my name is rushi";
	
	System.out.println("The given string is>>" );
	System.out.println(strGiven);
	
	System.out.println("The string reversed word by word >>");
	obj.getEachWordReverse(strGiven);
}
}
