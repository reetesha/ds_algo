package com.coding.excercise.leetcode.RomantoInteger13;

import java.util.HashMap;

/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */

class Solution {
    public int romanToInt(String s) {
    	
    	int countI = 0,countV=0,countX=0,countL=0,countC=0,countD=0,countM=0;
    	//if(s.length()>=15)
    	//	return 0;
    	
    	for(int i=0 ;i<s.length();i++) {
    	
    		if(s.charAt(i)=='I') {
    			countI+=1;
    		}
    		else if(s.charAt(i)=='V') {
    			if(i>0 && s.charAt(i-1)=='I') {
    				countV+=4;countI=0;
    			}
    			else
    				countV+=5;
    		}
    		else if(s.charAt(i)=='X') {
    			if(i>0 && s.charAt(i-1)=='I') {
    				countX+=9;countI=0;
    			}
    			else
    			countX+=10;
    		}
    		else if(s.charAt(i)=='L') {
    			if(i>0 && s.charAt(i-1)=='X') {
    				countL+=40;countX=0;
    			}
    			else
    			countL+=50;
    		}
    		else if(s.charAt(i)=='C') {
    			if(i>0 && s.charAt(i-1)=='X') {
    				countC+=90;countX=0;
    			}
    			else
    			countC+=100;
    		}
    		else if(s.charAt(i)=='D') {
    			if(i>0 && s.charAt(i-1)=='C') {
    				countD+=400;countC=0;
    			}
    			else
    			countD+=500;
    		}
    		else if(s.charAt(i)=='M') {
    			if(i>0 && s.charAt(i-1)=='C') {
    				countM+=900;countC=0;
    			}
    			else
    			countM+=1000;
    		}
    		
    	}
    	
        return countI + countV + countX + countL + countC + countD + countM;
    }
    public static void main(String arg[]) {
    	System.out.println(new Solution().romanToInt("MMMDCCCLXXXVIII"));;
    }
}