package com.copyConstractor;

public class Managers
{
	private int managerId;
	private String managerName ;
	private double basicSalary ;
	private double HRAPer ;
	private double DAPer ;
	private double projectAllowance;
	
	
	
	public Managers(int managerId, String managerName, double basicSalary, double hRAPer, double dAPer,
			double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}



	public  double calculateGrossSalary()
	{
		double GrossSalary=basicSalary +HRAPer +DAPer + projectAllowance;
		return GrossSalary;
	}



	@Override
	public String toString() {
		return "Managers [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", projectAllowance=" + projectAllowance + "]";
	}

}
