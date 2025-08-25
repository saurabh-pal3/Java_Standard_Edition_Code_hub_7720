package com.thisuse;

import java.util.Scanner;

public class GetEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Employee Number: ");
            int employeeNumber = Integer.parseInt(sc.nextLine()); 

            System.out.print("Enter the Employee Name: ");
            String employeeName = sc.nextLine();

            System.out.print("Enter the Employee Salary: ");
            double employeeSalary = sc.nextDouble();
            sc.nextLine(); 
            System.out.println("-----------------------");
            Employee saurabh = new Employee();

            saurabh.setEmployeeDetails(employeeNumber, employeeName, employeeSalary);
            saurabh.calculateSalaryIncrement();
            saurabh.getEmployeeDetails();

            System.out.println("Add employee: 1 :: 2 for Exit");
            int ta = Integer.parseInt(sc.nextLine()); 

            if (ta == 2) {
                System.out.println("Thank you");
                break;
            }
        }

        sc.close();
    }
}
