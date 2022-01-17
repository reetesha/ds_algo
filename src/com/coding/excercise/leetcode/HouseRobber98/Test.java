package com.coding.excercise.leetcode.HouseRobber98;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Test().fun(5));

	}
	
	public int  fun(int n) {
		
		if(n<=1)
			return 1;
		System.out.println("****"+n);
		return fun(n-1) + fun(n-2);
	}

}
