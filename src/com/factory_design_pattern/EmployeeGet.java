package com.factory_design_pattern;

import java.util.Scanner;

public class EmployeeGet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Enter the employeeNumber: ");
        int employeeNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the employeeName: ");
        String employeeName = sc.nextLine();

        System.out.println("Enter the employeeSalary: ");
        double employeeSalary = sc.nextDouble();

        
        Employee e1 = new Employee(employeeNumber, employeeName, employeeSalary);

   
        System.out.println("\nEmployee Number: " + e1.getEmployeeNumber());
        System.out.println("Employee Name: " + e1.getEmployeeName());
        System.out.println("Employee Salary: " + e1.getEmployeeSalary());

      
        if (e1.getEmployeeSalary() == 90000) {
            System.out.println("Employee is a Developer");
        } else if (e1.getEmployeeSalary() == 60000) {
            System.out.println("Employee is a Designer");
        } else if (e1.getEmployeeSalary() == 40000) {
            System.out.println("Employee is a Tester");
        } else {
            System.out.println("Employee role is not defined.");
        }

        sc.close();
    }
}
