package com.thisuse;

 class Saurabh
 {
	 private int id;
	 private String name;
	 private double salary;
	 
	 public  Saurabh(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		return;
	 }

	 @Override
	 public String toString() {
		return "Saurabh :\nid=" + id + ", \nname=" + name + ", \nsalary=" + salary+"\n" ;
	 }
	 
	 
 }


public class Pal
{
    public static void main(String []a)
    {
        Saurabh obj= new Saurabh(123,"Saurabh Pal" ,50000);
        System.out.println(obj);
        
        Saurabh kaka=new Saurabh(241, "Sankruti Pal", 19000)      ;
        System.out.println(kaka);
    }
}
