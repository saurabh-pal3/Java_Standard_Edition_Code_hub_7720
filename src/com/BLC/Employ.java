package com.BLC;

public class Employ {
	String ename;
	int eid;
	double esalary;
	
	public void setdata(String name,int id,double salary)
	{
		ename=name;
		eid=id;
		esalary=salary;
		
	}
	public void getdata()
	{
		System.out.println("The  name is "+ ename);
		System.out.println("The id is :"+ eid);
		System.out.println("The salary is"+esalary);
	}

}
