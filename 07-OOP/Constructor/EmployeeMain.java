/* Create a class Employee with fields:
empId, empName, basicSalary, hra, da, and grossSalary.
Use a parameterized constructor to initialize empId, empName, and basicSalary.
 HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
 Display all employee details and salary slip.
Hint: Use constructor to calculate the salary.
Explanation:
 This helps you understand how constructors can perform initial calculations immediately after object creation.
*/

import java.util.*;
class Employee{
	private int empId;
	private String empName;
	private int basicSalary;
    private double hra;
	private double	da;
	private double	grossSalary;
	
	public Employee(int empId,String name, int basicSalary)
	{
		this.empId = empId;
		this.empName = name;
		this.basicSalary = basicSalary;
		
		this.hra = 0.10 * basicSalary;
        this.da = 0.15 * basicSalary;
        this.grossSalary = basicSalary + hra + da;
	}
	
	public void dispalyDetails(){
		System.out.println("......Employe details......");
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee name: "+empName);
		System.out.println("Employee basic Salary: "+basicSalary);
		System.out.println("Employee HRA: "+ hra);
		System.out.println("Employee DA: "+da);
		System.out.println("Employee Gross Salary: "+grossSalary);
	}
}
	
public class EmployeeMain{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Enter the Basic Salary");
		int basicSalary = sc.nextInt();
		
		Employee emp = new Employee(id,name,basicSalary);
		emp.dispalyDetails();
	}
}
