package com.coding.excercise.leetcode;

public class L152MaximumProductSubarray {

	/*	Approach 1: 
	*/
	public int maxProduct(int[] nums) {
		int maxSubArray = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			int currentSubArray = 0;
			for(int j=i;j<nums.length;j++) {
				currentSubArray *= nums[j];
				maxSubArray = Math.max(currentSubArray, maxSubArray);
			}
		}
	    return maxSubArray;
	    
	    }
	
	
	/*	Approach 2:
	*/
	public int maxProduct1(int[] nums) {
		
		if(nums.length==0) return 0;
		
		int max_so_far = nums[0];
		int min_so_far = nums[0];
		int result = max_so_far;
		
		for(int i=1;i<nums.length;i++) {
			int curr = nums[i];
			int temp_max= Math.max(curr, Math.max(min_so_far*curr, max_so_far*curr));
			min_so_far= Math.min(curr, Math.min(min_so_far*curr, max_so_far*curr));
			max_so_far = temp_max;
			result = Math.max(result, max_so_far);
		}
	    return result;
	 
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,-2,4}; //6
		//int nums[] = {-2,3,-4};//24
		//int nums[] = {-2,0,-1};//0
		//int nums[] = {0,2};//2
		//int nums[] = {3,-1,4};//4
		//int nums[] = {2,-5,-2,-4,3};//24
		L152MaximumProductSubarray l = new L152MaximumProductSubarray();
		System.out.print(" "+l.maxProduct1(nums));
		
		
		
	}

}
