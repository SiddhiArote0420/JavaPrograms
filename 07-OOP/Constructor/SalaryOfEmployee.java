/* Create an Employee class with:
empId
name
salary


Use constructor to initialize values.
Create an array of 10 employees.
Write a method filterHighSalary() that prints only those employees whose salary > 30000.
Concepts Used:
 ✔ Array of objects
 ✔ Constructor for object initialization
 ✔ Logical operator (salary > 30000)
Explanation:
 Constructor loads employee data.
 Using loops and logical conditions, filter and display selected employees.
*/


import java.util.*;
class Employee{
   private int empId;
   private String name;
   private int salary;
   private Employee[] emp;
   
   Employee(int empId, String name, int salary )
   {
	   this.empId = empId;
	   this.name = name;
	   this.salary = salary;
	   this.emp = emp;
   }
   
   Employee(Employee[] emp)
   {
	   this.emp = emp;
   }
   
   void filterHighSalary()
   {  System.out.println("employees whose salary > 30000");
      for(Employee e : emp)
	  {
		  if(e.salary > 30000)
		  {
			  System.out.println(e.name +" == "+ e.salary);
		  }
	  }
   }
	   

}

public class SalaryOfEmployee{
	public static void main(String [] x)
	{
		Scanner sc = new Scanner(System.in);
		
		Employee emp[] = new Employee[5];
		
		for(int i =0; i<emp.length; i++)
		{
          
		  System.out.println("Enter the empId");
		  int empId = sc.nextInt();
		  sc.nextLine();
		  
		  System.out.println("Enter the name");
		  String name = sc.nextLine();
		  
		  System.out.println("Enter the salary");
		  int salary = sc.nextInt();
		  
		  System.out.println();
		  
		  emp[i] = new Employee(empId, name, salary);
		}
		
		Employee e = new Employee(emp);
	    e.filterHighSalary();
		
	}
}