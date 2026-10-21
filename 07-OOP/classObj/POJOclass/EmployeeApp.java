/*Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.
*/

import java.util.*;
class Employee{
   private int empId;
   private String name;
   private float basicSalary;
   private float hra;
   private float da;
   
   
   void setEmpId(int empId){ this.empId = empId;	}
	int getEmpId(){ return empId; }
	
	void setName(String name){ this.name = name; }
	String getName(){ return name; }
	
	void setBasicSalary(float basicSalary){ this.basicSalary = basicSalary; }
	float getBasicSalary(){ return basicSalary; }
	
	void setHra(float hra){ this.hra = hra; }
	float getHra(){ return hra; }
	
	void setDa(float da){ this.da = da; }
	float getDa(){ return da; }
	
	float calGrossSalary(){
	  return  basicSalary+hra+da;
	}
}

public class EmployeeApp{
 public static void main(String x [])
 {
    Scanner sc = new Scanner(System.in);
	
	Employee[] emp = new Employee[5];
	
	System.out.println("Enter Employee details");
	System.out.println(".........................");
	for(int i=0; i<emp.length; i++)
	{
		emp[i] = new Employee();
		System.out.println("Enter the Id of "+(i+1)+ " Employee: ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name of " +(i+1)+ " Employee: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the basic salary of " +(i+1)+ " Employee: ");
	    float basicSalary = sc.nextFloat();
		
		System.out.println("Enter the hra of " +(i+1)+ " Employee: ");
	    float hra = sc.nextFloat();

        System.out.println("Enter the da of " +(i+1)+ " Employee: ");
	    float da = sc.nextFloat();	

        System.out.println();
            emp[i].setEmpId(empId);
            emp[i].setName(name);
            emp[i].setBasicSalary(basicSalary);
            emp[i].setHra(hra);
            emp[i].setDa(da);		
	}
	
	//grass salary of all emp
	System.out.println("grass salary of all employee");
	   for(Employee e : emp)
	   { 
		  System.out.println(e.getName()+" ===> "+ e.calGrossSalary());
	   } 
	   System.out.println();
	   
	   EmployeeApp app = new EmployeeApp();
	   app.maxSalary(emp);
	   app.avgSalary(emp);
	   
	
 }	
	// employee with the maximum salary.
	
	void maxSalary(Employee[] emp){
		System.out.println("Employee with tha max salary");
		Employee maxSal = emp[0];
		for(Employee s : emp)
		{
           if(s.calGrossSalary() > maxSal.calGrossSalary())
		   {
			   maxSal = s;
		   }
		}
		System.out.println(maxSal.getName() + " => " + maxSal.calGrossSalary());
		System.out.println();
	}
		
 		   
	//salary is greater than the average salary of all employees
	public void avgSalary(Employee[] emp)
	 {
        System.out.println("Employee with tha salary is grater than the avg");
		 int sum = 0;
	   for(Employee e : emp)
	   {
	      sum += e.calGrossSalary();
	   }
	   float avg = sum/emp.length;
	   for(Employee e : emp)
	   {
		   if(avg < e.calGrossSalary())
		   {
			   System.out.println(e.getName() + " => " + e.calGrossSalary());
			   
			   System.out.println(" ");
		   }
	   }
	   
	}
	
 
}