package com.coding.excercise.leetcode.easy.TwoSum1;

import java.util.HashMap;

/*
 * Facebook Coding Interviews Two Sum (LeetCode) explanation. This interview question is from LeetCode and commonly asked by the following companies: Facebook, Google, Amazon, Airbnb, Microsoft, Uber, LinkedIn, Apple, Bloomberg, Microsoft, Alibaba, Adobe, and more.
   Problem description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
*/
public class Solution {
	 
	public int[] twoSum(int[] nums, int target) {
		int[] result= new int[2];
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			int difference = target-nums[i];
			if(map.containsKey(nums[i])) {
				result[0]= map.get(nums[i]);
				result[1]=i;
				return result;	
			}
			map.put(difference,i);
		}
		
		
		return result;       
	    
	}
	 
	 public static void main(String arg[]) {
		 int[] nums = {3,3};
		 int target= 6;
		 Solution s= new Solution();
		 int[] results = s.twoSum(nums, target);
		 //for(int num:results)
			// System.out.println(num);
		 
	 }
	 
}
