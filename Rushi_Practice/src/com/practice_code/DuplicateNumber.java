package com.practice_code;

public class DuplicateNumber {
	
	public static void main(String[] args) {
		
		int a[] = {8,8,3,4,3,0,6,0};
		
		
		for(int i=0;i<a.length;i++) {
			
			
			for(int j=i+1;j<a.length;j++) {
				
				
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
	}

}
