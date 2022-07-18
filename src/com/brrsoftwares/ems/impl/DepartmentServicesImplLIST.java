package com.brrsoftwares.ems.impl;

import java.util.List;

import com.brrsoftwares.ems.interfaces.DepartmentServicesLIST;
import com.brrsoftwares.ems.pojos.Department;
import com.brrsoftwares.ems.utilites.DepartmentRecords;

public class DepartmentServicesImplLIST implements DepartmentServicesLIST {
	
	DepartmentRecords dr= new DepartmentRecords();
	@Override
	
	public List<Department> getAllDepartments() {
		
		return dr.getDepsList();
	}

	
	
	

	
	

	

}
