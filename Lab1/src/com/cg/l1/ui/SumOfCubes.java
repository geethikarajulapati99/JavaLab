package com.cg.l1.ui;

public class SumOfCubes {
	
	public static void main(String[] args) {
		int n=4;
		int sum=0;
		int k;
		
		for(int i=0;i<=n;i++) {
			k=(i*i*i);
			sum=k+sum;
		}
		System.out.println("Sum of cubes of given digit is "+ sum);
	}

}