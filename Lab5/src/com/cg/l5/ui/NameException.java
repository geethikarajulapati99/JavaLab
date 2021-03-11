package com.cg.l5.ui;

import java.util.Scanner;

public class NameException extends Exception {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first name:");
		String firstname=scan.nextLine();
		System.out.println("Enter last name:");
		String lastname=scan.nextLine();
		
		try {
			if(firstname.length()==0 || lastname.length()==0) {
				throw new NameException("Invalid name");
			}
			else
				System.out.println("valid name");
		}
		catch(NameException a) {
			System.out.println(a);
		}
	}
	
	public NameException(String str) {
		System.out.println(str);
	}

}
