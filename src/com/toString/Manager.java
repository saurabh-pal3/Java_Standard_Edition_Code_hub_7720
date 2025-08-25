package com.toString;

public class Manager {
	
	int Id;
	String Name;
	double Salary;
	
public void SetData(int mid,String mname,double msalary)
{
	Id=mid;
	Name=mname;
	Salary= msalary;
	
	
}

@Override
public String toString() {
	return "Id=" + Id + ", \nName=" + Name + ",\nSalary=" + Salary ;
}
	

}
