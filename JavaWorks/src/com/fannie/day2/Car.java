package com.fannie.day2;

//specific class. Child of vehicle.

public class Car extends Vehicle{
	//if you don't have a constructor then compiler shall create a default constructor.
	
	public Car(){
		//Every constructor has a super() at the first line. If it is not there, compiler will inject it. 
		//If super() is not the first line, the following error is thrown:
		//"Constructor call must be the first statement in a constructor".
		
		super();
		//System.out.println("Hi, we are constructing a CAR!");
	}
	public void steering(){
		System.out.println("All cars have steering.");
	}
	
	public void tankCapacity(){
		System.out.println("All cars have a fuel tank with a limit.");
	}
	
	//The child has over-ridden the parent behavior.
	@Override
	public void move(){
		System.out.println("Cars move with four wheels.");
	}
	@Override
	public void carryPassengers(){
		System.out.println("Cars can carry anywhere from 2 to 8 passengers.");
	}
	
	@Override
	public String toString() {
		return "Car [NoOfWheels=" + getNoOfWheels() + ", VehicleType=" + getVehicleType() + "]";
	}
	@Override
	public void accelerate() {
		setSpeed(getSpeed() + 1);
		System.out.println("Speed increased(Car): " +  getSpeed());
		//System.out.println("Speed increased(Car): " +  (++speed)) -- If the attribute declaration is public.
	}
	@Override
	public void brake() {
		setSpeed(getSpeed() - 1);
		System.out.println("Speed decreased(Car): "+ getSpeed());
		
	}
	

}
