package com.assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Road {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = null;
		float acceleration;
		System.out.println("Enter the vehicle kind: ");
		String type = br.readLine();
		System.out.println("Enter the color: ");
		String color = br.readLine();
		System.out.println("Enter the number of wheels: ");
		int noOfWheels= Integer.parseInt(br.readLine());
		System.out.println("Enter the model: ");
		String model= br.readLine();
		System.out.println("Enter the starting speed: ");
		int startingSpeed= Integer.parseInt(br.readLine());
		System.out.println("Enter the final speed: ");
		int finalSpeed= Integer.parseInt(br.readLine());
		System.out.println("Enter the time in minutes: ");
		int time= Integer.parseInt(br.readLine());
		
		if(type.equals("car")){
			Vehicle v = new Car(color,noOfWheels,model);
			((Car) v).move();
			((Car) v).carryPassengers();
			((Car) v).tankCapacity();
			((Car)v).privateVehicle();
			if(startingSpeed<finalSpeed){
				v.accelerate(startingSpeed, finalSpeed, time);
			}
			else{
				v.decelerate(startingSpeed, finalSpeed, time);
			}
		}
		else if(type.equals("truck")){
			Vehicle v = new Truck(color,noOfWheels,model);
			((Truck) v).move();
			((Truck)v).carryPassengers();
			((Truck)v).tankCapacity();
			((Truck)v).businessVehicle();
			if(startingSpeed<finalSpeed){
				v.accelerate(startingSpeed, finalSpeed, time);
			}
			else{
				v.decelerate(startingSpeed, finalSpeed, time);
			}
		}
		else if(type.equals("bus")){
			Vehicle v = new Bus(color,noOfWheels,model);
			((Bus) v).move();
			((Bus)v).carryPassengers();
			((Bus)v).tankCapacity();
			((Bus)v).transitVehicle();
			if(startingSpeed<finalSpeed){
				v.accelerate(startingSpeed, finalSpeed, time);
			}
			else{
				v.decelerate(startingSpeed, finalSpeed, time);
			}
		}
		else{
			System.out.println("Sorry, enter another type! The allowed options are: car,truck or bus.");
		}
			
		
	}
}
