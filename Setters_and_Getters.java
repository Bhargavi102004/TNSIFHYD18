package com.si.simple;

public class Setters_and_Getters {
      
	private int speed;
	private String engine;
	private String driver;
	private String doors;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	public void run() {
		
		if ( speed > 0 && engine.equals("on") && driver.equals("seated") && doors.equals("closed")) {
			
			System.out.println("car is running");
			
		}
		else
		{
			System.out.println("car is not running");
		}

    }

}
