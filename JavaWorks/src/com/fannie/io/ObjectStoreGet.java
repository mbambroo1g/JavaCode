package com.fannie.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStoreGet{
	//write the object
	public static void saveCustomer(Customer customer) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customer.ser"));
		
		oos.writeObject(customer);
		System.out.println("Customer saved...");
	}
	
	//read the object
	public static void readCustomer() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.ser"));
		Customer cust = (Customer)ois.readObject();
		System.out.println("Customer read...");
		System.out.println(cust);
	}
	public static void main(String[] args) {
	
		try {
			Customer customer = new Customer(502, "Medha");
			saveCustomer(customer);
			readCustomer();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}		
	}
}


