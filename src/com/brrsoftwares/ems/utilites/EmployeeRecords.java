package com.brrsoftwares.ems.utilites;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.brrsoftwares.ems.pojos.Employee;

public class EmployeeRecords {
	private Set<Employee> empsSet = null;

	private List<Employee> empsList = null;
	private Map<Integer, Employee> empsMap = null;

	public EmployeeRecords() {
		super();
		empsList = new ArrayList<Employee>();
		empsSet = new HashSet<Employee>();
		empsMap = new HashMap<Integer, Employee>();
		// Record -1
		Employee e1 = new Employee(101, "Anil", "Pulaveni", "manager", 1, "IT", "RajannaSircilla", 300000.0);

		empsList.add(e1);
		empsSet.add(e1);
		empsMap.put( 1,e1);
		// Record -1
		Employee e2 = new Employee(102, "raju", "sirra", "manager", 2, "CLOUD COMPUTING", "RajannaSircilla", 300000.0);

		empsList.add(e2);
		empsSet.add(e2);
		empsMap.put( 2,e2);
		// Record -1
		Employee e3 = new Employee(103, "venkatesh", "wdd", "manager", 3, "BUSINESS ANALYSIS", "Guntoor", 300000.0);
		empsSet.add(e3);
		empsList.add(e3);
		empsMap.put( 3,e3);
		// Record -1
		Employee e4 = new Employee(104, "ramesh", "dcdcdc", "manager", 4, "NETWORK ADMINISTRATION", "Siddipet",
				300000.0);
		empsSet.add(e4);
		empsList.add(e4);
		empsMap.put( 4,e4);
		// Record -1
		Employee e5 = new Employee(105, "ravi", "sded", "manager", 5, "SECURITY", "RajannaSircilla", 300000.0);
		empsSet.add(e5);
		empsList.add(e5);
		empsMap.put( 5,e5);
		// Record -1
		Employee e6 = new Employee(106, "rakesh", "dddc", "java devloper", 1, "", "jagithyala", 30000.0);
		empsSet.add(e6);
		empsList.add(e6);
		empsMap.put( 6,e6);
		// Record -1
		Employee e7 = new Employee(107, "ravi kumar", "dfrc", "java devloper", 3, "BUSINESS ANALYSIS",
				"RajannaSircilla", 300000.0);
		empsSet.add(e7);
		empsList.add(e7);
		empsMap.put( 7,e7);
		// Record -1
		Employee e8 = new Employee(108, "Anil kumar", "wwwwsw", "java devloper", 2, "CLOUD COMPUTING", "Siddipet",
				300000.0);
		empsSet.add(e8);
		empsList.add(e8);
		empsMap.put( 8,e8);
		// Record -1
		Employee e9 = new Employee(109, "vinay", "hdedeed", "java devloper", 4, "NETWORK ADMINISTRATION",
				"RajannaSircilla", 30000.0);
		empsSet.add(e9);
		empsList.add(e9);
		empsMap.put( 9,e9);
		// Record -1
		Employee e10 = new Employee(110, "mahendhar", "ddde", "java devloper", 5, "SECURITY", "medhak", 30000.0);
		empsSet.add(e10);
		empsList.add(e10);
		empsMap.put( 10,e10);
		// Record -1
		Employee e11 = new Employee(111, "raju kumar", "dccd", "java devloper", 1, "IT", "RajannaSircilla", 30000.0);
		empsSet.add(e11);
		empsList.add(e11);
		empsMap.put( 11,e11);
		
	}

	public List<Employee> getAllEmps() { 
		// TODO Auto-generated method stub
		return empsList;
	}

	public Set<Employee> getEmpsSet() {
		return empsSet;
	}

	public Map<Integer, Employee> getEmpsMap() {
		
		
		return empsMap;
	}

}
