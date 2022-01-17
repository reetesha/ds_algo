package com.coding.atlasian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Atlasian2 {
/*
 * file1.txt (size: 100)
file2.txt (size: 200) in collection "collection1"
file3.txt (size: 200) in collection "collection1"
file4.txt (size: 300) in collection "collection2"
file5.txt (size: 10)
photo, video , pic

i/o - List of files[] - file1, file2, file3, file4, file5
o/p 
	list of file information - 
	{ Totalfilesizeof all files  :810 ,
	Top N collections (by file size),
	
	{
	
	hasmap ( filename 
	
	} 
 */
	public static void main(String[] args) {
		//Atlasian2 at= new Atlasian2();
		//at.generateReport(fileInfo);
		// TODO Auto-generated method stub

	}
	
	public HashMap<Integer, List<Collections>> generateReport(HashMap<String, FileInfo> fileInfo){
		HashMap<Integer, List<Collections>>  fileCollections= new HashMap<Integer, List<Collections>>();
		List<Collections> collectionlist = new ArrayList<Collections>();
		
		int totalFileSize = 0;
		  for (Map.Entry<String, FileInfo> entry : fileInfo.entrySet()) {
			  totalFileSize =  totalFileSize + entry.getValue().getFileSize();
			  System.out.println("Key = " + entry.getKey() +
                      ", Value = " + entry.getValue());
			  Collections collections = new Collections();
			  collections.setCollection(entry.getValue().getCollections());
			  collections.setFilesize(entry.getValue().getFileSize());
			  collectionlist.add(collections);
			  
		  }
		  fileCollections.put(totalFileSize, collectionlist); 
			  //System.out.println("Key = " + entry.getKey() +
	            //                 ", Value = " + entry.getValue());
		return fileCollections;
	}
	


}
