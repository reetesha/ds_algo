package com.interview;

public class Board {
    int[][] grid = new int[3][3];

    public int[][] getGrid() {
        return grid;
    }

    public boolean isFinished() {
    	//
       if(getWinner()==0)
    	   return true;
        return false;
    }

    public int getWinner() {
    	//
        int count=0;
        for(int i=0;i<getGrid().length;i++) {
        	for(int j=0;j<getGrid().length;j++) {
        		if(getGrid()[i][j]== 0) {
        			count++;
        		}
        		
        	}
        }
        if(count == 3)
        {
        	System.out.println("Winner");
        	
            return 0;
        }
    	return -1;
    }


}
