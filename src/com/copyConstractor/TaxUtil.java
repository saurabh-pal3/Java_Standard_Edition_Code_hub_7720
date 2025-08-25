package com.copyConstractor;

public class TaxUtil
{
	public  double calculateTax(Employees e)
	{
		
		double calculateGrossSalary = e.calculateGrossSalary();
		double tax = 0;
		if(calculateGrossSalary>50000)
		{
			tax = (calculateGrossSalary*20)/100;
		}else {
		tax = (calculateGrossSalary*5)/100;
		}
		return tax;
		
	}
	public  double calculateTax(Managers  m)
	{
		double calculateGrossSalary = m.calculateGrossSalary();
		double tax = 0;
		if(calculateGrossSalary>50000)
		{
			tax = (calculateGrossSalary*20)/100;
		}else {
		tax = (calculateGrossSalary*20)/100;
		}
		return tax;
		
		
	}
	public  double calculateTax(Trainer  t)
	{
		double calculateGrossSalary = t.calculateGrossSalary();
		double tax = 0;
		if(calculateGrossSalary>50000)
		{
			tax = (calculateGrossSalary*20)/100;
		}else {
		tax = (calculateGrossSalary*20)/100;
		}
		return tax;
		
	}
	public  double calculateTax(Sourcing  s)
	{
		double calculateGrossSalary = s.calculateGrossSalary();
		double tax = 0;
		if(calculateGrossSalary>50000)
		{
			tax = (calculateGrossSalary*20)/100;
		}else {
		tax = (calculateGrossSalary*20)/100;
		}
		return tax;
		
	}

}
