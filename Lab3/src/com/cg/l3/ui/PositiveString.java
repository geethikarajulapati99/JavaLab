package com.cg.l3.ui;

import java.util.Scanner;

public class PositiveString {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Alphabetical String ");
		
		String Str=scan.nextLine();
		
		if(Str.charAt(0)<=Str.charAt(1)&&Str.charAt(1)<=Str.charAt(2)&&
			Str.charAt(2) <= Str.charAt(3) && Str.charAt(3) <=Str.charAt(4)) {
			System.out.println("Positive String");
		} else
			System.out.println("Negative String");
	}

}