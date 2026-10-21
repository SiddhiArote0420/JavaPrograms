//Write a Java program to calculate the net salary of an employee.
//Input: basic salary, HRA %, DA %, and tax %.

import java.util.*;
public class calNetSalary
{
	public static void main(String x[])
	{
		Scanner netSalary = new Scanner(System.in);
		
		System.out.println("Enter the basic salary  %: ");
		double basicSal = netSalary.nextDouble();
		
		
		System.out.println("Enter the House Rent Allowance % : ");
		double hraPer = netSalary.nextInt();
		double hra = (hraPer /100)*basicSal;
		
		
		System.out.println("Enter the Dearness Allowance % : ");
		double daPer = netSalary.nextInt();
		double da = (daPer / 100)*basicSal;
		
		System.out.println("Enter the Tax : ");
		double taxPer = netSalary.nextInt();
		double tax = (taxPer / 100)* basicSal;
		
		double salary = basicSal + hra + da - tax ;
		
		System.out.println("Net Salary = " + salary);
		
	}
}
