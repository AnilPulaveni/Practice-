package com.brrsoftwares.ems.interfaces;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.brrsoftwares.ems.pojos.Employee;

public interface EmployeeServicesMAP {
	
	public Map<Integer, Employee> getAllEmps();
	
	public Map<Integer, Employee> getAllEmps(String name);
	public Map<Integer, Employee> getAllEmps(double salary);
	
	public Map<Integer, Employee> getAllEmps(int depno );
	public Map<Integer, Employee> getAllEmps(int deono,double salary);
	

}
