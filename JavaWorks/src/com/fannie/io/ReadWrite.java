package com.fannie.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ReadWrite {
	
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = null;
		try {
			System.out.println("Enter Employee Id: ");
			int empId = Integer.parseInt(br.readLine()); //br.read will read only 1 character.
			
			System.out.println("Enter Employee Name");
			String empName = br.readLine();
			
			System.out.println("Emp Id is: " + empId);
			System.out.println("Emp Name is: "+ empName);
			
			//If the file does not exist it will create one.
			File f = new File("Emp.txt");
			FileWriter fw = new FileWriter(f, true);
			bw = new BufferedWriter(fw);
			//bw = new BufferedWriter(new FileWriter("Emp.txt"));
 			bw.write(empId+", "+empName);
 			
 			FileReader fr = new FileReader("Emp.txt");
 			System.out.println(fr);
 			br = new BufferedReader(fr);
 			String str = br.readLine();
 			while(str !=null){
 			System.out.println(str);
 			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
