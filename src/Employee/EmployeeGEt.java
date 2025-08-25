package Employee;

import java.util.Scanner;

public class EmployeeGEt {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number emolpyee:");
		
		int n=Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=n;i++)
		{
			Employee1 e1= Employee1.createEmployeeObject();
			e1.calculateAnnualSalary();
			System.out.println(e1);
		}
	}

}
