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
		
		int maxSubArray = nums[0];
		int currentSubArray = nums[0];
		int premaxSubArray = nums[0];
		for(int i=1;i<nums.length;i++) {
			if (nums[i]<0) {
				premaxSubArray = currentSubArray;
			}
			if(currentSubArray !=0)
				currentSubArray *= nums[i];
			else  			
				currentSubArray =nums[i];
			
			maxSubArray = Math.max(maxSubArray, currentSubArray);
			if((nums.length -1 )==i && currentSubArray<nums[i]) {
				maxSubArray = nums[i];
			}
			if (maxSubArray<premaxSubArray) {
				maxSubArray = premaxSubArray;
			}
		}
	    return maxSubArray;
	 
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {2,3,-2,4}; //6
		//int nums[] = {-2,3,-4};//24
		//int nums[] = {-2,0,-1};//0
		//int nums[] = {0,2};//2
		//int nums[] = {3,-1,4};//4
		int nums[] = {2,-5,-2,-4,3};//24
		L152MaximumProductSubarray l = new L152MaximumProductSubarray();
		System.out.print(" "+l.maxProduct1(nums));
		
		
		
	}

}
