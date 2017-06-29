package com.fannie.collections;

public class Park implements Comparable<Park>{
	private int parkId;
	private String parkName;
	private String parkLocation;
	
	public Park (int parkId, String parkName, String parkLocation) {
		super();
		this.parkId = parkId;
		this.parkName = parkName;
		this.parkLocation = parkLocation;
	}

	public int getParkId() {
		return parkId;
	}

	public String getParkName() {
		return parkName;
	}

	public String getParkLocation() {
		return parkLocation;
	}

	@Override
	public String toString() {
		return "Park [parkId=" + parkId + ", parkName=" + parkName + ", parkLocation=" + parkLocation + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Park park = (Park) obj;
		if(this.parkId==park.parkId && this.parkName.equals(park.parkName)&& this.parkLocation.equals(park.parkLocation)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.parkName.charAt(0);
	}

	public int compareTo(Park o) {
		return this.parkId-o.parkId;
	}
}

