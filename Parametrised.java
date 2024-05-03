package com.si.simple;

public class Parametrised {
      
	private int speed;
	private String engine;
	private String driver;
	private String doors;
	
	public Parametrised(int speed , String engine , String driver , String doors ) {
		
		this.speed = speed ;
		this.engine = engine ;
		this.driver = driver ;
		this.doors = doors ;
		
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
