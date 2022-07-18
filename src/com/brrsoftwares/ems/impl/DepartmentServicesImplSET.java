package com.brrsoftwares.ems.impl;

import java.util.Set;

import com.brrsoftwares.ems.interfaces.DepartmentServicesSET;
import com.brrsoftwares.ems.pojos.Department;
import com.brrsoftwares.ems.utilites.DepartmentRecords;

public class DepartmentServicesImplSET implements DepartmentServicesSET{
DepartmentRecords dr = new DepartmentRecords();
	@Override
	public Set<Department> getAlldeps() {
		// TODO Auto-generated method stub
		return dr.getDeptSet();
	}
	

}