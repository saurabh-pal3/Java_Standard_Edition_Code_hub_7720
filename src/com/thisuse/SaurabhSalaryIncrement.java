package com.thisuse;

public class SaurabhSalaryIncrement 
{ 
	private int id;
	private String name;
	private double salary;
	public SaurabhSalaryIncrement(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		if(id<=0)
		{
			System.out.println("The id must be postive ");
			System.exit(0);
		}
		if(name==null || name.trim().isEmpty()|| name.equals("null"))
		{
			System.err.println("The name not be empty or null");
			System.exit(0);
		}
		if(salary <0)
		{
			System.out.println("Add postive salary");
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) 
	{
		if(salary<=this.salary)
		{
			System.out.println("Increment Amount must be positive !");
			System.exit(0);
		}
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "SaurabhSalaryIncrement [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
