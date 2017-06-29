package com.fannie.beans;

import java.io.Serializable;

public class Emp implements Serializable{

	private static int count;
	/**
	 *
	 */
	private static final long serialVersionUID = 8418816393415621172L;
	private int empId;
	private String empName;
	private int myCount;

	public Emp(int empId, String empName, int myCount) {
		super();

		this.empId = empId;
		this.empName = empName;
		this.myCount = count++;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", myCount=" + myCount + "]";
	}


}