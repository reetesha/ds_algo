package com.coding.leetcode.algo1;

import java.util.HashMap;

public class L344ReverseString {

	public int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int difference;
		for(int i=0;i<numbers.length;i++) {
			difference = target-numbers[i];
			if(map.containsKey(numbers[i])) {
				result[0]=map.get(numbers[i])+1;
				result[1] = i+1;
			}
			map.put(difference,i);

		}
		
		return result;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {1,2}; 
		//int k =3;
		//int nums[] = {2,7,11,15};
		//int target =9;
		int nums[] = {-1,0}; 
		int target =-1;
		L344ReverseString l = new L344ReverseString();
		int result[] = l.twoSum(nums, target);
		for(int i=0;i<result.length;i++) {
			System.out.print(" "+result[i]);
		}
		//for(int i=0;i<result.length;i++)
		//System.out.print(" "+result[i]);
		
		
		
	}

}
