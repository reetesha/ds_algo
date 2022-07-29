package com.coding.leetcode.algo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class L3LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
		
    	int maxSubString = 0;
    	HashMap<Character,Integer>  map = new HashMap<Character,Integer>();
    	int count=0;
    	for(int i=0;i<s.length();i++) {
    		
    		if(map.containsKey(s.charAt(i) )) {
    			int duplicate= map.get(s.charAt(i));
    			count = count-duplicate;
    			while(duplicate!=0) {
    			    
    				Iterator it = map.entrySet().iterator();
    				while (it.hasNext()) {
    			        Map.Entry<Character, Integer> pair = (Map.Entry)it.next();
    			        if(pair.getValue()== duplicate) {
        			    	it.remove(); // avoids a ConcurrentModificationException
        			    	duplicate--;
        			    }
    			        
    			    }
    				
    			
    				
    			}
    			count++;
				map.put(s.charAt(i), 1);

    		}else {
    			map.put(s.charAt(i), ++count);
    			maxSubString = Math.max(maxSubString, count);
    		}
    	}
    	
    	
    	return maxSubString;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb"; 
		//String s = "bbbbb"; 
		//String s = "pwwkew"; //3
		//String s = "dvdf";//ex=3
		//String s = "dxyzvdmnpqf";//10
		//String s = "ckilbkd";//5
		//String s = "tmmzuxt";//5
		//String s = "tabcefghijkdmmzuxtlpqrsjj";//5
		//String s ="wobgrovw";//6
		L3LongestSubstringWithoutRepeatingCharacters l = new L3LongestSubstringWithoutRepeatingCharacters();
		System.out.print(l.lengthOfLongestSubstring(s));
		
		
		
	}

}
