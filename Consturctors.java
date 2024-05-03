package com.si.simple;

public class Consturctors {
      
	private int speed;
	private String engine;
	private String driver;
	private String doors;
	
	public Consturctors() {
		
		speed = 10;
		engine = "on";
		driver = "seated";
		doors = "closed";
		
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
