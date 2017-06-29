package com.fannie.contracts;

import java.util.List;

import com.fannie.bean.Employee;

public interface IEmpDAO {
	//insert
	public void insertEmp(Employee emp);
	//update
	public void updateEmp(int empId, double empSal);
	//delete
	public void deleteEmp(int empId);
	//select-one
	public Employee getEmp(int empId);
	//select all
	public List<Employee> getAllEmps();
}
