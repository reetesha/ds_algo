package com.coding.twilio;

public class ShortestPalindromePossible {
	
	public static void main(String arg[]) {
		
		String str= "anna";
		char[] s=str.toCharArray();
		boolean isPalindrome=true;
		int l=s.length;
		for(int i=0;i<l;i++) {
			System.out.println("s[i]=| "+s[i]+"*** s[l-1-i]="+s[l-1-i]+" | *** !(s[i]==s[l-i]="+!(s[i]==s[l-1-i]));
			if(!(s[i]==s[l-1-i])) {
				isPalindrome=false;
			}
			
		}
		System.out.println("isPalindrome="+isPalindrome);
	}

}
