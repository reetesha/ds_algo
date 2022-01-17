package com.coding.excercise.leetcode.ReverseInteger7;

/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
 
Constraints:

-2(Power31) <= x <= 2(power31) - 1
 */
public class Solution {

	public int reverse(int x) {
		int result=0;
		long intMaxCheck;
		int reminder;
		int divide=x;
		while(divide!=0){
			reminder = divide%10;
			divide = divide/10;
				result = result + reminder;
				if(divide!=0) {
					intMaxCheck = (long)result*10;
					if(intMaxCheck<Integer.MIN_VALUE|| intMaxCheck>Integer.MAX_VALUE)
						return 0;
					result = result*10;
				}
			
		}
    return result;    
    }

	public static void main(String arg[]) {
		System.out.print(new Solution().reverse(-1534236469));
	}
}
