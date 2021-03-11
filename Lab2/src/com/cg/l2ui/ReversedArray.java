package com.cg.l2ui;

import java.util.Arrays;

public class ReversedArray {
	static int[] getSorted(int arr[]) {
		int len=arr.length;
		
		for(int i=0; i<len; i++) {
			int temp=0;
			while(arr[i]!=0)
			{
				temp *=10;
				temp +=arr[i]%10;
				arr[i] /=10;
				
			}
			arr[i]=temp;
		}
		Arrays.sort(arr);
		return arr;
	}
	
	
	public static void main(String[] args) {
		int [] a= {122,109,150,681,283,272,756};
		
		for(int data:getSorted(a)) {
			System.out.println(data);
		}

	}

}