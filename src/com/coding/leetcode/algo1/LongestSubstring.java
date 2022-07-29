package com.coding.leetcode.algo1;

import java.util.HashMap;

public class LongestSubstring {
    /**
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int globalMax=0,left=0;
    	for(int c=0;c<s.length();c++) {
        	if(map.containsKey(s.charAt(c))) {
        		left = Math.max(map.get(s.charAt(c)),left);
        	}
    		globalMax = Math.max(globalMax, c-left+1);
        	map.put(s.charAt(c),c+1);

    	}
    	return globalMax;
    }
    
	public static void main(String[] args) {
		//String s = "abcabcbb";//"pwwkew";
		//String s = "bbbbb"; 
				//String s = "pwwkew"; //3
				//String s = "dvdf";//ex=3
				//String s = "dxyzvdmnpqf";//10
				//String s = "ckilbkd";//5
				//String s = "tmmzuxt";//5
				//String s = "tabcefghijkdmmzuxtlpqrsjj";//5
				String s ="wobgrovw";//6
		System.out.println(new LongestSubstring().lengthOfLongestSubstring(s));
	}

}
