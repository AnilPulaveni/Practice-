package com.brrsoftwares.ems.impl;

import java.util.ArrayList;
import java.util.List;

import com.brrsoftwares.ems.interfaces.EmployeeServicesLIST;
import com.brrsoftwares.ems.pojos.Employee;
import com.brrsoftwares.ems.utilites.EmployeeRecords;

public class EmployeeServicesImplLIST  implements EmployeeServicesLIST{   
	EmployeeRecords er =new EmployeeRecords();
	
	
	
	@Override
	public List<Employee> getAllEmps() {
		
		
			return  er.getAllEmps()  ;
		}

	
	
	@Override
	public List<Employee> getEmpsName(String empName) {
		// TODO Auto-generated method stub
	List<Employee> result = new ArrayList<Employee>();
	
	for (Employee emp:er.getAllEmps()) {
		if (emp.getEmpFirstName().startsWith(empName)) {
			result.add(emp);
		}
	}
		return result;
	}

	@Override
	public List<Employee> getEmps(double empsalery) {
		// TODO Auto-generated method stub
		List<Employee> result= new ArrayList<Employee>();
		
		
			for (Employee emp:er.getAllEmps()) {
				if(emp.getEmpSalary()>empsalery);
				result.add(emp);
				
			}
			return result;
	}

	@Override
	public List<Employee> getEmps(int depno) {
		// TODO Auto-generated method stub
		List<Employee> result= new ArrayList<Employee>();
			
		
		for (Employee emp:er.getAllEmps()) {
			if(emp.getEmpDepartmentNo() == depno) {
				result.add(emp);
			}
			
		}
			
		
		return result;
	}

	@Override
	public List<Employee> getEmps(int depno, double d) {
		// TODO Auto-generated method stub
		List<Employee> result= new ArrayList<Employee>();
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
