package com.copyConstractor;

public class Mangener
{
	private int id;
	private String name;
	private double salary;
	
	public Mangener(Employee emp)
	{
		this.id =emp.getId();
		this.name = emp.getName();
		this.salary = emp.getSalary();
	}

	@Override
	public String toString() {
		return "Mangener [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
