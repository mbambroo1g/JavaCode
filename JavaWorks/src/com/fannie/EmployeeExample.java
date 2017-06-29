package com.fannie;

//client
public class EmployeeExample {
	public static void main(String[] args){
		System.runFinalizersOnExit(true);
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		/*{
				setEmpId(102);
				setEmpName("Peter");
				setEmpSalary(4000);
			}*/
		e1.setEmpId(101);
		e1.setEmpName("Harry");
		e1.setEmpSalary(6000);
		e2.setEmpId(102);
		e2.setEmpName("Peter");
		e2.setEmpSalary(4000);
	/*	System.out.println("EmpId: " + e1.getEmpId());
		System.out.println("EmpName: "+ e1.getEmpName());
		System.out.println("EmpSalary: "+ e1.getEmpSalary());
		System.out.println();*/
		System.out.println(e1);
		System.out.println(e2);
		
		//Emp e3 = new Emp();
	}	
}
	/*	e1.empId = 421;
		e1.empName ="Medha Bambroo";
		e1.empSalary=10000000.77; */
		
		//System.out.println("Emp Id: " + e1.empId);
		//System.out.println("Emp Name: " + e1.empName);
		//System.out.println("Emp Salary: " + e1.empSalary);
		//System.out.println("Emp Details: " + e1.*);
		//System.out.println("Emp Details: " + e1.empId + " " + e1.empName + " " + e1.empSalary)
