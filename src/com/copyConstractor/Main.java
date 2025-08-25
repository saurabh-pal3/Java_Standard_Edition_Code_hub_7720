package com.copyConstractor;

public class Main {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(12, "Saurabh Pal", 12000);
		
		Mangener m1=new Mangener(e1);
		System.out.println(m1);
		
	}

}
