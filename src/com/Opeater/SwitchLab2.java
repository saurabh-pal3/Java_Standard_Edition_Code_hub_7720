package com.Opeater;

import java.util.Scanner;

public class SwitchLab2 {

	

	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
	
		System.out.print("Enter the number 1:");
		 int n1 = sc.nextInt();
		System.out.print("Enter the number 2:");
	    int n2 = sc.nextInt();
	    System.out.println("Choose operation: ADD / SUB / MUL / DIV");
	    String operator =sc.next().toLowerCase();
	    
	    switch(operator)
	    {
	    case "add" ->
	    {
	    	 sum = n1+n2;
	    	 System.out.println("Result: "+sum);
	    }
	    case "sub" ->
	    {
	    	 sum = n1-n2;
	    	 System.out.println("Result: "+sum);
	    }
	    case "mul" ->
	    {
	    	 sum = n1*n2;
	    	 System.out.println("Result: "+sum);
	    }
	    case "div" ->
	    {
	    	 sum = n1/n2;
	    	 System.out.println("Result: "+sum);
	    }
	    
	    }
	    sc.close();
 
	    
	    
	    
	   
	     

	}

}
