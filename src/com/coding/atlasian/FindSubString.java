package com.coding.atlasian;

public class FindSubString {
	
	public static void main (String arg[]) {
		FindSubString f = new FindSubString();
		char[] l1= {'1','2','7','2','3'};
		char[] l2= {'2','3'};
		System.out.println(f.find(l1,l2));
	}

	public int find(char[] l1, char[] l2) {
		
		int result=-1;
		int tempresult=-1;
		int j=0;
		int l2len=l2.length;
		for(int i=0;i<l1.length;i++) {
				if(l1[i]==l2[j]) {
					if(j==0)
						tempresult=i;
					j++;
				}
				else j=0;
		}
		if(j==l2len)
			result = tempresult;
		else 
			result = -1;
		
		return result;
	}

}
