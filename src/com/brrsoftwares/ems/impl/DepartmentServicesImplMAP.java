package com.brrsoftwares.ems.impl;

import java.util.Map;

import com.brrsoftwares.ems.interfaces.DepartmentServicesMap;
import com.brrsoftwares.ems.pojos.Department;
import com.brrsoftwares.ems.utilites.DepartmentRecords;

public class DepartmentServicesImplMAP  implements DepartmentServicesMap {
	DepartmentRecords dr =new DepartmentRecords();
	@Override
	public Map<Integer, Department> getAllDeps() {
		// TODO Auto-generated method stub
		return  dr.getDepMap();
	}

} 