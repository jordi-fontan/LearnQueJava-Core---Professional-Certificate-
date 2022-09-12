package edu.fontan.java.lq.cars;

public class Car {
 private Integer speed;
 private Integer gasoline;
 private Boolean engineState;
 
 /*
  * private LocalDate manufactured;
	
	public int getAge() {
		return Period.between(manufactured, LocalDate.now()).getYears();
	}
  */
 
 
 
 
 public Integer getSpeed() {
	return speed;
}
public void setSpeed(Integer speed) {
	this.speed = speed;
}
public Integer getGasoline() {
	return gasoline;
}
public void setGasoline(Integer gasoline) {
	this.gasoline = gasoline;
}
public Boolean getEngineState() {
	return engineState;
}
public void setEngineState(Boolean engineState) {
	this.engineState = engineState;
}

}
