package com.coding.matrix;

/**
 * Date 28/09/2021
 * @author ragrawal2
 * 
 * Video link - https://youtu.be/2xvJ41-hsoE
 * 
 * Given a 2D matrix of 0s and 1s. Find largest rectangle of all 1s
 * in this matrix.
 * 
 * 1. Maintain a temp array of same size as number of columns. 
 * 2. Copy first row to this temp array and 
 * 3. find largest rectangular area for histogram. 
 * 4. Then keep adding elements of next row to this temp array if they are not zero. 
 * 5. If they are zero then put zero there.
 * 6. Every time calculate max area in histogram.
 * 
 * Time complexity - O(rows*cols)
 * Space complexity - O(cols) - if number of cols is way higher than rows
 * then do this process for rows and not columns.
 * 
 * References:
 * http://www.careercup.com/question?id=6299074475065344
 */
public class MaximumRectangularSubmatrixOf1s {
	
	public static void main( String arg[]) {
		int input[][]= {{1,1,1,0},
		                {1,1,1,1},
		                {0,1,1,0},
		                {0,1,1,1},
		                {1,0,0,1},
		                {1,1,1,1}};
		System.out.println(new MaximumRectangularSubmatrixOf1s().maximum(input));
	}
	public int maximum1(	int input[][]) {
		
		int row = input.length;
		int col = input[0].length;
		int max =0;
		
		int [] temp= new int[input[0].length];
		
		for(int i=0;i<col;i++) {
			temp [i]= input[0][i];
		}

		for(int r=1;r<row;r++) {
			for(int c=0;c<input[0].length;c++) {
					if(input[r][c]==0) {
						temp [c]= 0;
					}
					else {
						temp [c]= temp [c]+input[r][c];	
						if(temp[c]>max)
							max=temp[c];
					}
					
			}
		}
		return max;
		
	}
	
    public int maximum(int input[][]){
        int temp[] = new int[input[0].length];
        MaximumHistogram mh = new MaximumHistogram();
        int maxArea = 0;
        int area = 0;
        for(int i=0; i < input.length; i++){
            for(int j=0; j < temp.length; j++){
                if(input[i][j] == 0){
                    temp[j] = 0;
                }else{
                    temp[j] += input[i][j];
                }
            }
            area = mh.maxHistogram(temp);
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }

}
