package com.coding.excercise.leetcode;

public class L238ProducofArrayExceptSelf {

	/*	Approach 1: Left and Right product lists 
		
		Runtime: 3 ms, faster than 31.98% of Java online submissions for Product of Array Except Self.
		Memory Usage: 56.2 MB, less than 42.23% of Java online submissions for Product of Array Except Self.
		
		Complexity analysis:
		Time complexity : O(N)O(N) where NN represents the number of elements in the input array. We use one iteration to construct the array LL, one to construct the array RR and one last to construct the answeranswer array using LL and RR.
		Space complexity : O(N)O(N) used up by the two intermediate arrays that we constructed to keep track of product of elements to the left and right.
	*/
	public int[] productExceptSelf(int[] nums) {
	        int answer[] = new int[nums.length];
	        
	        int left[] = new int[nums.length];
	        int right[] = new int[nums.length];
	        
	        left[0]=1;
	        for(int i = 1 ;i<nums.length;i++){
	        	left[i] = left[i-1] * nums[i-1];  
	        }
	        right[nums.length-1]=1;
	        for(int i = nums.length-2 ;i>=0;i--){
	        	right[i] = right[i+1] * nums[i+1];  
	        }
	        for(int i = 0;i<nums.length;i++){
	        	answer[i] = left[i] * right[i];  
	        }

	        return answer;
	    }
	
	
	/*	Approach 2: O(1) space approach 
	 * 
		Runtime: 4 ms, faster than 16.86% of Java online submissions for Product of Array Except Self.
		Memory Usage: 57.1 MB, less than 20.64% of Java online submissions for Product of Array Except Self.
		
		Complexity analysis:
		Time complexity : O(N)O(N) where NN represents the number of elements in the input array. We use one iteration to construct the array LL, one to update the array answeranswer.
		Space complexity : O(1)O(1) since don't use any additional array for our computations. The problem statement mentions that using the answeranswer array doesn't add to the space complexity.
	*/
	public int[] productExceptSelf2(int[] nums) {
	        int answer[] = new int[nums.length];
	        
	        
	        answer[0]=1;
	        for(int i = 1 ;i<nums.length;i++){
	        	answer[i] = answer[i-1] * nums[i-1];  
	        }
	        int r=1;
	        for(int i = nums.length-1 ;i>=0;i--){
	        	answer[i] = answer[i] * r;	
	        	r *= nums[i];  
	        }

	        return answer;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4}; 
		L238ProducofArrayExceptSelf l = new L238ProducofArrayExceptSelf();
		int outPut[] = l.productExceptSelf2(nums);
		
		for(int i=0;i<outPut.length;i++) {
			System.out.print(" "+outPut[i]);	
		}
		
	}

}
