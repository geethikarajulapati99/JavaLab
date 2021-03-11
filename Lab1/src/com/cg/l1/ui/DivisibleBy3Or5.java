package com.cg.l1.ui;

public class DivisibleBy3Or5 {
	public static void main(String[] args) {

		int sum = 0,sum1=0;
		int sum2=0;
		int n = 10;
		for (int i = 1; i <= n; ++i) {
			if(i%3==0) {
				sum = sum+i;
			}
			else if(i%5==0) {
		    	sum1=sum1+i;
		    }
			sum2=sum+sum1;
		}
		System.out.println(sum2);
	}

}