package com.fannie.day2;

public class VehicleClientPolymorphicMethod {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.setSpeed(35);
		v.accelerate();
		v.accelerate();
		v.accelerate();
		v.brake();
		v.brake();
	}
}
