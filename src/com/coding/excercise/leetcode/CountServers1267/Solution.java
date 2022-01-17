package com.coding.excercise.leetcode.CountServers1267;

/*
 * Question: You are given a map of a server center, represented as a m * n integer matrix grid, where 1 means that on that cell there is a server 
 * and 0 means that it is no server. Two servers are said to communicate if they are on the same row or on the same column.
 * 
 * Return the number of servers that communicate with any other server.
 * 
 * Input: grid = [[1,0],[0,1]]
	Output: 0
	Explanation: No servers can communicate with others.
	
	Input: grid = [[1,0],[1,1]]
	Output: 3
	Explanation: All three servers can communicate with at least one other server.
	
	Input: grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
	Output: 4
	Explanation: The two servers in the first row can communicate with each other. The two servers in the third column can communicate with each other.
	The server at right bottom corner can't communicate with any other server.

*/

public class Solution {

	int countServers = 0;
	
	 public int countServers(int[][] grid) {
	
		 System.out.print("Graph:\n");
		 
		 int  row = grid.length;System.out.println("rowlength="+row);
		 int  col = grid[0].length;System.out.println("collength="+col);
		 
		 for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("["+grid[i][j] + "] ");
			}
			System.out.println();
		}
		
		int  rowconnect[] = new int[row];
	    int  colconnect[] = new int[col];

	    /*Logic to create  1 array name rowconnet and colconnect which will count the 1 # and store it. 
	    	For Ex:
			Input Grid Arary = 
			[ 
				[1, 1, 0, 0], 
			  	[0, 0, 1, 0], 
			  	[0, 0, 1, 0], 
		      	[0, 0, 0, 1]
		     ] 
			rowconnect:[2, 1, 1, 1] 
			rowconnect:[1, 1, 2, 1] 
	    */
	    for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				if(grid[r][c]==1) {
					rowconnect[r]++;
					colconnect[c]++;
				}
			}
		}
	    
	    System.out.print("rowconnect:");
		for(int i=0;i<row;i++)
			System.out.print(rowconnect[i]+ " ");
		
		System.out.print("\nrowconnect:");
		
		for(int j=0;j<col;j++)
			System.out.print(colconnect[j]+ " ");
	    
		
		/*Logic to count the servers (1's from the rowconnect and colconnect above array] 
    	For Ex:
		Input 1 D arary = 
		rowconnect:[2, 1, 1, 1] 
		rowconnect:[1, 1, 2, 1] 
    */   
		System.out.println();
	    for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				System.out.println("\ngrid[r][c]="+ grid[r][c]+ "| rowconnect[r]="+rowconnect[r]+  "| colconnect[c]="+colconnect[c] );
				if(grid[r][c]==1 && (rowconnect[r]!=1 || colconnect[c]!=1)) {
					countServers++;
					System.out.print("======countServers="+countServers);
				}
			}
		}
	    System.out.println("\ncountServers: "+countServers);
		
		
		return countServers;
		
	}
	public static void main(String arg[]) {
		
		
		int[][] grid= { {1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
				
		Solution lc1267 = new Solution();
		lc1267.countServers(grid);
	}
}
