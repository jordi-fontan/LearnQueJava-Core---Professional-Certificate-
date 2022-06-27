package edu.fontan.java.lq.cars;

public class StationWagon extends Car {
	private Integer cargoCapacity;
	public Integer getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(Integer cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public Integer getCurrentCargoLoad() {
		return currentCargoLoad;
	}
	public void setCurrentCargoLoad(Integer currentCargoLoad) {
		this.currentCargoLoad = currentCargoLoad;
	}
	private Integer currentCargoLoad;
	
	
	
	
	
}
