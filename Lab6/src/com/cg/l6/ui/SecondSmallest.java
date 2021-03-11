package com.cg.l6.ui;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SecondSmallest {
	 public int getSecondSmallest(int[] arr){
		 List<Integer> intList = new ArrayList<Integer>();
		 for(int i: arr){
        	 intList.add(i);
         }
		 Collections.sort(intList);
		 return intList.get(1);
	 }
	 
	 public static void main(String[] args) {
		 SecondSmallest s = new SecondSmallest();
		 
		 int arr[] = {43,54,65,76,32,76,87,43,66,7,32,54,43};
         int i = s.getSecondSmallest(arr);
         System.out.println(i);
	 }
}
