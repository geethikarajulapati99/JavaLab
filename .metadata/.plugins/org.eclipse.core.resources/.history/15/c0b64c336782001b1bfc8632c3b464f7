package com.cg.l5.ui;

import java.util.Scanner;

public class EmployeeException extends Exception {
	public static void main (String args[]) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter empname:");
		String empname= scan.nextLine();
		System.out.println("Enter salary:");
		int salary=scan.nextInt();
		
		try {
			if(salary<3000) {
				throw new EmployeeException("invalid salary");
			}
			else
				System.out.println("Valid salary");
		}
		catch(EmployeeException a) {
			System.out.println(a);
		}
	}
	
	public  EmployeeException(String sal)
	{
		System.out.println(sal);
	}
}
