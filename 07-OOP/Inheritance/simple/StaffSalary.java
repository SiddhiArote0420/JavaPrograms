/*Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.


For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.


Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
*/

import java.util.*;
class Staff{
	int salary;
	
	Staff(int sal)
	{
		this.salary = sal;
	}
	
	void calIncrementSal()
	{
		System.out.println("result not defined for base class");
	}

}
class TeachingStaff extends Staff{
	TeachingStaff(int salary)
	{
		super(salary);
	}
	double per = 15;
	void calIncrementSal()
	{
	  double sal =(double) salary+(salary*per/100);
	  System.out.println("Teaching Staff salary is = "+sal);
	}

}
class NonTeachingStaff extends Staff{
	NonTeachingStaff(int salary)
	{
		super(salary);
	}
    double per = 10;
	void calIncrementSal()
	{
	   double sal = (double) salary+(salary*per/100);
	   System.out.println("NonTeaching Staff salary is = "+sal);
	}
}
public class StaffSalary{
 public static void main(String[] x)
 {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Salary of Teaching Staff");
	int salary1 = sc.nextInt();
	
	System.out.println("Enter the Salary of NonTeaching Staff");
	int salary2 = sc.nextInt();
	
	TeachingStaff t = new TeachingStaff(salary1);
	t.calIncrementSal();
	
	NonTeachingStaff n = new NonTeachingStaff(salary2);
	n.calIncrementSal();
	
 }
}