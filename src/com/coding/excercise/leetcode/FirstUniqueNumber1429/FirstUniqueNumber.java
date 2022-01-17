package com.coding.excercise.leetcode.FirstUniqueNumber1429;

/*
 * Problem Statement
	Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string.
	Sample Input
	
	Example 1:
	Input: strs = ["flower","flow","flight"]
	Output: "fl"

	Example 2:
	Input: strs = ["dog","racecar","car"]
	Output: ""
	Explanation: There is no common prefix among the input strings.
	
	Constraints
	0 <= strs.length <= 200
	0 <= strs[i].length <= 200
	strs[i] consists of only lower-case English letters.
	
	You can find the problem here.
	
*/

public class FirstUniqueNumber {
	
	public static void main(String arg[]) {
		String[] strs = {"geeksforgeeks", "geeks", "geek", "geezer"};//{"dog","racecar","car"};
		String prefix = prefix(strs);
		System.out.println("prefix="+prefix);
	}

	private static String prefix(String[] strs) {
		int length= strs[0].length();
		String prefix = "";
		for(int i=0;i<length;i++) {
			int counter=0;
			char match=strs[0].charAt(i);
			char next=0;//strs[0].charAt(0);
			for(String s:strs) {
				System.out.println(s.charAt(i));
				next = s.charAt(i);
				if(next==s.charAt(i)&& match == next ) {
					match=s.charAt(i);
					counter++;
				}
				else {
					return prefix;
				}
					
			}
			if(counter==strs.length) {
				prefix =prefix+ match;
			}
		}
		return prefix;
	}
}
