package com.coding.salesforceinterview;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'getTimes' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY time
     *  2. INTEGER_ARRAY direction
     */

    public static List<Integer> getTimes(List<Integer> time, List<Integer> direction) {
    // Write your code here
        
        List<Integer> entry = new LinkedList<>();
        List<Integer> exit = new LinkedList<>();
        for (int i = 0; i < time.size(); i++) {
                if (direction.get(i) == 0) {
                    entry.add(i);
                } else exit.add(i);
        }
        int curTime = -1;
        int prevDir = 1;
        //List<Integer> ret = new ArrayList<Integer>();
        int[] ret = new int[time.size()];

        while (!entry.isEmpty() && !exit.isEmpty()) {
            int curEntry = entry.get(0);
            int curExit = exit.get(0);
            int curEnterTime = Math.max(time.get(curEntry), curTime);
            int curExitTime = Math.max(time.get(curExit), curTime);

            if (curEnterTime < curExitTime) {
                //ret.set(curEntry,curEnterTime);
                ret[curEntry] = curEnterTime;
                prevDir = 0;
                entry.remove(0);
                curTime = curEnterTime + 1;
            }
            else if (curExitTime < curEnterTime) {
                //ret.set(curExit,curExitTime);
                ret[curExit] = curExitTime;
                prevDir = 1;
                exit.remove(0);
                curTime = curExitTime + 1;
            } else {
                if (prevDir == 0) {
                    //ret.set(curEntry, curEnterTime);
                	ret[curEntry] = curEnterTime;
                    entry.remove(0);
                    curTime = curEnterTime + 1;
                } else {
                    //ret.set(curExit,curExitTime);
                    
                    ret[curExit] = curExitTime;

                    exit.remove(0);
                    curTime = curExitTime + 1;                    
                }
            }
        }

        while (!entry.isEmpty()) {
            int curEntry = entry.remove(0);
            int curEnterTime = Math.max(time.get(curEntry), curTime);
            //ret.set(curEntry,curEnterTime);
            ret[curEntry] = curEnterTime;
            curTime = curEnterTime + 1;
        }

        while (!exit.isEmpty()) {
            int curExit = exit.remove(0);
            int curExitTime = Math.max(time.get(curExit), curTime);
            //ret.set(curExit,curExitTime);
            ret[curExit] = curExitTime;
            curTime = curExitTime + 1;
        }
        
        List<Integer> intList = new ArrayList<Integer>(ret.length);
        for (int i : ret)
        {
            intList.add(i);
        }
        
        return intList;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        
    	List<Integer> time = new ArrayList<Integer>();
    	time.add(0);
    	time.add(1);
    	time.add(1);
    	time.add(3);
    	time.add(3);
    	
    	
    	List<Integer> direction = new ArrayList<Integer>();
    	direction.add(0);
    	direction.add(1);
    	direction.add(0);
    	direction.add(0);
    	direction.add(1);
    	
    	List<Integer> result = Result.getTimes(time, direction);
    	System.out.println(result);

        
    }
}
