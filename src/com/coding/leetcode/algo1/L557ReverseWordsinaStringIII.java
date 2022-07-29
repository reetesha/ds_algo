package com.coding.leetcode.algo1;

import java.util.HashMap;

public class L557ReverseWordsinaStringIII {

    public String reverseWords(String s) {
		String[] str= s.split(" ");
		String result="";
		for(int i=0;i<str.length;i++) {
			result+=revers(str[i]);
			if(i<str.length-1) {
				result+=" ";

			}
		}
		
		return result;
	    }
    
    public String revers(String str) {
    	char[] ch =  str.toCharArray();
    	int left=0,right= ch.length-1;
    	while(left<right) {
    		char temp=ch[left];
    		ch[left++]= ch[right];
    		ch[right--]=temp;
    		
    	}
    	return String.valueOf(ch);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Let's take LeetCode contest";
				L557ReverseWordsinaStringIII l = new L557ReverseWordsinaStringIII();
				String result = l.reverseWords(s);
		
		//for(int i=0;i<result.length;i++)
		System.out.print(" "+result);
		
		
		
	}

}
