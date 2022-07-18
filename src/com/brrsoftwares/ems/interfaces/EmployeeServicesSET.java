package com.brrsoftwares.ems.interfaces;

import java.util.Set;

import com.brrsoftwares.ems.pojos.Employee;

public interface EmployeeServicesSET {
public Set<Employee> getAllEmps();
	
	public Set<Employee> getEmpsName(String name);
	
	public Set<Employee> getEmps(double salary);
	
	public Set<Employee> getEmps(int depno);
	public Set<Employee> getEmps(int depno,double salary);
	
	
}
