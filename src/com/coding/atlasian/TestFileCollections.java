package com.coding.atlasian;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;


public class TestFileCollections {

	@Test
	public void TestgenerateReport() {
		HashMap<String, FileInfo> fileCollections = new HashMap<String, FileInfo>();
		FileInfo fileinfo1 = new FileInfo();
		fileinfo1.setFileSize(100);
		fileinfo1.setCollections("collection1");
		
		FileInfo fileinfo2 = new FileInfo();
		fileinfo2.setFileSize(200);
		fileinfo2.setCollections("collection1");
		
		
		FileInfo fileinfo3 = new FileInfo();
		fileinfo3.setFileSize(200);
		fileinfo3.setCollections("collection2");
		
		FileInfo fileinfo4 = new FileInfo();
		fileinfo4.setFileSize(300);
		fileinfo4.setCollections("collection1");
		
		FileInfo fileinfo5 = new FileInfo();
		fileinfo5.setFileSize(10);
		//fileinfo.setCollections("collection1");
		
		
		fileCollections.put("file1.txt",fileinfo1 );
		fileCollections.put("file2.txt",fileinfo2);
		fileCollections.put("file3.txt",fileinfo3 );
		fileCollections.put("file4.txt",fileinfo4 );
		fileCollections.put("file5.txt",fileinfo5 );
		Atlasian2 at = new Atlasian2();
		
		HashMap<Integer, List<Collections>>  expectedFileCollections= new HashMap<Integer, List<Collections>>();
		
		List<Collections>  collections = new ArrayList<Collections>();
		
		Collections collection1 = new Collections();
		collection1.setCollection(fileinfo1.getCollections());
		collections.add(collection1);
		
		Collections collection2 = new Collections();
		collection2.setCollection(fileinfo2.getCollections());
		collections.add(collection2);
		
		Collections collection3 = new Collections();
		collection3.setCollection(fileinfo3.getCollections());
		collections.add(collection3);
		
		Collections collection4 = new Collections();
		collection4.setCollection(fileinfo4.getCollections());
		collections.add(collection4);
		
		Collections collection5 = new Collections();
		collection5.setCollection(fileinfo5.getCollections());
		collections.add(collection5);
		
		HashMap<Integer, List<Collections>>  res= at.generateReport(fileCollections);
		System.out.println(res.entrySet());
		expectedFileCollections.put(810,collections);
		
		assertEquals(expectedFileCollections.keySet(), res.keySet());
		
		//assertEquals(810, at.generateReport(fileCollections))
		//assertEquals(expecteds, actuals);(expectedFileCollections, at.generateReport(fileCollections));
	}
}
