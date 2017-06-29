package com.fannie.bean;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	private String empEmail;
	
	public Employee(int empId, String empName, double empSal, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empEmail = empEmail;
	}
	
	public Employee(){}
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public double getEmpSal() {
		return empSal;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empEmail=" + empEmail
				+ "]";
	}

}
