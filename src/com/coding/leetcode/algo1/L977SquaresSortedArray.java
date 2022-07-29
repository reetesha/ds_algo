package com.coding.leetcode.algo1;

public class L977SquaresSortedArray {

	public int search1(int[] nums,int target) {
		int pivot,left=0, right=nums.length-1;
		while(left<=right) {
			pivot = left+(right-left)/2;
			if(nums[pivot]==target) return pivot;
			if(target< nums[pivot] ) right = pivot -1;
			else left = pivot +1;
		}
		return -1;
	    }

	
	
	/*	Approach 1: 
	*/
	public int search(int[] nums,int target) {
		int middle = nums.length/2;
		if(nums[middle]>target) { 
			return  binarySearch(0, middle,nums,target);	
		}else {
			return binarySearch(middle, nums.length,nums,target);	
		}
		
	    }
	
	
	/*	:
	*/
	public int binarySearch(int start, int end,int[] nums, int target) {
		
		for(int i=start;i<end;i++) {
				if(target==nums[i]) return i;
		}
	    return -1;
	 
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {-1,0,3,5,9,12}; 
		//int target =9;
		int nums[] = {-1,0,3,5,9,12}; 
		int target =2;
		L977SquaresSortedArray l = new L977SquaresSortedArray();
		System.out.print(" "+l.search1(nums,target));
		
		
		
	}

}
