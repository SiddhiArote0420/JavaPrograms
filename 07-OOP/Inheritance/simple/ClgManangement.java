/*
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.
Class Structure:
Parent Class – Person
Data Members:
 int id, String name, String address, String contactNo
Member Methods:
addDetails() – Accept and store basic person details.
displayDetails() – Display details of a person.
updateAddress() – Update the address of a person.
updateContact() – Update contact number.
showBasicInfo() – Display ID, name, and contact number.
Child Class 1 – Student extends Person
Additional Data Members:
String courseName, int marks[3], double percentage
Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.
Child Class 2 – Faculty extends Person
Additional Data Members:
String subject, double salary, int experience
Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.


Operations to Perform (Sequentially):
Add student details using addDetails() method.
Enter marks for three subjects using enterMarks().
Calculate and store the student’s percentage using calculatePercentage().
Update the student’s contact number using updateContact().
Display all details of the student using displayDetails().
Add faculty details using addDetails() method.
Assign subject to faculty using assignSubject().
Calculate salary increment for the faculty using calculateIncrement().
Update the faculty’s address using updateAddress().
Display complete faculty information using displayFacultyInfo().
Instructions:
Use constructors in all classes for initialization.
Use the super keyword to call parent constructors in child classes.
Apply method overriding for displayDetails() to show specific outputs for each child class.
Perform all 10 operations sequentially in the main() method.
Do not use collections; use arrays or primitive variables only.
*/


import java.util.*;
class Person{

    protected int id;
	protected  String name;
	protected  String address;
	protected  String contactNo;
	
	Person(int id, String name, String address, String contactNo)
	{
	  this.id = id;
	  this.name = name;
	  this.address = address;
	  this.contactNo = contactNo;
	}
	
	void addDetails(){
		Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the id");
	  int id = sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter the name");
	  String name = sc.nextLine();
	  System.out.println("Enter the Address");
	  String address = sc.nextLine();
	  System.out.println("Enter the Contact");
	  String contactNo = sc.nextLine();
	  
	}
	
	void displayDetails(){
	  System.out.println("Id = "+id);
	  System.out.println("Name = "+name);
	  System.out.println("Address = "+address);
	  System.out.println("Contact No. = "+contactNo);
	}
	
	void updateAddress(){
		Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the new address");
	  String newAdd = sc.nextLine();
	  address = newAdd;
	}
	
	void updateContact(){
		Scanner sc = new Scanner(System.in);
	   System.out.println("Enter new contact no");
	   String newContact = sc.nextLine();
	   contactNo = newContact;
	}
	
	void showBasicInfo(){
	   System.out.println("Id = "+id+", Name = "+name+", Contact Number = "+contactNo);
	}
	 
}

class Student extends Person
{
  protected String courseName;
  protected int marks[] = new int[3];
  protected double percentage;
  
  Student(int id,String name, String address, String contactNo, String courseName, int[] marks,double percentage)
  {
	  super(id, name, address, contactNo);
	  this.courseName = courseName;
	  
  }
  
  void enterMarks(){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Student Marks");
	  System.out.println("Enter the marks of 3 sub");
	  for(int i = 0; i<marks.length ; i++)
	  {
		  marks[i]= sc.nextInt();
	  }
	  System.out.println("...........................");
  }
  
  void calculatePercentage(){
	  int sum = 0;
	  for(int i : marks)
	  {
		  sum = sum+i;
	  }
	  
	  percentage = (sum*marks.length)/100;
  }	 
  //overriding
  	void addDetails(){
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter Student detail ");	  
	  System.out.println("Enter the id");
	  int id = sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter the name");
	  String name = sc.nextLine();
	  System.out.println("Enter the Address");
	  String address = sc.nextLine();
	  System.out.println("Enter the Contact");
	  String contactNo = sc.nextLine();
	  System.out.println("Enter the course Name");
	  String courseName = sc.nextLine();
	  System.out.println("...........................");
	  
	}
	
	void displayDetails(){
		System.out.println("Student detail");
	  System.out.println("Id = "+id);
	  System.out.println("Name = "+name);
	  System.out.println("Address = "+address);
	  System.out.println("Contact No. = "+contactNo);
	  System.out.println("course Name = "+courseName);
	  System.out.println("Percentage = "+percentage);
	  System.out.println("...........................");
	}
	
	void updateContact(){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Student contact updatae");	   
	   System.out.println("Enter new contact no");
	   String newContact = sc.nextLine();
	   contactNo = newContact;
	   System.out.println("...........................");
	}
  
  
}
class Faculty extends Person
{
	protected String subject;
	protected double salary;
	protected int experience;
	
	Faculty(String subject, double salary, int experience,int id,String name, String address, String contactNo)
	{
		super(id,name,address,contactNo);
		this.subject = subject;
		this.salary = salary;
		this.experience = experience;
	}
	  void assignSubject()
	  {   Scanner sc = new Scanner(System.in);
	  	System.out.println("Assinge subject to Faculty ");
		  System.out.println("Enter the Subject");
		  String subject = sc.nextLine();
		  System.out.println("...........................");
	  }
 		  
	  void calculateIncrement()
	  {
		  if(experience > 5){
		    double increment = (double)(salary*10)/100;
			System.out.println("Increse salary = "+increment);
		  }else{
			  System.out.println("salary are not increse becuse less experiance");
		  }
		  System.out.println("...........................");
	  }
	  void displayFacultyInfo()
	  { 	System.out.println("Faculty detail show ");
		System.out.println("Subject = "+subject);
	    System.out.println("Salary = "+salary);
	    System.out.println("Experiance = "+experience);
		System.out.println("...........................");
	  }	  
	
	//overriding
	void addDetails(){
	  Scanner sc = new Scanner(System.in);
	  	System.out.println("Faculty detail Enter");
	  System.out.println("Enter the id");
	  int id = sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter the name");
	  String name = sc.nextLine();
	  System.out.println("Enter the Address");
	  String address = sc.nextLine();
	  System.out.println("Enter the Subject");
	  String subject = sc.nextLine();
	  System.out.println("Enter the course salary");
	  double salary = sc.nextInt();
	  System.out.println("Enter the Expeiriance");
	  int experience = sc.nextInt();
	  System.out.println("...........................");
	  
	}
	void updateAddress(){
	  Scanner sc = new Scanner(System.in);
	  	System.out.println("Faculty Address Update");
	  System.out.println("Enter the new address");
	  String newAdd = sc.nextLine();
	  address = newAdd;
	  System.out.println("...........................");
	}
	/*void displayDetails(){
		System.out.println("Faculty detail");
	  System.out.println("Id = "+id);
	  System.out.println("Name = "+name);
	  System.out.println("Address = "+address);
	  System.out.println("Contact No. = "+contactNo);
	  System.out.println("Subject Name = "+subject);
	  System.out.println("Salary = "+salary);
      System.out.println("Expeiriance = "+experience);
	}*/
  
}

public class ClgManangement{
 public static void main(String[] x){
 Scanner sc = new Scanner(System.in);
 
 Student stud = new Student(1, "Sia", "Pune", "99999", "B.Tech", new int[3], 0);
 stud.addDetails();
 stud.enterMarks();
 stud.calculatePercentage();
 stud.updateContact();
 stud.displayDetails();
 System.out.println("================================");
 Faculty f = new Faculty("Java", 40000, 6, 101, "Prital", "Mumbai", "88888");
 f.addDetails();
 f.assignSubject();
 f.calculateIncrement();
 f.updateAddress();
 f.displayFacultyInfo();
 
 }
}