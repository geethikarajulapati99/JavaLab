package com.cg.l1.ui;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n, a=0,b=0,c=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the value of n:");
		n=scan.nextInt();
		
		for (int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
		scan.close();
	}
}