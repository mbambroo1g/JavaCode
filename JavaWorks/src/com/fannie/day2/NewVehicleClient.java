package com.fannie.day2;

//Polymorphism - partial example

public class NewVehicleClient {
	public static void main(String[] args){
		Vehicle v;
		
		//v is instance of class car.
		v= new Car();
		// Java dynamically gets the method from the child. Vehicle is an instance of the Object Child.
		v.move();
		v.carryPassengers();
		
		//type casting - when a parent behaves as a child. Superclass can always reference to a subclass.
		//vice versa is false, it has to be type casted.
		((Car)v).steering();
		((Car)v).tankCapacity();
		
		//v is instance of class bike. We are instantiating a bike.
		v = new Bike();
		v.move();
		v.carryPassengers();
		
		//type casting
		((Bike)v).kickStart();
		((Bike)v).fuelCapacity();
		//((Car)v).steering(); 
		//The compiler doesnt catch the exception. We are trying to type case a car for a bike.
		//Throws a class cast exception.
		// java.lang.ClassCastException: 
		
		//v is an instance of class truck. we are instantiating a truck.
		v = new Truck();
		v.move();
		v.carryPassengers();
		//v is a polymorphic object. The same object behaves differently at different points in time. In order to do this,
		//there has to be relationship. In this case, the relationship is vehicle to car, truck and bike.
	}

}
