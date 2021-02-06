package com.test.pojo;

public class Vehicles {
	
	String vehicleName;
	String vehicleType;
	long vehiclePrice;
	
	public Vehicles() {
		super();
	}
	public Vehicles(String vehicleName, String vehicleType, long vehiclePrice) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehiclePrice = vehiclePrice;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public long getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(long vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	@Override
	public String toString() {
		return "Vehicles [vehicleName=" + vehicleName + ", vehicleType=" + vehicleType + ", vehiclePrice="
				+ vehiclePrice + "]";
	}
	

}
