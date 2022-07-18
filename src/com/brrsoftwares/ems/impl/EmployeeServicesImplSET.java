package com.brrsoftwares.ems.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.brrsoftwares.ems.interfaces.EmployeeServicesSET;
import com.brrsoftwares.ems.pojos.Employee;
import com.brrsoftwares.ems.utilites.EmployeeRecords;

public class EmployeeServicesImplSET  implements EmployeeServicesSET{   
	EmployeeRecords er =new EmployeeRecords();
	
	
	
	@Override
	public Set<Employee> getAllEmps() {
		
		
			return  er.getEmpsSet()  ;
		}
	
	
	@Override
	public Set<Employee> getEmpsName(String empName) {
		// TODO Auto-generated method stub
	Set<Employee> result = new HashSet<Employee>();
	
	for (Employee emp:er.getEmpsSet()) {
		if (emp.getEmpFirstName().startsWith(empName)) {
			result.add(emp);
		}
	}
		return result;
	}

	
	@Override
	public Set<Employee> getEmps(double empsalery) {
		// TODO Auto-generated method stub
		Set<Employee> result= new HashSet<Employee>();
		
		
			for (Employee emp:er.getEmpsSet()) {
				if(emp.getEmpSalary()>empsalery);
				result.add(emp);
				
			}
		return result;
	}

	@Override
	public Set<Employee> getEmps(int depno) {
		// TODO Auto-generated method stub
		Set<Employee> result= new HashSet<Employee>();
			
		
		for (Employee emp:er.getAllEmps()) {
			if(emp.getEmpDepartmentNo() == depno) {
				result.add(emp);
			}
			
		}
			
		
		return result;
	}

	@Override
	public Set<Employee> getEmps(int depno, double d) {
		// TODO Auto-generated method stub
		HashSet<Employee> result= new HashSet<Employee>();
		for (Employee emp:er.getAllEmps()) {
			if(emp.getEmpDepartmentNo() ==depno) {
				
				if(emp.getEmpSalary()>d) {
				result.add(emp);
			}
			
		}
		
		
		
		
		
		
	}
		return result;



	}

}
