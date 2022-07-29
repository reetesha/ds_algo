package com.coding.leetcode.algo1;

import java.util.HashMap;

public class L283MoveZeroes {

	public void revers(char[] s) {
		int left=0,right=s.length-1;			
	while(left<right) {
		char temp = s[left];
		s[left++]=s[right];
		s[right--]=temp;
	}    
	}
	
	public static void main(String[] args) {
		
		char str[] = {'h','e','l','l','o'}; 
		L283MoveZeroes l = new L283MoveZeroes();
		l.revers(str);
		for(int i=0;i<str.length;i++) {
			System.out.print(" "+str[i]);
		}
				
	}

}
