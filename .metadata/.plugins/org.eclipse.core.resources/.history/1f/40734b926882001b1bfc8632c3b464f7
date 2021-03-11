package com.cg.l7.service;

import java.util.HashMap;

import com.cg.l7.model.Employee;

public class EmployeeServiceImpl  implements IEmployeeService{
	
	static HashMap<Integer, Employee> details= new HashMap<>();
	static {
		details.put(1001, new Employee());
	}

	@Override
	public String getUserDetails(int id) {
		if(details.containsKey(id)) {
			Employee e = details.get(id);
			return "ID : "+e.getId()+"\nName : "+e.getName()+"\nSalary : "
					+e.getSalary()+"\n Designation : "+e.getDesignation() +"\nInsurance Scheme : "+e.getInsuranceScheme();
		}
		return "Employee does not Exist";
		
	}

	public String insuranceScheme(double salary,String desg) {
		
		if((salary>5000 && salary<20000) || desg.equalsIgnoreCase("System Associate"))return "Scheme C";
		else if((salary>=20000 && salary<40000) || desg.equalsIgnoreCase("Programmer"))return "Scheme B";
		else if((salary>=40000) || desg.equalsIgnoreCase("Manager"))return "Scheme A";
		else if(salary<5000 || desg.equalsIgnoreCase("Clerk"))return "No Scheme";
		return "Not Applicable";
	}

	@Override
	public void displayDetails() {
		for(int i : details.keySet()) System.out.println(getUserDetails(i));
	}
	public boolean addDetails(int id,String name,double salary,String desg) {
		if(verification(name,salary,desg)) {
			details.put(id, new Employee());
			return true;
		}
		return false;
	}
	
	public boolean verification(String name,double salary,String desg) {
		if(name.length()==0)return false;
		if(salary<=0)return false;
		if(desg.isEmpty())return false;
		return true;
	}

	}
