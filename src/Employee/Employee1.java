package Employee;

import java.util.Scanner;

public class Employee1 
{
	private String name;
	private int id;
	private String department ;
	private double salary;
	public Employee1(String name, int id, String department, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
		
		
	}
	public static Employee1 createEmployeeObject()

	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Employee name :");
		String name=sc.nextLine();
		
		System.out.println("Enter the Employee id: ");
		int id= Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Employee ndepartment: ");
		String department=sc.nextLine();
		
		System.out.println("Enter the Employee salary : ");
		double salary =Double.parseDouble(sc.nextLine());
		
		return new Employee1(name, id, department, salary);
				

	}
	public double calculateAnnualSalary()
	{
		double anualSal = salary*12;
		double inc=switch(department)
		{
			case "Sales"->
			{
				yield salary*0.1;
			}
			case "Engineering"->
			{
				yield salary*0.15;
			}
			case "HR"->
			{
				yield salary*0.08;
			}
			case "Other"->
			{
				yield salary*0.05;
			}
			
			default->  0.00;

		};
		return anualSal+inc;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + calculateAnnualSalary() + "]";
	}
	
	

}
