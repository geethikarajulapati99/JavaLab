package com.cg.l6.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortedOrder {

	public  static List getvalues(HashMap hm) {
		List list=new ArrayList();
		Collection list1=hm.values();
		list1.addAll(list1);
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
		hm.put("Geethika", "22");
		hm.put("sai", "25");
		hm.put("harshini", "15");
		hm.put("harshi", "54");
		System.out.println(getvalues(hm));
}}
