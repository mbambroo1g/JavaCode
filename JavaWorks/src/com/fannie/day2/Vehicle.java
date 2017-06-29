package com.fannie.day2;

//Super class
//This class is contract to enforce polymorphism.

public abstract class Vehicle {
	public Vehicle() {
		//System.out.println("Hi, we are creating a Vehicle!");
	}
	private int speed;
	private int noOfWheels;
	private String vehicleType;
	
	public abstract void move();//{
	//	System.out.println("Vehicle will move");
	//}
	
	public abstract void carryPassengers();//{
	//	System.out.println("All Vehicles carry passengers.");
	//}
	public abstract void accelerate();
	public abstract void brake();
	
	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
