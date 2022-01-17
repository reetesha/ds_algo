package com.coding.matrix;

import java.util.Stack;

/**
 * 12/23/2014
 * @author ragrawal2
 * 
 * Video link https://youtu.be/ZmnqCZp9bBs
 * 
 * Given an array representing height of bar in bar graph, find max histogram
 * area in the bar graph. Max histogram will be max rectangular area in the
 * graph.
 * 
 * Maintain a stack
 * 
 * 1. If stack is empty or value at index of stack is less than or equal to value at current 
 * index, push this into stack.
 * 
 * 2. Otherwise keep removing values from stack till value at index at top of stack is 
 * less than value at current index.
 * 
 * While removing value from stack calculate area
 * if stack is empty 
 * it means that till this point value just removed has to be smallest element
 * so area = input[top] * i
 * if stack is not empty then this value at index top is less than or equal to 
 * everything from stack top + 1 till i. So area will
 * area = input[top] * (i - stack.peek() - 1);
 * Finally maxArea is area if area is greater than maxArea.
 * 
 * 
 * Time complexity is O(n)
 * Space complexity is O(n)
 * 
 * References:
 * http://www.geeksforgeeks.org/largest-rectangle-under-histogram/
 */
public class MaximumHistogram {
	
	public static void main( String arg[]){
		int[] input = {2,2,2,6,1,5,4,2,2,2,2};
		int maxArea = new MaximumHistogram().maxHistogram(input);
		assert maxArea == 12;
	}

	
	public int maxHistogram(int input[]) {
		Stack<Integer> stack = new Stack<Integer>();
		
		return 0;
	}
}
