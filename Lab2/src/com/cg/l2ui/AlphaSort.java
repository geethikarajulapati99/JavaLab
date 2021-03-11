package com.cg.l2ui;

import java.util.Arrays;
import java.util.Scanner;

public class AlphaSort {
	static String[] sortStrings(String[] str) {
		 
		Arrays.sort(str);
		int len = str.length%2==0 ? str.length/2 : str.length/2+1;
		for(int i=0;i<len;i++) {
			str[i]=str[i].toUpperCase();
		}
		return str;
	}
	public static void main(String[] args) {
		int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of strings : ");
        count = scan.nextInt();
        String str[] = new String[count];
        Scanner scan1 = new Scanner(System.in);
         System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan1.next();
        }
        
        for(String sIterator:sortStrings(str))
        	System.out.println(sIterator);
	}

}