package com.fannie.day2;
//Specific class. Child of Vehicle.

public class Bike extends Vehicle{
	public Bike(){
		//System.out.println("Hi, we are trying to construct a BIKE!");
	}
	
	public void kickStart(){
		System.out.println("All bikes have a kick start.");
	}
	
	public void fuelCapacity(){
		System.out.println("All bikes have a fuel capacity.");
	}
	
	//The child over-rides the parent method.
	public void move(){
		System.out.println("A bike moves on two wheels.");
	}
	
	public void carryPassengers(){
		System.out.println("Bikes can carry typically two passengers.");
	}
	
	@Override
	public String toString() {
		return "Bike [NoOfWheels=" + getNoOfWheels() + ", VehicleType=" + getVehicleType() + "]";
	}

	@Override
	public void accelerate() {
		System.out.println("Bike accelerates");
		
	}

	@Override
	public void brake() {
		System.out.println("Bike brakes");
		
	}


	
}
