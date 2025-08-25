package com.copyConstractor;

public class Customer
{
	private String customerName;
	private int creditPoint;
	public Customer(String customerName, int creditPoint)
	{
		super();
		this.customerName = customerName;
		this.creditPoint = creditPoint;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public int getCreditPoint() {
		return creditPoint;
	}

	public int getCreditPoints()
	{
		return getCreditPoint();
	}
	
	public String toString()
	{
		return getCustomerName();
	}

}
