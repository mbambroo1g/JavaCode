package com.fannie.day2;
//Moved all business logic in this class.

public class VehicleBusinessLogic {
	public void showVehicle(Vehicle[] vehicles){
		for (Vehicle temp: vehicles){ 
			//For each vehicle, store data in temp. temp is a temporary variable and scope is limited to the method.
			System.out.println("-----------------------");
			temp.carryPassengers();
			temp.move();
			temp.setSpeed(35);
			temp.getSpeed();
			
			if(temp instanceof Car){
				((Car) temp).steering();
				((Car) temp).tankCapacity();
			}
			else if (temp instanceof Bike){
				((Bike) temp).kickStart();
				((Bike) temp).fuelCapacity();
			}
		}
	}

}
