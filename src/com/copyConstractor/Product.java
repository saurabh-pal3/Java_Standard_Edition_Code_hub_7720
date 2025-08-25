package com.copyConstractor;

public class Product
{
	private String name;
	private int Quntety;
	private double salary;
	public Product(String name, int quntety, double salary, int Quntety) 
	{
		super();
		this.name = name;
		this.Quntety = Quntety;
		this.salary = salary;
	}
	
	public Product(Product prb)
	{
		this.name = prb.name;
		this.Quntety = prb.Quntety;
		this.salary =prb. salary;
		
	}

	public String getName() {
		return name;
	}

	public int getQuntety() {
		return Quntety;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", Quntety=" + Quntety + ", salary=" + salary + "]";
	}
	

}
