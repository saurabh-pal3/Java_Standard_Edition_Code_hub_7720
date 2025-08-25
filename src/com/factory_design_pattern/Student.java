package com.factory_design_pattern;

public class Student
{
	int id;
	String name;
	
	//alt+shift+s+o
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//alt+shift+s+s
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public void m1()
	{
		this.id=0;
	}
	
	
	public static void main(String[] args) {
		
		Student s1=new Student(111,"raj");
		System.out.println(s1);
		s1.m1();
		System.out.println(s1);
		
	}
	
	
	

}
