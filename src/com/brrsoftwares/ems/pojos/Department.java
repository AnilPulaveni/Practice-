package com.brrsoftwares.ems.pojos;

public class Department {
	private  int empDepartmentNo;
	private String departmentName;
	private String manger;
	public Department(int empDepartmentNo, String departmentName, String manger) {
		super();
		this.empDepartmentNo = empDepartmentNo;
		this.departmentName = departmentName;
		this.manger = manger;
	}
	public int getEmpDepartmentNo() {
		return empDepartmentNo;
	}
	public void setEmpDepartmentNo(int empDepartmentNo) {
		this.empDepartmentNo = empDepartmentNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManger() {
		return manger;
	}
	public void setManger(String manger) {
		this.manger = manger;
	}
	@Override
	public String toString() {
		return "Department......:)....... [empDepartmentNo=" + empDepartmentNo + ", departmentName=" + departmentName + ", manger="
				+ manger + "]";
	}
	
}