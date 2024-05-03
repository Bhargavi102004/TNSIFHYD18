package com.si.simple;

public class M_Main extends Methodoverriding {
	
	int b = 20;
	 
	public void display() {
		
		System.out.println("This is a sub class");
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverriding m1 = new M_Main();
	    
		m1.display();

	}

}
