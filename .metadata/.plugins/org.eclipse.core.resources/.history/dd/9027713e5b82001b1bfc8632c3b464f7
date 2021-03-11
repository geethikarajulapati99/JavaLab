package com.cg.l3.ui;

import java.util.StringTokenizer;
import java.util.Scanner;

public class SumInteger {
	
	public static void main(String args[]) {
		
        int n;
        int sum = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers :");
        
        String s = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        
        System.out.println("sum of the integers is: " + sum);
        scan.close();
    }

}