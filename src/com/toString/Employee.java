package com.toString;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Name");
		String Name=sc.nextLine();	
		System.out.println("last name");
		String lastName=sc.nextLine();
		System.out.println("id");
		int Employeeid=sc.nextInt();
		System.out.println("project");
		int  noOfProject=sc.nextInt();
		sc.close();
		Main Sau =new Main();
		Sau.setEmployeeData(Name,Employeeid,noOfProject);
		Sau.calculateSalary();
		Sau.displayDetails();

	}

}
