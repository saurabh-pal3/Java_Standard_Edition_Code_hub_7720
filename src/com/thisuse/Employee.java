package com.thisuse;

public class Employee {
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;

	public void setEmployeeDetails(int employeeNumber, String employeeName, double employeeSalary) {

		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public void calculateSalaryIncrement() {
		double incgrement = 0.0;
		if (employeeSalary < 50000) {
			incgrement = employeeSalary * 10 / 100;
			
		} 
		else if (employeeSalary > 50000 && employeeSalary <= 80000) 
		{
			incgrement = employeeSalary * 7 / 100;
		} 
		else if (employeeSalary > 80000)
		{
			incgrement = (employeeSalary * 5 / 100);

		}
		employeeSalary = employeeSalary + incgrement;
		System.out.println("Salary increment amount :" + incgrement);

	}

	public void getEmployeeDetails() {
		System.out.println("The employeeNumber is :" + employeeNumber);
		System.out.println("The employeeName is : " + employeeName);
		System.out.println("The employeeSalary is : " + employeeSalary);

	}

}
