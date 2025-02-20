package com.coding.leetcode.algo1;

public class MissingNumber {

    public void missingNumber(int[] nums) {

        int summation = nums.length*(nums.length+1)/2,missingNum=summation;
        for(int i=0;i<nums.length;i++){
            missingNum = missingNum-nums[i];
        }
        System.out.println("Missing Number="+missingNum);
    }

    public void missingNumberXOR(int[] nums) {
        int allXOR=0;

        //XOR all numbers in range [0,n]
        for(int i=0;i<=nums.length;i++){
            allXOR = allXOR ^ i;
        }
        //XOR all numbers in the given array
        for(int i=0;i<nums.length;i++){
            allXOR = allXOR ^ nums[i];
        }
        System.out.println("Missing Number uisng XOR method="+allXOR);
    }

    public static void main(String arg[]) {
        new MissingNumber().missingNumber(new int[]{0,2,3});
        new MissingNumber().missingNumberXOR(new int[]{0,2,3});
    }
}
