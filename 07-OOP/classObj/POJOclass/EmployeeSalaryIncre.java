/*2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.
*/
 
 import java.util.*;
 class Employee{
    private String name;
	private int salary;
	private String department;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	public String getDepartment(){
		return department;
	}
 }
 
 public class EmployeeSalaryIncre{
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the current salary:");
		 int salary = sc.nextInt();
		 
		 Employee em = new Employee();
		 em.setSalary(salary);
		 
		 System.out.println("Updated salary is:"+ em.getSalary()*1.10 );
	 }
 }
		 