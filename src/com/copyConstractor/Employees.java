package com.copyConstractor;

public class Employees
{
	private int employeeId;
	private String employeeName  ;
	private double basicSalary ;
	private double HRAPer ;
	private double DAPer ;
	public Employees(int employeeId, String employeeName, double basicSalary, double hRAPer, double dAPer)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		 this.HRAPer = hRAPer;  
		    this.DAPer = dAPer; 
	}
	
	public double calculateGrossSalary()
	{
		double GrossSalary=basicSalary +HRAPer +DAPer;
		return GrossSalary;
	}

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + "]";
	}

	
	

}
