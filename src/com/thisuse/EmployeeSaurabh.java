package com.thisuse;


public class EmployeeSaurabh 
{
	private String  firstName;
	private String   lastName ;
	private int   employeeId ;
	private double   salary;
	private int  NoOfProject;
	public EmployeeSaurabh() 
	{
		
	}
	public EmployeeSaurabh(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		NoOfProject = noOfProject;
		
		
	}
	
	public String getFirstName() 
	{
	
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		if(firstName==null||firstName.trim().isEmpty()||firstName.equals("null"))
			{
			System.err.println("The Name must  not be null and empty");
			System.exit(0);
	}
			
		
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		if(lastName==null||lastName.trim().isEmpty()||lastName.equals("null"))
		{
		System.err.println("The Name must  not be null and empty");
		System.exit(0);
}
		this.lastName = lastName;
	}

	public int getEmployeeId() 
	{
		return employeeId;
	}

	public void setEmployeeId(int employeeId) 
	{
		if(employeeId<0)
		{
			System.err.println("The value is positive");
			System.exit(0);
		}
		this.employeeId = employeeId;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		if(salary<0)
		{
			System.err.println("Nagetive value no valide");
			System.exit(0);
		}
		this.salary = salary;
	}

	public int getNoOfProject() 
	{
		return NoOfProject;
	}

	public void setNoOfProject(int noOfProject) 
	{
		if(noOfProject<0)
		{
			System.err.println("The valuemust be  positive");
			System.exit(0);
		}
		NoOfProject = noOfProject;
	}

	
		int amount;
		public void calculateSalary() {
		    int amount = 0;
		    if (NoOfProject >= 6 && NoOfProject <= 10)
		    {
		        amount = 5000;
		        
		    } 
		    else if (NoOfProject >= 11 && NoOfProject <= 20) 
		    {
		        amount = 10000;
		        
		    } 
		    else if (NoOfProject > 20)
		    {
		        amount = 15000;
		    }
		    salary += amount;
		    System.out.println("The upgraded salary = " + salary);
		    
		

		
	}
	@Override
	public String toString() {
	    return "firstName: " + firstName 
	        + "\nlastName: " + lastName 
	        + "\nemployeeId: " + employeeId
	        + "\nsalary: " + String.format("%.2f", salary)
	        + "\nNoOfProject: " + NoOfProject+
	        "\n-----------------------";
	    
	    
	}

	
	

}
