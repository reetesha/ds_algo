package com.coding.leetcode.algo1;

public class L704BinarySearch {

	public int[] sortedSquares(int[] nums) {
		int n=nums.length,left=0, right=nums.length-1;
		int result[] = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			int square;
			if(Math.abs(nums[left])<Math.abs(nums[right])) {
				square = nums[right];
				right--;
			} else {
				square = nums[left];
				left++;
				}
			result[i]=square*square;
		}
		
		
		return result;
	    }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {-4,-1,0,3,10}; 
		int nums[] = {-7,-3,2,3,11}; 
		//int nums[] = {-4,-1,0,3,10}; 
		L704BinarySearch l = new L704BinarySearch();
		int result[]=l.sortedSquares(nums);
		for(int i=0;i<result.length;i++) {
			System.out.print(" "+result[i]);
		}
		
		
	}

}
