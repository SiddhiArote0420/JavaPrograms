/* Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95%*/



import java.util.*;
public class calGrossSalary
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
		
		
		double salary = basicSal + hra + da  ;
		
		System.out.println("Net Salary = " + salary);
		
	}
}

