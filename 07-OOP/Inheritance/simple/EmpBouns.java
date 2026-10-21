/* Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.


Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
*/

import java.util.*;
class Employee{
  int salary;
  String name;
  
  void setEmployee(int sal,String name)
  {
    salary = sal;
	this.name = name;
  }
 }
 class Manager extends Employee
 {
    void getCalculateBonus()
	{
	  int res = (int)(salary*0.2);
	  int finalAmt = salary+res;
	  System.out.println("Final Amount of manager: "+finalAmt);
	}
 }
 class Developer extends Employee
 {
    void getCalculateBonus()
	{
	  int res = (int)(salary*0.1);
	  int finalAmt = salary+res;
	  System.out.println("Final Amount of Developer: "+finalAmt);
	}
 }
 
 public class EmpBouns{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the salary");
   int salary = sc.nextInt();
   
   sc.nextLine();
   System.out.println("Enter the Name");
   String name = sc.nextLine();
   
   Manager m = new Manager();
   m.setEmployee(salary,name);
   m.getCalculateBonus();
   
   Developer d = new Developer();
   d.setEmployee(2000,"ved");
   d.getCalculateBonus();
}
}   
   