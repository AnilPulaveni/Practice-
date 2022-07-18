package com.brrsoftwares.ems.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.brrsoftwares.ems.interfaces.EmployeeServicesMAP;
import com.brrsoftwares.ems.pojos.Employee;
import com.brrsoftwares.ems.utilites.EmployeeRecords;

public class EmployeeServicesImplMAP implements EmployeeServicesMAP {
	EmployeeRecords er = new EmployeeRecords();

	@Override
	public Map<Integer, Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return er.getEmpsMap();
	}

	@Override
	public Map<Integer, Employee> getAllEmps(String name) {
		Map<Integer, Employee> result = new HashMap<Integer, Employee>();

		Map<Integer, Employee> set = er.getEmpsMap();

		Set<Entry<Integer, Employee>> it = set.entrySet();

		for (Entry<Integer, Employee> e : it) {

			if (e.getValue().getEmpFirstName().startsWith(name)) {
				// e.setValue(1);
				result.put(e.getKey(), e.getValue());

			}
		}
		return result;
	}

	@Override
	public Map<Integer, Employee> getAllEmps(double salary) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> result = new HashMap<Integer, Employee>();

		Map<Integer, Employee> set = er.getEmpsMap();

		Set<Entry<Integer, Employee>> it = set.entrySet();

		for (Entry<Integer, Employee> e : it) {

			if (e.getValue().getEmpSalary() > salary) {

				result.put(e.getKey(), e.getValue());
			}
		}
		return result;
	}

	@Override
	public Map<Integer, Employee> getAllEmps(int depno) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> result = new HashMap<Integer, Employee>();
		Map<Integer, Employee> set = er.getEmpsMap();
		Set<Entry<Integer, Employee>> it = set.entrySet();

		for (Entry<Integer, Employee> e : it) {

			if (e.getValue().getEmpDepartmentNo() == depno) {

				result.put(e.getKey(), e.getValue());
			}
		}
		return result;

	}

	@Override
	public Map<Integer, Employee> getAllEmps(int depno, double salary) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> result = new HashMap<Integer, Employee>();
		Map<Integer, Employee> set = er.getEmpsMap();
		Set<Entry<Integer, Employee>> it = set.entrySet();

		for (Entry<Integer, Employee> e : it) {

			if (e.getValue().getEmpDepartmentNo() == depno) {
				if (e.getValue().getEmpSalary() > 40000) {
					result.put(e.getKey(), e.getValue());
				}
			}
		}
		return result;

	}

}
