package com.fannie.day2.set2;
//java bean
//if a class private variables and public getters and setters then it is a java bean.
//Preferably a default constructor.

public class Devices implements Comparable<Devices>{
	private int devideId;
	private String deviceName;
	//private String devideMake;
	//Source- Generate constructor using fields:
	public Devices(int devideId, String deviceName) {
		super();
		this.devideId = devideId;
		this.deviceName = deviceName;
		//this.devideMake = devideMake;
	}
	public int getDevideId() {
		return devideId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	//Have to specify what field to be compared
	public int compareTo(Devices o){ //o is default. I switched o to p and it still worked. 
		//return this.devideId - o.devideId; //Ascending order
		//return o.devideId - this.devideId; //Descending order
		
		//For strings, we need to invoke the compareTo() method for the String class.
		//Ascending order by name
		return this.deviceName.compareTo(o.deviceName);
		
		//descending order by name
		//return o.deviceName.compareTo(this.deviceName);
	}
//	public String getDevideMake() {
//		return devideMake;
//	}
	//No setters required as setting happens via constructors.
}
