package com.cg.l1.ui;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner prime=new Scanner(System.in);
		System.out.println("enter the Range of primes: ");
		
		int a=prime.nextInt();
		prime.close();
		for(int i=1;i<=a;i++) {
			int count=0;
			for(int n=i;n>=1;n--) {
				if(i%n==0) {
					count=count+1;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}

}