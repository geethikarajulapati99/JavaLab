package com.cg.l2ui;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElementOfArray {
	
		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			System.out.print("enter the size of an array: ");
			
			int size=scan.nextInt();
			int array[]=new int[size];
			System.out.print("enter the numbers in an array: ");
			
			for(int i=0;i<size;i++) {
				array[i]=scan.nextInt();
			}
			
			int c=getsecondsmallest(array);
			System.out.println(c);
		}
		
	 public static int getsecondsmallest(int[]a) {
		 Arrays.sort(a);  
		 return a[1];  
	 }

}