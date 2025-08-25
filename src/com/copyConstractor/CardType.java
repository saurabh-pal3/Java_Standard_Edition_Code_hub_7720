package com.copyConstractor;

public class CardType 
{
	private Customer customer;
	private String carsType;
	public CardType(Customer customer, String carsType) 
	{
		super();
		this.customer = customer;
		this.carsType = carsType;
	}
	
	public String toString()
	{
		return "The Customer '"+this.customer+"' Is Eligible For '"+this.carsType+"'Card";
	}

}
