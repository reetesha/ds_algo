package com.coding.leetcode.algo1;

public class L189RotateArray {

	public void rotateArray(int[] nums,int k) {
		int n= nums.length;
		k=k%n;
		int result[]=new int[n];
		int c = k-1;
		if(n!=1) {
			for(int i=0;i<n;i++) {
				if(c>=0) {
					result[c]= nums[n-1-i];
					c--;
				}
				else {
					result[i] = nums[i-k];
				}
			}
			for(int i=0;i<n;i++) {
				nums[i]= result[i];
				System.out.print(" "+nums[i]);
			}
		}
		
	    }
	
	public void rotate(int[] nums,int k) {
		int n= nums.length;
		k=k%n;
		revers(nums,0,n-1);
		revers(nums,0,k-1);
		revers(nums,k,n-1);
	}
	 public void revers(int [] nums,int start, int end) {
		 while(start<end) {
			 int temp=nums[start];
			 nums[start]=nums[end];
			 nums[end]=temp;
			 start++;
			 end--;
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {1,2}; 
		//int k =3;
		int nums[] = {1,2,3,4,5,6,7}; 
		int k =3;
		//int nums[] = {-1,-100,3,99}; 
		//int k =2;
		L189RotateArray l = new L189RotateArray();
		l.rotate(nums,k);
		for(int i=0;i<nums.length;i++) {
			System.out.print(" "+nums[i]);
		}
		//for(int i=0;i<result.length;i++)
		//System.out.print(" "+result[i]);
		
		
		
	}

}
