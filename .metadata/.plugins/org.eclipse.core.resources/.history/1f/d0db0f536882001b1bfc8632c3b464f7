package com.cg.l6.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VoterList {

	public static void main(String[] args) {
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		m.put(45101,2);
		m.put(56102,45);
		m.put(87103,18);
		m.put(67104,6);
		m.put(98105,21);
		System.out.println(votersList(m));
		
	}

	private static List<Integer> votersList(Map<Integer, Integer> m) {
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> s=m.keySet();
		for(int i:s) {
			if(m.get(i)>=18) {
				list.add(i);
			}
		}
		
		return list;
	}
}
