package com.si.simple;

public class Normal {
	String batsman="Rohit sharma";
		static String bowler="bumrah";
	
		void display()

		{
			System.out.println("cricket");
		}
		static String display1()
		{
		return("sports");
		}
}  
   class Access{
  public static void main(String[] args)
			{
				Normal n1=new Normal();
				System.out.println(n1.batsman);
				n1.display();
				System.out.println(Normal.bowler);
				System.out.println(Normal.display1());
			}
		}

