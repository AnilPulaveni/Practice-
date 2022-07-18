package com.brrsoftwares.main;

import java.util.List;

import com.brrsoftwares.ems.impl.DepartmentServicesImplLIST;
import com.brrsoftwares.ems.impl.EmployeeServicesImplLIST;
import com.brrsoftwares.ems.interfaces.DepartmentServicesLIST;
import com.brrsoftwares.ems.interfaces.EmployeeServicesLIST;
import com.brrsoftwares.ems.pojos.Department;
import com.brrsoftwares.ems.pojos.Employee;

public class EmployeeResultOfLIST {
	
public  static  void  main (String [] args) {
	System.out.println();
	System.out.println("DEPARTMENTS RECORD");
	System.out.println();
	EmployeeServicesLIST esi =new EmployeeServicesImplLIST();
	DepartmentServicesLIST dsi = new DepartmentServicesImplLIST();
	for (Department d :dsi.getAllDepartments() ) {
	System.out.println(d);
	}
	System.out.println();
	System.out.println("EMPLOYEES RECORD");
	System.out.println();
	for(Employee e:esi.getAllEmps()) {
		System.out.println(e);
	}
	System.out.println();
	System.out.println("EMPLOYEES NAME START WITH   A");
	System.out.println();
	
	
	List<Employee> result = esi.getEmpsName("Anil");
	if (result.size() ==0) {
		System.out.println("No Result Found");
	} else {
		for(Employee r:result) {
			System.out.println(r);
		}
	}
 
 System.out.println();
	System.out.println("Employee Salary  Greaterthen 40000 Employees  list");
	System.out.println();
	for(Employee e1: result) {
		System.out.println(e1);
	}
	System.out.println();
 System.out.println("DEPARTMENT 1 EMPLOYEES");
 System.out.println();
 for(Employee e : esi.getEmps(1)) {
 System.out.println(e);
 }
 System.out.println();
 System.out.println("DEPARTMENT 2 EMPLOYEES  WHOSE HAVE GREATERTHAN 40000 SALARY");
 System.out.println();
 for (Employee e:esi.getEmps(2, 40000.0)){
	 System.out.println(e);
	 
 }
 
 
 
 
}
}
