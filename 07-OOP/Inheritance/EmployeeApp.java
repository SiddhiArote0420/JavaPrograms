 /*Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
The manager gets a 20% bonus on salary.


The developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.*/
 
 
 import java.util.*;
 class Employee{
    String name;
	int salary;
	
	Employee(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	 public void displayTotalSal(){
		System.out.println("bonus calculation not for base case");
	 }
 }
 
 class Manager extends Employee{
	 Manager(String name, int salary){
		 super(name, salary);
	 }
	 
	 public void displayTotalSal(){
        double bonus = salary*0.20;
		double totalSal = salary + bonus;
		System.out.println("Total salary of Developer "+ name +" = "+totalSal);
	 }
 }
 
 class Developer extends Employee{
	 
	 Developer(String name, int salary){
		 super(name, salary);
	 }
	 
     public void displayTotalSal(){
        double bonus = salary*0.15;
		double totalSal = salary + bonus;
		System.out.println("Total salary of Developer "+ name +" = "+totalSal);
	 }
 }
 
 public class EmployeeApp{
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  // Manager detail
	  System.out.println("Enter the name of manager");
	  String nameM = sc.nextLine();
	  
	  System.out.println("Enter the salary of manager");
	  int salaryM = sc.nextInt();
	  sc.nextLine();
	  
	  // developer detail
	  System.out.println("Enter the name of developer");
	  String nameD = sc.nextLine();
	  
	  System.out.println("Enter the salary of developer");
	  int salaryD = sc.nextInt();
	  
	 
	  Manager m = new Manager(nameM , salaryM);
	  m.displayTotalSal();
	  
	  Developer d = new Developer(nameD , salaryD);
	  d.displayTotalSal();
	  
  }
 }
	  
	  