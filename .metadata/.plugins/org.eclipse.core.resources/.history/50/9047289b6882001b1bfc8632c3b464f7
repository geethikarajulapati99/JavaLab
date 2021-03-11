package com.cg.l7.ui;

import java.util.Scanner;

import com.cg.l7.service.EmployeeServiceImpl;

public class EmployeeScheme {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		EmployeeServiceImpl emp= new EmployeeServiceImpl();
		
		while(true){
			System.out.println("Choose an Option (Enter a Number): \n 1. To add Employee Details \n 2. To Display Employee Details \n 3. To Display UserDetails \n 4. To Exit");
			switch(scan.nextInt()) {
			
			case 1:
				System.out.println("Enter Emp id: \t");
				int id = scan.nextInt();
				System.out.println("Enter Emp Name: \t");
				String name = scan.next();
				
				while(name.matches("\\d+")) {
					System.out.println("Please check Name");
					System.out.println("Enter Emp Name: \t");
					name = scan.next();
				}
				
				System.out.println("Enter Emp Salary: \t");
				double sal = scan.nextDouble();
				System.out.println("Enter Emp Designation: \t");
				String desg = scan.next();
				emp.addDetails(id, name, sal, desg);
				break;
			
			case 2:
				System.out.println("Contents are: \n");
				emp.displayDetails();
				break;
			
			case 3:
				System.out.println("Enter Employee id");
				System.out.println(emp.getUserDetails(scan.nextInt()));
				break;
			
			case 4:
				System.out.println("Exited");
				scan.close();
			}
			
		}
	}
}
