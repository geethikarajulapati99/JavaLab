package com.cg.l6.ui;

import java.util.HashMap;
import java.util.Map.Entry;

public class Array {

	private static void countChars(char[] strArray) {
		
		 HashMap<Character, Integer> b  = new HashMap<Character, Integer>();
		 for (char c : strArray) { 
	            if (b.containsKey(c)) {
	            	b.put(c, b.get(c) + 1); 
	            } 
	            else { 
	            	b.put(c, 1); 
	            } 
	        }
		 
	       for (Entry<Character, Integer> entry : b.entrySet()) { 
	            System.out.println(entry.getKey() + "-" + entry.getValue());
	       } 
	}
	
	public static void main(String[] args) {
		String str = "Geethika"; 
		char[] strArray = str.toCharArray(); 
		countChars(strArray); 
		}
		
}
