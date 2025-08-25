package com.copyConstractor;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
//		
//		System.out.println("Enter the Employee employeeId :");
//		int employeeId=Integer.parseInt(sc.nextLine());
//		
//		System.out.println("Enter the Employee employeeName:");
//		String employeeName=sc.nextLine();
//		
//		System.out.println("Enter the  Employee basicSalary:");
//		double basicSalary=Double.parseDouble(sc.nextLine());
//		
//	System.out.println("Enter the  Employee HRAPer:");
//		double HRAPer=Double.parseDouble(sc.nextLine());
//		
//		
//		System.out.println("Enter the  Employee DAPer:");
//	double DAPer=Double.parseDouble(sc.nextLine());
		
		TaxUtil taxUtil = new TaxUtil();
		
		Employees emp = new Employees(101, "Saurabh", 30000, 20, 10);
	        System.out.println("\n" + emp);
	        System.out.println("Gross Salary : " + emp.calculateGrossSalary());
	        System.out.println("Tax : " + taxUtil.calculateTax(emp));
		
		
		Managers m1=new Managers(121,"Saurabh Pal",12000,4000,5000, 2000);
		System.out.println(m1);
		System.out.println("Gross Salary : "+m1.calculateGrossSalary());
		System.out.println("Tax : "+taxUtil.calculateTax(m1));
		
		
		Trainer t1=new Trainer(121,"Saurabh Pal",12000,4000,50000, 20000, 20000);
		System.out.println(t1);
		System.out.println("Gross Salary : "+t1.calculateGrossSalary());
		System.out.println("Tax : "+taxUtil.calculateTax(t1));
		
		Sourcing s1=new Sourcing(121,"Saurabh Pal",12000,4000,5000, 2000, 121, 12000);
		System.out.println(s1);
		System.out.println("Gross Salary : "+s1.calculateGrossSalary());
		System.out.println("Tax : "+taxUtil.calculateTax(s1));
		
		
		
		
		
	}
	
	

}
