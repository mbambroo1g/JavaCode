package com.fannie;

//This becomes a reusable class now.

class Emp{
	private int empId;
	private String empName;
	private double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		if(empSalary < 5000){
			this.empSalary = 5000;
			System.out.println("Sorry Salary cannot be less than 5000 and is set to 5000");
		}
		else{
		this.empSalary = empSalary;
	}
		
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("The object created purge code goes here..getClass().");
	}
	
	//setter
	/*public void setEmpI(int empId){
		this.empId = empId;
	}
	
	public int getEmpId(){
		return this.empId;
	}*/
	
	
}
