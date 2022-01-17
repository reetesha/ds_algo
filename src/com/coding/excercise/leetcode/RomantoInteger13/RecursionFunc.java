package com.coding.excercise.leetcode.RomantoInteger13;

import java.util.ArrayList;
import java.util.List;

public class RecursionFunc {
	
	public static void main(String arg[]) {
		List<Object> object = new ArrayList<Object>();
		object.add(2);
		List<Object> nestedObj = new ArrayList<Object>();
		nestedObj.add(3);
		nestedObj.add(4);
		object.add(nestedObj);
		object.add(5);
		//Show1(object);
		Show2(object);
		
	}
	public static void Show1(List<Object> array) {
	    for(Object item: array) {
	        if(item instanceof  List) {
	            Show1((List<Object>)item); 
	        } else {
	            System.out.print(item);
	        }
	    }
	}
	public static void Show2(List<Object> array) {
	    for(int i = 0; i < array.size(); i++) {
	    	//System.out.print(array.get(i));
	        if(array.get(i) instanceof   List) {
	            Show2((List<Object>)array.get(i) ); 
	        } else {
	        	System.out.print(array.get(i) );
	        }
	    }
	}
}
