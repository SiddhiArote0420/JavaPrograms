/* Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object
*/

import java.util.*;
class Employee{
 private int id;
 private String name;
 private int salary; 
 
  public void setId(int id)
  {
	 this.id=id;
  }
  public int getId()
  {
	  return id;
  }
  
  public void setName(String name)
  {
	this.name = name;
  }
  public String getName()
  {
    return name;
  }

  public void setSalary(int salary)
  {
    this.salary = salary;
  }
  public int getSalary()
  {
     return salary;
  }	 
  
  
}
public class POJORetriveData{
	public static void main(String [] x){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Empolye ID: ");
	int id = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter the Empolye name: ");
	String name = sc.nextLine();
	
	System.out.println("Enter the Empolye salary: ");
	int salary = sc.nextInt();
	
	Employee em = new Employee();
	
	em.setId(id);
	em.setName(name);
	em.setSalary(salary);
	
	System.out.println(".............. ");
	
	System.out.println("id ="+em.getId());
	System.out.println("Name ="+em.getName());
	System.out.println("Salary ="+em.getSalary());

}
}