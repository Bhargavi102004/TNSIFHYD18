package com.si.simple;

public class Methodoverloading {
	
	int a = 10 ;
	int b = 20 ;
	 
    public void display() {
		
		System.out.println("addition");
		System.out.println(a + b);
	}
	
    public int display(int a , int b) {
		
		System.out.println("Subtraction");
		return a - b;
	}
    
    public int display(int b , int a , int c) {
		
		System.out.println("Multiplication");
		return a * b * c ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Methodoverloading m1 = new Methodoverloading();
		
		m1.display();
		System.out.println(m1.display(30, 20));
		System.out.println(m1.display(20, 10 , 20));
		
		
	}

}
