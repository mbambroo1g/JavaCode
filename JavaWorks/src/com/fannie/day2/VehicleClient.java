package com.fannie.day2;

//multi object client. Basic.
public class VehicleClient {
	public static void main(String[] args){
		Car c = new Car();
		c.move();
		c.carryPassengers();
		c.steering();
		c.tankCapacity();
		c.setNoOfWheels(4);
		c.setVehicleType("Advanced");
		System.out.println(c);
		
		System.out.println("--------------------");
		Bike b = new Bike();
		b.move();
		b.carryPassengers();
		b.kickStart();
		b.fuelCapacity();
		b.setNoOfWheels(2);
		b.setVehicleType("Basic");
		System.out.println(b);
		
		//Vehicle v = new Vehicle(); Not encouraged.
		System.out.println("--------------------");
		Truck t = new Truck();
		t.move();
		t.carryPassengers();
		t.setVehicleType("Business");
		t.setNoOfWheels(8);
		System.out.println(t);
		
		System.out.println("--------------------");
		Vehicle d = new Car();
		d.carryPassengers();
		d.move();
		// These methods are local to Car. They are not accessible for an object of type Vehicle.
		//The child has all qualities of a parent and the ones defined for the child.
		//d.steering(); 
		//d.tankCapacity();
		
	}

}
