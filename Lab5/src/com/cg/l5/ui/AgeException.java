package com.cg.l5.ui;

import java.util.Scanner;

public class AgeException extends Exception {
	
	 public static void main(String[] args) {
		 
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter ur age :: ");
		 
		 int age = s.nextInt(); 
		 try {
			 if(age < 15) 
				 throw new AgeException("Invalid age");
			 else
				 System.out.println("Valid age");
		 }
		 catch (AgeException a) {
			 System.out.println(a);
		 }
	}
	 
	 public AgeException(String str) {
		 System.out.println(str);
	}
}
