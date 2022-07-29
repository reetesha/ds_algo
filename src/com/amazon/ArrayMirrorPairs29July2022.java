package com.amazon;

import java.util.HashMap;

public class ArrayMirrorPairs29July2022 {

	public void arrayMirrorPairs(int[][] array) {

		HashMap<String, Integer> pairs = new HashMap<String, Integer>();
		for (int i = 0; i < array.length; i++) {
			int first = array[i][0];
			int second = array[i][1];
			String compKey = Integer.toString(second);
			compKey += Integer.toString(first);
			if (pairs.containsKey(compKey)) {
				System.out.println("{" + second + "," + first + "}");
				String compKeyRemove = Integer.toString(second);
				compKeyRemove += Integer.toString(first);
				int counter = pairs.get(compKey);
				if (counter == 1) {
					pairs.remove(compKeyRemove);
				} else {
					pairs.put(compKey, pairs.get(compKey) - 1);
				}
			} else {
				String compositeKey = Integer.toString(first);
				compositeKey += Integer.toString(second);
				if (pairs.containsKey(compositeKey)) {
					pairs.put(compositeKey, pairs.get(compositeKey) + 1);
				} else {
					pairs.put(compositeKey, 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[8][2];
		arr[0][0] = 2;
		arr[0][1] = 3;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 3;
		arr[2][1] = 4;
		arr[3][0] = 4;
		arr[3][1] = 3;
		arr[4][0] = 6;
		arr[4][1] = 7;
		arr[5][0] = 9;
		arr[5][1] = 10;
		arr[6][0] = 4;
		arr[6][1] = 3;
		arr[7][0] = 4;
		arr[7][1] = 3;
		new ArrayMirrorPairs29July2022().arrayMirrorPairs(arr);
	}
}
