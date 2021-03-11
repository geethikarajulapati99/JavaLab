package com.cg.l3.ui;
import java.util.Scanner;

public class StringModify {
	
	public static void main(String[] args) {
		
		int p,q;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to be modified");
		
		int num=scan.nextInt();
		String n=String.valueOf(num);
	
		while (n!=null) {
			
			for(int i=0;i<n.length();i++) {
				if(n.charAt(i)>n.charAt(i+1)) {
					p=((n.charAt(i))-(n.charAt(i+1)));
					System.out.println("Modified string is:"+p);
					} else if(n.charAt(i)<n.charAt(i+1)) {
						q= ((n.charAt(i+1))-(n.charAt(i)));
						System.out.println("Modified string is:"+q);
						} if(n.charAt(i)==n.length()) {
							System.out.println(n.charAt(i));
						}	
				
			}
		}
	}
}