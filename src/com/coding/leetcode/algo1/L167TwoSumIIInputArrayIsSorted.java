package com.coding.leetcode.algo1;

public class L167TwoSumIIInputArrayIsSorted {

	public void moveZero(int[] nums) {
		
		 int lastNonZeroFoundAt = 0;
		    // If the current element is not 0, then we need to
		    // append it just in front of last non 0 element we found. 
		    for (int i = 0; i < nums.length; i++) {
		        if (nums[i] != 0) {
		            nums[lastNonZeroFoundAt++] = nums[i];
		        }
		    }
		 	// After we have finished processing new elements,
		 	// all the non-zero elements are already at beginning of array.
		 	// We just need to fill remaining array with 0's.
		    for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
		        nums[i] = 0;
		    }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {1,2}; 
		//int k =3;
		int nums[] = {0,1,0,3,12}; 
		//int nums[] = {-1,-100,3,99}; 
		//int k =2;
		L167TwoSumIIInputArrayIsSorted l = new L167TwoSumIIInputArrayIsSorted();
		l.moveZero(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(" "+nums[i]);
		}
		//for(int i=0;i<result.length;i++)
		//System.out.print(" "+result[i]);
		
		
		
	}

}
