package com.thisuse;

import java.util.Scanner;

public class EmployeSaurabhget {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		EmployeeSaurabh kalu=new EmployeeSaurabh();
//		EmployeeSaurabh lala=new EmployeeSaurabh(null, null, 0, 0, 0);
		System.out.print("Enter the firstName: ");
		 kalu.setFirstName(sc.nextLine());
		
		
		System.out.print("Enter the  lastName: ");
		 kalu.setLastName(sc.nextLine());
		
		
		System.out.print("Enter the  employeeId :");
		kalu.setEmployeeId(Integer.parseInt(sc.nextLine()));
		
		System.out.print("Enter the  salary: ");
		kalu.setSalary(Double.parseDouble(sc.nextLine()));
		
		System.out.print("Enter the number of project :");
		kalu.setNoOfProject(Integer.parseInt(sc.nextLine()));
		
	

		kalu.calculateSalary();
		System.out.println(kalu);
		
		sc.close();
	}

}