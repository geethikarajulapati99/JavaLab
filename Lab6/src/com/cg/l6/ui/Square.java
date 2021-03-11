package com.cg.l6.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Square {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8};
		getSquares(ar);

	}
	
	static void getSquares(int[] inp){
		Map<Integer,Integer> result = new HashMap<>();
		for(int i : inp)result.put(i, i*i);
		for (Entry<Integer, Integer> entry : result.entrySet()) { 
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
	}
	
}
