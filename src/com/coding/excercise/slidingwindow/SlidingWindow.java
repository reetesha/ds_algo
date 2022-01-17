package com.coding.excercise.slidingwindow;

public class SlidingWindow {



public int BruteForceAlgoFirstVersion(int arr[],int k){

	int max_sum=0;
	
	int temp_max=0;
	
	if(k>arr.length)
	{
		return max_sum = -1;
		
	}
	for(int i=0;i<arr.length;i++) {
		if( i+k>arr.length) {
			if(arr[i]>max_sum) {
				max_sum = arr[i];
			}
			//return max_sum;
		}
		else {
			for(int j=i;j<i+k;j++) {
				temp_max+=arr[j];
			}
			if(temp_max>max_sum)
				max_sum= temp_max;
			
			temp_max=0;
		}

	}
	
	return max_sum;
		
}



public int BruteForce(int arr[],int k){

	int max_sum=0;
	
	if(k>arr.length)
	{
		return max_sum = -1;
		
	}
	
	for(int i=0;i<k;i++) {
		max_sum+=arr[i];
	}
	
	int window_sum = max_sum;
	
	for(int j=k;j<arr.length;j++) {
		window_sum+=arr[j]-arr[j-k];
		if(window_sum>max_sum) {
			max_sum = window_sum;
		}
	}
	
	return max_sum;
		
}




	public static void main(String arg[]) {
		
		//int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        //int k = 4;
		
		//int arr[] = {100, 200, 300, 400};
       // int k = 2;
		
        int arr[] = {2, 3};
        int k = 3;
		
        
        SlidingWindow ob = new SlidingWindow();
        if(ob.BruteForce(arr,k)==-1) {
        	System.out.println("There is no subarray of size "+k+" as size of whole array is="+arr.length);
        }
        else {
        	System.out.println("Result="+ob.BruteForce(arr,k));
        }
  
        //printArray(arr);
	}
}
