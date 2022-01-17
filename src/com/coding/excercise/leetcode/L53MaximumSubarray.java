package com.coding.excercise.leetcode;

public class L53MaximumSubarray {

	/*	Approach 1: 
	*/
	public int maxSubArray(int[] nums) {
		int maxSubArray = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			int currentSubArray = 0;
			for(int j=i;j<nums.length;j++) {
				currentSubArray += nums[j];
				maxSubArray = Math.max(currentSubArray, maxSubArray);
			}
		}
	    return maxSubArray;
	    
	    }
	
	
	/*	Approach 2:
	*/
	public int maxSubArray1(int[] nums) {
		
		 // Initialize our variables using the first element.
		int maxSubArray = nums[0];
		int currentSubArray = nums[0];
		
		 // Start with the 2nd element since we already used the first one.
		for(int i=1;i<nums.length;i++) {
				// If current_subarray is negative, throw it away. Otherwise, keep adding to it.
				currentSubArray = Math.max(nums[i],currentSubArray+nums[i]);
				maxSubArray = Math.max(maxSubArray, currentSubArray);
		}
	    return maxSubArray;
	 
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4}; 
		L53MaximumSubarray l = new L53MaximumSubarray();
		System.out.print(" "+l.maxSubArray1(nums));
		
		
		
	}

}
