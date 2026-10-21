/* Q1. Employee Salary System
Concepts Used: Abstract class, method overriding, logic
 Operations to Perform:
Create an abstract class Employee
Fields: empId, name, basicSalary
Abstract method: calculateSalary()
Create two subclasses:


PermanentEmployee (HRA 20%, DA 10%)
ContractEmployee (HRA 10%, DA 5%)


Calculate total salary
Display employee details


Logic Focus:
 Different salary calculation logic using inheritance.
Explanation:
 Abstract class forces subclasses to implement salary logic differently.
*/

import java.util.*;
abstract class Employee
{
   int empId;
   String name;
   double basicSalary;
   
   Employee(int empId, String name, double basicSalary)
   {
      this.empId = empId;
	  this.name = name;
	  this.basicSalary = basicSalary;
	 
   }
   
   abstract double calculateSalary();
   
   void displayDetails(double totalSalary) {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
		 System.out.println("Total Salary: " + totalSalary);
   }
 
}
 class PermanentEmployee extends Employee{
   
    PermanentEmployee(int empId, String name, double basicSalary)
	{
		super(empId, name, basicSalary);
	}
   
   public double calculateSalary()
   {
      double hra = (basicSalary*0.20);
	  double da = (basicSalary*0.10);
	  
	  return basicSalary+da+hra;
	  
	
	}
}

class ContractEmployee extends Employee{
   ContractEmployee(int empId, String name, double basicSalary)
	{
		super(empId, name, basicSalary);
	}
   public double calculateSalary()
   {
      double hra = (basicSalary*0.10);
	  double da = (basicSalary*0.05);
	  
	  return basicSalary+da+hra;
	  
	  
	}
}

public class EmployeeApp
{
 public static void main(String[] x)
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the id: ");
	 int empId = sc.nextInt();
	 sc.nextLine();
	 
	 System.out.println("Enter the name: ");
	 String name = sc.nextLine();
	 
	 System.out.println("Enter the basic Salary: ");
	 double basicSalary = sc.nextDouble();
	 
	 System.out.print("Enter Employee Type (1-Permanent, 2-Contract): ");
        int choice = sc.nextInt();
     System.out.println();
        Employee emp;
        if (choice == 1) {
            emp = new PermanentEmployee(empId, name, basicSalary);
        } else {
            emp = new ContractEmployee(empId, name, basicSalary);
        }
     
	    double totalSalary = emp.calculateSalary();
        emp.displayDetails(totalSalary);

	 
 }
}
	 
	 
	  
 
   