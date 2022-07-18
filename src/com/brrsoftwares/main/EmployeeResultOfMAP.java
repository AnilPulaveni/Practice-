package com.brrsoftwares.main;

import java.util.Iterator;
import java.util.Map.Entry;

import com.brrsoftwares.ems.impl.DepartmentServicesImplMAP;
import com.brrsoftwares.ems.impl.EmployeeServicesImplMAP;
import com.brrsoftwares.ems.interfaces.DepartmentServicesMap;
import com.brrsoftwares.ems.interfaces.EmployeeServicesMAP;
import com.brrsoftwares.ems.pojos.Department;
import com.brrsoftwares.ems.pojos.Employee;

public class EmployeeResultOfMAP {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("ALL  DEPARTMENTS LIST");
		System.out.println();
		System.out.println();

		DepartmentServicesMap ds = new DepartmentServicesImplMAP();
		Iterator<java.util.Map.Entry<Integer, Department>> itr1 = ds.getAllDeps().entrySet().iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println();
		System.out.println();
		System.out.println("ALL  EMPLOYEES LIST");
		System.out.println();
		System.out.println();

		EmployeeServicesMAP es = new EmployeeServicesImplMAP();
		Iterator<Entry<Integer, Employee>> itr2 = es.getAllEmps().entrySet().iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println();
		System.out.println();
		System.out.println("EMPLOYEES NAME START WITH   r");
		System.out.println();
		System.out.println();
		Iterator<Entry<Integer, Employee>> itr3 = es.getAllEmps("r").entrySet().iterator();

		while (itr3.hasNext()) {

			System.out.println(itr3.next());
		}
		System.out.println();
		System.out.println();
		System.out.println("Employee Salary  Greaterthen 40000 Employees  list");
		System.out.println();
		System.out.println();
		Iterator<Entry<Integer, Employee>> itr4 = es.getAllEmps(40000.0).entrySet().iterator();

		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}

		System.out.println();
		System.out.println();
		System.out.println("DEPARTMENT 1 EMPLOYEES");
		System.out.println();
		System.out.println();
		Iterator<Entry<Integer, Employee>> itr5 = es.getAllEmps(1).entrySet().iterator();

		while (itr5.hasNext()) {
			System.out.println(itr5.next());
		}
		System.out.println();
		System.out.println();
		System.out.println("DEPARTMENT 1 EMPLOYEES  WHOSE HAVE GREATERTHAN 40000 SALARY");

		System.out.println();
		System.out.println();
		Iterator<Entry<Integer, Employee>> itr6 = es.getAllEmps(1, 40000).entrySet().iterator();

		while (itr6.hasNext()) {
			System.out.println(itr6.next());
		}

	}
}
