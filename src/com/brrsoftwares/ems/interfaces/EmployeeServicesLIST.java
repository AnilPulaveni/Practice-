package com.brrsoftwares.ems.interfaces;

import java.util.List;
import java.util.Set;

import com.brrsoftwares.ems.pojos.Employee;
import com.brrsoftwares.ems.utilites.EmployeeRecords;

public interface EmployeeServicesLIST {
	
	
	
	public List<Employee> getAllEmps();
	public List<Employee> getEmpsName(String empName);
	public List<Employee> getEmps(double empsalery);
	public List<Employee> getEmps(int depno);
	public List<Employee> getEmps(int depno,double empsalery);

	
	
	
  








}
