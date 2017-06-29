Vehicle.java


package com.assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Vehicle {
	String color;
	int noOfWheels;
	String model;
	
	public Vehicle(String color, int noOfWheels, String model) {
		super();
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}

	public static void accelerate(int startingSpeed, int finalSpeed, int time) throws NumberFormatException, IOException{
		
		float acceleration;
		System.out.println("Enter Starting Speed of the vehicle: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = null;
		startingSpeed = Integer.parseInt(br.readLine());
		acceleration = (finalSpeed-startingSpeed)*60/time;
		System.out.println("Acceleration of the vehicle is: "+acceleration);
	}
	
	public static void decelerate(int startingSpeed, int finalSpeed, int time){
		
	}
	
	public static void checkAccSpeed(int startingSpeed, int finalSpeed){
		if(startingSpeed>finalSpeed)
			throw new RuntimeException("The vehicle is not accelerating.");
	}
	
	public static void checkDecSpeed(int startingSpeed, int finalSpeed){
		if(finalSpeed>startingSpeed)
			throw new RuntimeException("The vehicle is not braking.");
	}
	
	public abstract void move();
	
}



