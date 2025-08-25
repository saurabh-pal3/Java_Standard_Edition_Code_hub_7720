package com.toString;

public class Pal
{
   public static void main(String[]a)
   {
       Saurabh babu =new Saurabh();
       babu.setStudentData("Saurabh pal",12,34);
       babu.Setconditon();
       System.out.println(babu);

   }
}

class Saurabh
{
   private String Name;
   private int Student ;
   private int Marks;
   private char Grade;

   public void setStudentData(String name,int id,int marks )
   {
	   Name=name;
	   Student =id;
	   Marks=marks;
     

   }
   public void Setconditon()
   {
       if(Marks>=90)
       {
    	   Grade='A';
       }
       else if(Marks>=81 && Marks<=90)
       {
    	   Grade='B';
       }
       else if(Marks>=71 && Marks<=80)
       {
    	   Grade='C';
       }
       else if(Marks>=61 && Marks<=70)
       {
    	   Grade='D';
       }
       else if(Marks>51 && Marks<=40)
       {
    	   Grade='E';
       }
       else if(Marks<35)
       {
    	   Grade='F';
       }

   }
   @Override
   public String toString() {
	return "Saurabh [Name=" + Name + ", Student=" + Student + ", Marks=" + Marks + ", Grade=" + Grade + "]";
   }
   
   
   
}





