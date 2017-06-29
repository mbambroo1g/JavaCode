package com.fannie.day2.set2;
import java.util.Arrays;

public class DeviceClient{
	public static void main(String[] args) {
		Devices [] devs = new Devices[]{
		new Devices(101,"Laptop"),
		new Devices(32,"Projector"),
		new Devices(44,"Mobile"),
		new Devices(5,"Tablet")
		};
		
		for(Devices temp: devs){
			System.out.println(temp.getDevideId()+","+temp.getDeviceName());
		}
		System.out.println("----------------------");
		Arrays.sort(devs);
		for(Devices temp: devs){
			System.out.println(temp.getDevideId()+","+temp.getDeviceName());
		}
	}
}
