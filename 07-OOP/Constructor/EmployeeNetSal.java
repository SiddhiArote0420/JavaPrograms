/*Create a class Employee with:
Fields: id, name, basicSalary, isPermanent


Parameterized constructor to initialize fields.


Write methods:


calculateNetSalary() →


if permanent → HRA = 20%, DA = 10%, PF = 12%
if temporary → HRA = 10%, DA = 5%, PF = 0
compareSalary(Employee e) → return higher salary employee name.


Task Logic:
 Create 3 Employee objects.
 Compare each pair using logic (nested comparison).
Expected Learning: Complex if-else + constructor initialization + inter-object comparison.*/

import java.util.*;
class Employee{
   private int id;
   private String name;
   private float basicSalary;
   private String isPermanent;
   private Employee[] emp;
   
   Employee(Employee[] emp)
   {
	   this.emp = emp;
   }
   
   Employee(int id, String name, float basicSalary, String isPermanent)
   {
	   this.id = id;
	   this.name = name;
	   this.basicSalary = basicSalary;
	   this.isPermanent = isPermanent;
   }
   
   void calculateNetSalary()
   {
	   Employee highestSal = emp[0];
	   for(Employee e : emp){
		  if(calNetSal(highestSal) < calNetSal(e)) 
		  {
			  highestSal = e;
		  }
	    
	   }
	   
	   System.out.println("Highest salary employee :" + highestSal.name);
   }
   
   float calNetSal(Employee e)
   {
	   float basic = e.basicSalary;
	   if("Y".equalsIgnoreCase(e.isPermanent))
	    {
		   float hra = basic*0.20f;
           float da = basic*0.10f;
           float pf = basic*0.12f;

           return basicSalary + hra + da - pf;
		}else if("N".equalsIgnoreCase(e.isPermanent))
		{
           	float hra = basic*0.10f;
           float da = basic*0.05f;
           float pf = basic*0.0f;

           return basicSalary + hra + da - pf;
		}else{
			return 0.0f;
		}
   }
            			
	   
   
}

public class EmployeeNetSal{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		
		Employee emp[] = new Employee[4];
		
		for(int i=0; i< emp.length; i++)
		{
		   System.out.println("Enter the id");
		   int id = sc.nextInt();
		   sc.nextLine();
		
		   System.out.println("Enter the name");
		   String name = sc.nextLine();
		
		   System.out.println("Enter the basic salary");
		   float basicSalary = sc.nextFloat();
		   sc.nextLine();
		
		   System.out.println("Enter the is a Permanant or not (Y/N)");
		   String isPermanent = sc.nextLine();
		   
		   emp[i] = new Employee(id, name, basicSalary, isPermanent);
		}
		
		Employee e = new Employee(emp);
		e.calculateNetSalary();
	}
}

        