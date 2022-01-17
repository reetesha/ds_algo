package com.coding.excercise.leetcode.SuperEggDrop887;

/*
Author Reetesh Agrawal
 */

class Solution {
	public int superEggDrop(int K, int N) {
		
		//Step1 : Using Binary Search to minize the no if attemp
		//k = Egg
		//N = Floor
		int low=1, high=N;
		while(low<high) {
			int mid = ( low + high )/2;
			if(binomialCoefficient(mid , K , N) < N){
				low = mid+1;
			} 
			else {
				high = mid;
				
			}
		}
		return low;
	        
	}
	
	public int binomialCoefficient(int mid ,int  K ,int N) {
		
		int sum=0, term=1;
		
		for(int i=1; i<=K && sum < N;i++) {
			term *= mid-i+1;
			term /=i;
			sum +=term;
			
		}
		return sum;
	}
	
	
    public static void main(String arg[]) {
    	System.out.println(new Solution().superEggDrop(2,100));
    }
}