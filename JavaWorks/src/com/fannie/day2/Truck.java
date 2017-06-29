package com.fannie.day2;
//Specific calss. Child of Vehicle.
public class Truck extends Vehicle{
	
	public Truck(){
		//System.out.println("Hi, we just created a new Truck!");
	}
	@Override
	public void move() {
		System.out.println("The truck moves on 8 wheels");
	}

	@Override
	public void carryPassengers() {
		System.out.println("The truck doesn't carry more than 4 passengers but heavy shipments...");
	}
	@Override
	public String toString() {
		return "Truck [NoOfWheels=" + getNoOfWheels() + ", VehicleType=" + getVehicleType() + "]";
	}
	@Override
	public void accelerate() {
		setSpeed(getSpeed() + 1);
		System.out.println("Speed increased(Truck): "+ getSpeed());
	}
	@Override
	public void brake() {
		setSpeed(getSpeed() - 1);
		System.out.println("Speed decreased(Truck): "+ getSpeed());
		
	}
	
	
}
