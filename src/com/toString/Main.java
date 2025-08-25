package com.toString;

public class Main {
	String Name;
	String lastName;
	int Employeeid ;
	double salary;
	int noOfProject;

	public void  setEmployeeData(String sname,int id, int project) 
	{
		 Name=sname;
//		 lastName=slastname;
		 Employeeid=id;
		 noOfProject=project;
		 
	}
	public void  calculateSalary()
	{
		if(noOfProject>5 &&noOfProject<10)
		{
			salary= 5000 ;
		}
		else if(noOfProject>10 &&noOfProject<20)
		{
			salary= 10000;
			
		}
		else if(noOfProject>=20)
		{
			salary=  15000;
			
		}
	}
	public void  displayDetails()
	{
		System.out.println("Name: "+ Name);
//		System.out.println(lastName);
		System.out.println("Employee ID: "+Employeeid);
		System.out.println("No. of Projects: "+noOfProject);
		System.out.println("Updated Salary: "+salary);
	}
	
	
	

}
