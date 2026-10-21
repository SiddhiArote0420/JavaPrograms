/*Company has Full-Time and Part-Time employees.
 Salary calculation differs for each type.
Requirement:
Create parent class Employee.
 Create child classes FullTimeEmployee and PartTimeEmployee.
 Using parent reference, compute salary.
Input:
Employee Type: Part-Time
Hours Worked: 5
Rate Per Hour: 100
Output:Salary for Part-Time Employee: 500
Explanation:
Main code must work using:
Employee emp = new PartTimeEmployee();
This reduces dependency on specific class → Loose coupling.
*/


import java.util.*;
class Employee{
  
    void empSalary()
	{
		//
	}
	
}
class FullTimeEmployee extends Employee{

    void empSalary()
	{
		int hours = 7;
		int rate = 200;
		System.out.println("Salary for full-time Employee: "+rate*hours);
	}
		
}
class PartTimeEmployee extends Employee{
   void empSalary()
	{
		int hours = 5;
		int rate = 100;
		System.out.println("Salary for part-time Employee: "+rate*hours);
	}
}

class PrintSalary{
	void salaryPrint(Employee e)
	{
		e.empSalary();
	}
}

public class EmployeeSalary{
  public static void main(String[] x)
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Notification Type (fullTime / partTime): ");
        String type = sc.nextLine();
		
		Employee e;
		
		if(type.equalsIgnoreCase("partTime"))
		{
			e = new PartTimeEmployee();
		}else{
			e = new FullTimeEmployee();
		}
        		
		PrintSalary s = new PrintSalary();
		s.salaryPrint(e);
  }
}

/*import java.util.*;

class Employee {
    int hours;
    int rate;

    void setData(int hours, int rate) {
        this.hours = hours;
        this.rate = rate;
    }

    void empSalary() {
        // overridden
    }
}

class FullTimeEmployee extends Employee {
    void empSalary() {
        System.out.println("Salary for Full-Time Employee: " + (hours * rate));
    }
}

class PartTimeEmployee extends Employee {
    void empSalary() {
        System.out.println("Salary for Part-Time Employee: " + (hours * rate));
    }
}

class PrintSalary {
    void salaryPrint(Employee e) {
        e.empSalary();
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Type (Full-Time / Part-Time): ");
        String type = sc.nextLine();

        System.out.println("Enter Hours Worked: ");
        int hours = sc.nextInt();

        System.out.println("Enter Rate Per Hour: ");
        int rate = sc.nextInt();

        Employee e;

        if (type.equalsIgnoreCase("Part-Time")) {
            e = new PartTimeEmployee();
        } else {
            e = new FullTimeEmployee();
        }

        e.setData(hours, rate);

        PrintSalary ps = new PrintSalary();
        ps.salaryPrint(e);
    }
}
*/
