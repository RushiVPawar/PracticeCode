package com.practice_code;

public class ArrayDup {
	public static void main(String[] args) {
		

int a[]= {1,2,3,4};
int b[]= {4,5,9,1};

for(int i=0;i<a.length;i++) {
	for (int j=0;j<a.length;j++)
	{
		if(a[i]==b[j])
		{
			System.out.println(a[i]);
		}
	}
}
	
	}
}
