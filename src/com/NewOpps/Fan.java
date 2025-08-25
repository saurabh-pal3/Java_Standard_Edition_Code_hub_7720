package com.NewOpps;

import java.util.Scanner;

public class Fan {
	String name;
	String color;
	int type;
	
	
	public void setdata()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter fan name :");
		name=sc.nextLine();
		System.out.println("Enter fan color :");
		color=sc.nextLine();
		System.out.println("Enter the type :");
		type=Integer.parseInt(sc.nextLine());
		sc.close();
		
		}
	public void getdata()
	{
		System.out.println("The fan name is : " +name);
		System.out.println("The fan color is " +color);
		System.out.println("The type is : " +type);
		
	}
	
	

}
