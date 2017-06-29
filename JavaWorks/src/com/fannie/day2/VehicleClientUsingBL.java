package com.fannie.day2;

//Desired state - light client. Move core business logic in a facade layer.

public class VehicleClientUsingBL {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[5];
		//array will start from 0.
		vehicles[0] = new Car();
		vehicles[1] = new Bike();
		vehicles[2] = new Truck();
		vehicles[3] = new Car();
		vehicles[4] = new Car();
		
		VehicleBusinessLogic bl = new VehicleBusinessLogic();
		bl.showVehicle(vehicles);
	}
}
