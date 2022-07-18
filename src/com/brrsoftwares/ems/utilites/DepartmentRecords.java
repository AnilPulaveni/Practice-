package com.brrsoftwares.ems.utilites;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.brrsoftwares.ems.pojos.Department;

public class DepartmentRecords {

	private List<Department> depsList = null;
	private Set<Department> deptlistset = null;
	private Map<Integer, Department> depMap = null;

	public DepartmentRecords() {
		super();
		depsList = new ArrayList<Department>();
		deptlistset = new HashSet<Department>();
		depMap = new HashMap<Integer, Department>();
		// Record -1
		Department d1 = new Department(1, "IT", "Anil");
		depsList.add(d1);
		deptlistset.add(d1);
		depMap.put(1, d1);

		// Record -2
		Department d2 = new Department(2, "CLOUD COMPUTING", "Raju");
		depsList.add(d2);
		deptlistset.add(d2);
		depMap.put(2, d2);
		// Record -3
		Department d3 = new Department(3, "BUSINESS ANALYSIS", "venatesh");
		depsList.add(d3);
		deptlistset.add(d3);
		depMap.put(3, d3);
		// Record- 4
		Department d4 = new Department(4, "NETWORK ADMINISTRATION", "ramesh");
		depsList.add(d2);
		deptlistset.add(d4);
		depMap.put(4, d4);
		Department d5 = new Department(5, "SECURITY", "ravi");

		depsList.add(d5);
		deptlistset.add(d5);
		depMap.put(5, d5);
	}

	public List<Department> getDepsList() {
		return depsList;
	}

	public Set<Department> getDeptSet() {
		return deptlistset;
	}

	public Map<Integer, Department> getDepMap() {
		
		return depMap;
	}



}
