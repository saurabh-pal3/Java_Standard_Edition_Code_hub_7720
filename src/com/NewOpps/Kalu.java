package com.NewOpps;

 class Lalu 
{
	private String lname;
	private int lid;
	private double lsalary;
	
	
	public void setlalu(String name,int id,double salary)
	{
		lname=name;
		lid=id;
		lsalary=salary;
	}


	@Override
	public String toString() {
		return "Lalu [lname=" + lname + ", lid=" + lid + ", lsalary=" + lsalary + "]";
	}
	
	
}
//package com.NewOpps;
public class Kalu {
	public static void main(String[]a)
	{	
		Lalu babu=new Lalu();
		babu.setlalu("Karan", 101, 12300);
        System.out.println(babu.toString());
		
	}

}

