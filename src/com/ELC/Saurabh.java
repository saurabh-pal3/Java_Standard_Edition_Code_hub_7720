package com.ELC;

public class Saurabh
{
	 String sname;
	    String sfilling;
	    int sday;
	    double stime;
	    boolean sproof;
	    
	    public void setdata(String name,String filling,int day,double time,boolean proof)
	    {
	        sname=name;
	        sfilling=filling;
	        sday=day;
	        stime=time;
	        sproof=proof;
	        
	    }
	    public void getdata()
	    {
	        System.out.println("The Name is = " +sname);
	        System.out.println("The Filling is = "+sfilling);
	        System.out.println("The Day is = "+sday);
	        System.out.println("The Time is = "+stime);
	        System.out.println("The Proof is = "+sproof);
	    }

}
