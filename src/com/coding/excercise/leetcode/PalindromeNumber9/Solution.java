package com.coding.excercise.leetcode.PalindromeNumber9;

class Solution {
    public boolean isPalindrome(int x) {
		int result=0;
		long intMaxCheck;
		int reminder;
		int divide=x;
		if(x<0) return false;
		while(divide!=0){
			reminder = divide%10;
			divide = divide/10;
				result = result + reminder;
				if(divide!=0) {
					intMaxCheck = (long)result*10;
					if(intMaxCheck<Integer.MIN_VALUE|| intMaxCheck>Integer.MAX_VALUE)
						return false;
					result = result*10;
				}
			
		}
    return x==result; 
    }
    public static void main(String arg[]) {
    	System.out.println(new Solution().isPalindrome(11));
    }
}