package com.copyConstractor;

public class Product1
{
	private String name;
	private int Quntety;
	private double salary;
	public Product1(Product pr) 
	{
		super();
		this.name = pr.getName();
		Quntety =pr.getQuntety();
		this.salary =pr.getSalary();
	}
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", Quntety=" + Quntety + ", salary=" + salary + "]";
	}

}
