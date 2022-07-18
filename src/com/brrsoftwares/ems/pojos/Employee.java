package com.brrsoftwares.ems.pojos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Employee {
	
	private int empNo;
	private String empFirstName;
	private String empSecondName;
	private String empDisignation;
	private int empDepartmentNo;
	private String empDepartmentName;
	private String address;
	private double empSalary;
	public Employee(int empNo, String empFirstName, String empSecondName, String empDisignation, int empDepartmentNo,
			String empDepartmentName,String address, double empSalary) {
		super();
		this.empNo = empNo;
		this.empFirstName = empFirstName;
		this.empSecondName = empSecondName;
		this.empDisignation = empDisignation;
		this.empDepartmentNo = empDepartmentNo;
		this.empDepartmentName = empDepartmentName;
	
		this.address = address;
		this.empSalary = empSalary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpSecondName() {
		return empSecondName;
	}
	public void setEmpSecondName(String empSecondName) {
		this.empSecondName = empSecondName;
	}
	public String getEmpDisignation() {
		return empDisignation;
	}
	public void setEmpDisignation(String empDisignation) {
		this.empDisignation = empDisignation;
	}
	public int getEmpDepartmentNo() {
		return empDepartmentNo;
	}
	public void setEmpDepartmentNo(int empDepartmentNo) {
		this.empDepartmentNo = empDepartmentNo;
	}
	
	public String getEmpDepartmentName() {
		return empDepartmentName;
	}
	public void setEmpDepartmentName(String empDepartmentName) {
		this.empDepartmentName = empDepartmentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee ........:).........[empNo=" + empNo + ", empFirstName=" + empFirstName + ", empSecondName=" + empSecondName
				+ ", empDisignation=" + empDisignation + ", empDepartmentNo=" + empDepartmentNo + ",empDepartmentName=" + empDepartmentName + ", address=" + address
				+ ", empSalary=" + empSalary + "]";
	}
	
	
}



/*
 *	@Override
	public Map<Employee, Integer> getAllEmps(String name) {

Map<Employee, Integer> set =er.getEmpsMap();
		
		Set<Entry<Employee, Integer>> it =set.entrySet();
		
		for(Entry<Employee, Integer> e :it) {
			
			if(e.getKey().getEmpFirstName().startsWith(name)) {
				
				set.clear();
				
				
							}
		}
		

		return set;

	}

      	@Override
	public Map<Employee,Integer> getAllEmps(double salary) {
		// TODO Auto-generated method stub
		Map<Employee, Integer> e = new LinkedHashMap<>();
Map<Employee, Integer> set =er.getEmpsMap();
 		 		Set<Entry<Employee, Integer>> it =set.entrySet();	
 		
		for(Entry<Employee, Integer> e1 :it) {
			
			if(e1.getKey().getEmpSalary()>salary) {
				put(set,1);
			
							}
		}


	   return e;
	}

	private void put(Map<Employee, Integer> set, int i) {
			// TODO Auto-generated method stub
			
		}

	@Override
	public Map<Employee,Integer> getAllEmps(int depno) {
		// TODO Auto-generated method stub

		Map<Employee, Integer> e = new LinkedHashMap<>();

		for (Employee emp : er.getAllEmps()) {

			if (emp.getEmpDepartmentNo() == depno) {
				e.put(emp, 6);
			}
		}

		return e;
	}

	@Override
	public  Map<Employee,Integer> getAllEmps(int deono, double salary) {

		// TODO Auto-generated method stub
		Map<Employee, Integer> e = new LinkedHashMap<>();

		for (Employee emp : er.getAllEmps()) {

			if (emp.getEmpDepartmentNo() == deono) {

				if (emp.getEmpSalary() > salary) {
					e.put(emp, 2);
				}
			}
		}

		return e;
	}

	@Override
	public Map<Employee, Integer> getAllEmps() {
		// TODO Auto-generated method stub
		return er.getEmpsMap();
	}
 
 * 
 */






























