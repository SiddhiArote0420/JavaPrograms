/*Create an Employee class with fields name and salary, initialized with constructor.
 Write a method validateSalary() that checks:
Salary must be between 10,000 and 1,00,000 (inclusive).
 If valid → Print “Valid salary”
 Else → Print “Invalid salary”


Concepts Used:
 ✔ Constructor
 ✔ Logical AND operator (&&)
*/

import java.util.*;
class Employee {
 private String name;
 private int salary;
 
 Employee(String name, int salary){
    this.name = name;
	this.salary = salary;
 }
  
  public void validateSalary(){
	  if(salary >= 10000 && salary <= 100000)
	  {
		  System.out.println("Valid salary");
	  }else{
		  System.out.println("Invalid salary");
	  }
  }
}

public class EmployeeApp{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the name of employee");
		String name = sc.nextLine();
		
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		
		Employee emp = new Employee(name, salary);
		emp.validateSalary();
	}
}