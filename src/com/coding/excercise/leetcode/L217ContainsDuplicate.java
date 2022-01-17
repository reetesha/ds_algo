package com.coding.excercise.leetcode;

import java.util.HashMap;

public class L217ContainsDuplicate {
	
	/* Brute Force
	 * */
	 /*public boolean containsDuplicate(int[] nums) {
		int dup=nums[0];
		for (int i=0;i<nums.length;i++) {
			dup=nums[i];
			for (int j=0;j<nums.length;j++) {
				if(i!=j && dup==nums[j])
					return true;
			}
		}
		return false;
	}*/
	
	/*
	 * Success
		Details 
		Runtime: 8 ms, faster than 46.00% of Java online submissions for Contains Duplicate.
		Memory Usage: 52.1 MB, less than 45.95% of Java online submissions for Contains Duplicate.
	 */
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap();
		for (int i=0;i<nums.length;i++) {
				if(!map.isEmpty() && map.size()>0 && map.get(nums[i])!=null)
					return true;
				else { 
					map.put(nums[i],0);
				}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,1};
		int nums1[] = {1,2,3,4};
		
		System.out.println("Starting...");
		L217ContainsDuplicate l= new L217ContainsDuplicate();
		System.out.println("containsDuplicate = "+l.containsDuplicate(nums));
		
		System.out.println("Starting...");
		System.out.println("containsDuplicate = "+l.containsDuplicate(nums1));
	
		

	}

}
