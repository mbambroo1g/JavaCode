package com.fannie.day2;

//This program demonstrates a Dynamic method dispatch. 
//We have a polymorphic object in here. The same object morphs into various classes at different points in time. 

public class VehicleClientPolymorphism{
	public static void main(String[] args){
		Vehicle[] vehicles = new Vehicle[5];
		//array will start from 0.
		vehicles[0] = new Car();
		vehicles[1] = new Bike();
		vehicles[2] = new Truck();
		vehicles[3] = new Car();
		vehicles[4] = new Car();
		
		//Single object declaration
		//vehicles[0].move();
		//vehicles[0].carryPassengers();
		
		for (int i=0; i<vehicles.length; i++){
			System.out.println("--------------------");
			vehicles[i].move();
			vehicles[i].carryPassengers();
			
			if(vehicles[i] instanceof Car){
				((Car)vehicles[i]).steering();
				((Car)vehicles[i]).tankCapacity();
			}
			else if(vehicles[i] instanceof Bike){
				((Bike)vehicles[i]).kickStart();
				((Bike)vehicles[i]).fuelCapacity();
			}
		}
		
	}
	
}
