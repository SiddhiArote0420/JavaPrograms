/* Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                                	Basic Salary <= 10000 : HRA = 20%, DA = 80%
                                	Basic Salary <= 20000 : HRA = 25%, DA = 90%
                                	Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.*;
public class findGrossSalary
{
  public static void main(String x[])
  {
	  Scanner grossSalary = new Scanner(System.in);
	  double hra =0,da=0,salary;
	  
	  System.out.println("Enter the basic salary :");
	  double basicSalary = grossSalary.nextDouble();
	  
	  if( basicSalary <= 10000 && basicSalary > 0)
	    {
		  hra = 20; da = 80;
        }else if (basicSalary > 10000 && basicSalary <= 20000)
	    {
		  hra = 25; da = 90;
        }else if( basicSalary > 20000)
        {
          hra = 30; da = 95;
        }else{
			System.out.println("Invalid Input");
			return; 
		}

   	  hra = (hra/100)*basicSalary;
      da = (da/100)*basicSalary	; 
	  salary = basicSalary + hra + da; 
	  
	  System.out.println("Gross salary is : "+salary);
  }
}