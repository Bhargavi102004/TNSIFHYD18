package com.si.simple;

public class Approach1 {
	String batsman="Rohit";
	static String bowler="bumrah";
	void display()
	{
		System.out.println("cricket");
	}
	static String display1()
	{
		return "sports";
		}

public static void main(String[] args)
{
	Approach1 a=new Approach1();
	System.out.println(a.batsman);
	a.display();
	System.out.println(Approach1.bowler);
	System.out.print(Approach1.display1());
}
}
