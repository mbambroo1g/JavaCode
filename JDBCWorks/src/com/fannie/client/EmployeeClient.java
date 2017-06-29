package com.fannie.client;

import java.util.List;

import com.fannie.bean.Employee;
import com.fannie.contracts.IEmpDAO;
import com.fannie.dao.EmpDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee emp = new Employee(109, "Tina",20000, "tina@fanniemae.com");
		IEmpDAO dao = new EmpDAO();
		//dao.insertEmp(emp);
//		dao.updateEmp(102, 25000);
//		dao.deleteEmp(103);
		Employee emp1=	dao.getEmp(101);
		System.out.println(emp1);
		List<Employee> list =dao.getAllEmps();
		for(Employee temp:list){
			System.out.println(temp);
		}	
	}
}
