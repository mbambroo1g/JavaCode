package com.fannie.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fannie.bean.Employee;
import com.fannie.connection.GetConnection;
import com.fannie.contracts.IEmpDAO;

public class EmpDAO implements IEmpDAO{
//Index starting points - 
//Array starts from 0
//Iterator starts from -1
// Prepared Statement starts from 1
	@Override
	public void insertEmp(Employee emp) {
		String sql = "Insert into employee values(?,?,?,?)";
		GetConnection gc = new GetConnection();
		try {
			gc.ps=GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2, emp.getEmpName());
			gc.ps.setDouble(3,emp.getEmpSal());
			gc.ps.setString(4, emp.getEmpEmail());
			boolean flag = gc.ps.executeUpdate()>0;
			
			if(flag){
				System.out.println("Record inserted.");
			}
			else{
				System.out.println("Sorry, record not inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmp(int empId, double empSal) {
		String sql = "Update employee set empSal =? where empId =?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps=GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setDouble(1,empSal);
			gc.ps.setInt(2, empId);
			boolean flag = gc.ps.executeUpdate()>0;
			
			if(flag){
				System.out.println("Record updated.");
			}
			else{
				System.out.println("Sorry, record not updated.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmp(int empId) {
		String sql = "Delete from employee where empId =?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps=GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			System.out.println((gc.ps.executeUpdate()>0)?"Record deleted.":"Record not deleted.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee getEmp(int empId) {
		String sql = "Select empId,empName,empSal,email from employee where empId =?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps=GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			
			gc.rs=gc.ps.executeQuery();
			if(gc.rs.next()){
				Employee temp = new Employee();
				temp.setEmpId(gc.rs.getInt(1));
				temp.setEmpName(gc.rs.getString(2));
				temp.setEmpSal(gc.rs.getDouble(3));
				temp.setEmpEmail(gc.rs.getString(4));
				
				return temp;
			}
			else{
				System.out.println("Sorry, record does not exist.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		String sql = "Select empId,empName,empSal,email from employee";
		GetConnection gc = new GetConnection();
		try {
			ArrayList<Employee> list = new ArrayList<Employee>();
			gc.ps=GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs=gc.ps.executeQuery();
			
			while(gc.rs.next()){
				Employee temp = new Employee();
				temp.setEmpId(gc.rs.getInt(1));
				temp.setEmpName(gc.rs.getString(2));
				temp.setEmpSal(gc.rs.getDouble(3));
				temp.setEmpEmail(gc.rs.getString(4));
				
				list.add(temp);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
