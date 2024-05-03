package com.si.simple;

public class P_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Parametrised p1 = new Parametrised( 10 , "on" , "seated" , "closed" );
		Parametrised p2 = new Parametrised( -10 , "on" , "seated" , "closed" );
		
		p1.run();
		p2.run();
	}

}
