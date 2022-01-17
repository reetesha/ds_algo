package com.coding.atlasian;

import static org.junit.Assert.*;  
import org.junit.Test;  

public class TestFindSubString {
	
	@Test
	public void find() {
		FindSubString ft= new FindSubString();
		char[] l1= {'1','2','7','2','3'};
		char[] l2= {'2','3'};
		assertEquals(3, ft.find(l1,l2));
		
	}

}
