//package org.techhub;

import java.util.*;

/*
Student Management System
Create a POJO class Student with fields: id, name, email, contact, c.ourse, marks
Create a College class, pass multiple Student objects using var-args.
Implement operations in the main class:


Add Student Details.
Show All Student Details.
Search Student Using:
id
name
Delete Student Using:

email
marks < 40 (failed students).


Update Student Using:
id → update course.
name → update contact.


Sort Students:
By id ascending.
By marks descending.
Display the topper (highest marks).
Display students with marks between 50–80.
Exit.
*/

class Student {
	private int id;
	private String name;
	private String email;
	private String contact;
	private String course;
	private double marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}

class College {
	Student[] stud;
	Scanner sc = new Scanner(System.in);

	College(Student... stud) {
		this.stud = stud;
	}
	
	void addStudet() {
		for(int i=0 ; i<stud.length ; i++) {
			System.out.println("Enter the Id, name , email , contact, cource, marks");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			String contact = sc.nextLine();
			String cource = sc.nextLine();
			double marks = sc.nextDouble();
			
			Student s = new Student();
			
			s.setId(id);
			s.setName(name);
			s.setEmail(email);
			s.setContact(contact);
			s.setCourse(cource);
			s.setMarks(marks);
			
			stud[i] = s;
			
		}
	}
	
	void getStudent() {
		
		for(int i=0 ; i<stud.length ; i++) {
		  if (stud[i] != null) { 
			System.out.println("Id :\t\t" + stud[i].getId());
			System.out.println("Name :\t\t" + stud[i].getName());
			System.out.println("Email :\t\t" + stud[i].getEmail());
			System.out.println("Contact :\t" + stud[i].getContact());
			System.out.println("Cource :\t" + stud[i].getCourse());
			System.out.println("Marks :\t\t" + stud[i].getMarks());
			System.out.println("----------------------------------------");
		  }
		}
	}
	
	void searchStudentById(int id) {
		boolean found = false;
		for(int i=0 ; i<stud.length ; i++)
		{
			if(stud[i] != null && stud[i].getId() == id  ) {
				System.out.println("Student Found");
				System.out.println("Id :\t\t" + stud[i].getId());
				System.out.println("Name :\t\t" + stud[i].getName());
				System.out.println("Email :\t\t" + stud[i].getEmail());
				System.out.println("Contact :\t" + stud[i].getContact());
				System.out.println("Cource :\t" + stud[i].getCourse());
				System.out.println("Marks :\t\t" + stud[i].getMarks());
				System.out.println("----------------------------------------");
				found = true;
				break;
			}
			else {
				found = false;
			}
		}
		if(!found) {
			System.out.println("Student Not Found!");
		}
	}
	
	void searchStudentByName( String name)
	{
		boolean found = false;
		for(int i=0 ; i<stud.length ; i++)
		{
			if( stud[i] != null && stud[i].getName().equals(name) ) {
				System.out.println("Student Found");
				System.out.println("Id :\t\t" + stud[i].getId());
				System.out.println("Name :\t\t" + stud[i].getName());
				System.out.println("Email :\t\t" + stud[i].getEmail());
				System.out.println("Contact :\t" + stud[i].getContact());
				System.out.println("Cource :\t" + stud[i].getCourse());
				System.out.println("Marks :\t\t" + stud[i].getMarks());
				System.out.println("----------------------------------------");
				found = true;
				break;
			}
			else {
				found = false;
			}
		}
		if(!found) {
			System.out.println("Student Not Found!");
		}
	}
	
	void delateByEmail(String email)
	{
		boolean found = false;
		for(int i=0; i<stud.length;i++)
		{
		    if(stud[i]!= null && stud[i].getEmail().equals(email))
			{
				stud[i] = null;
				System.out.println("Deleted");
			    found = true;
				break;
			}
			else {
				found = false;
			}
		}
		if(!found) {
			System.out.println("Student Not Found!");
		}
	}
	
	void deleteByMarks()
	{
		for(int i=0 ; i<stud.length; i++)
		{
			if(stud[i]!=null && stud[i].getMarks()<= 40)
			{
			    stud[i] = null;
				System.out.println("Deleted");
				break;
			}
			
		}
	}
        
        void updateCourceById(int id)
		{
         	for(int i=0 ; i<stud.length; i++)
		  {
			if(stud[i] != null && stud[i].getId() == id ){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Updated Cource name");
				String newCource = sc.nextLine();
				
				stud[i].setCourse(newCource);
				System.out.println("Course updated successfully");
				}
			}
		  }
		
		void updateContactByName(String name)
		{
		  for(int i=0 ; i<stud.length; i++)
		  {	
            if( stud[i] != null && stud[i].getName().equals(name) )
			{ 
		      Scanner sc = new Scanner(System.in);
				System.out.println("Enter Updated Contact name");
				String newContact = sc.nextLine();
				
				stud[i].setContact(newContact);
				System.out.println("Course updated successfully");
			}
		  }
		}
		
		void exit()
		{
			System.out.println("You are Exit successfully");
			System.exit(0);
		}
				
		void sortStudentById()
		{
			for(int i = 0 ; i<stud.length-1; i++)
			{
			  for(int j = 0 ; j< stud.length-1-i;j++){
				if (stud[j] != null && stud[j + 1] != null) {
                  if(stud[j].getId() > stud[j+1].getId())
				 {
                  Student temp = stud[j];
                  stud[j] = stud[j+1];
          		  stud[j+1] = temp;	
				 }
				}
			  }
			}
			 System.out.println("Students sorted by ID successfully");
		}			
		
		void sortStudentByMarks()
		{
			for(int i = 0 ; i<stud.length-1; i++)
			{
			  for(int j = 0 ; j< stud.length-1-i;j++){
				if (stud[j] != null && stud[j + 1] != null) {
                  if(stud[j].getMarks() < stud[j+1].getMarks())
				  {
                    Student temp = stud[j];
                    stud[j] = stud[j+1];
          		    stud[j+1] = temp;	
				  } 
				}
			  }
			}
			 System.out.println("Students sorted by Marks successfully!");
		}			
	
	void displayBetweenMarks()
	{
		for(int i=0 ; i<stud.length; i++)
		  {
			if(stud[i] != null && (50 < stud[i].getMarks() && stud[i].getMarks() >80))
			{
				System.out.println("Name: "+ stud[i].getName());
				System.out.println("Marks: "+ stud[i].getMarks());
				System.out.println();
			}
		  }
	}
		
}

public class StudApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] stud = new Student[4];

		College cl = new College(stud);

		do {

			System.out.println("===============================================");
			System.out.println("Menu List");
			System.out.println("Case 1: Add Student Details.");
			System.out.println("Case 2: Show All Student Details.");
			System.out.println("Case 3: Search Student Using: ID");
			System.out.println("Case 4: Search Student Using: Name");
			System.out.println("Case 5: Delete Student Using: Email");
			System.out.println("Case 6: Delete Student Using: marks < 40 (failed students)");
			System.out.println("Case 7: Update Student Using: ID → update course.");
			System.out.println("Case 8: Update Student Using: name → update contact.");
			System.out.println("Case 9: Sort student accending by Id");
			System.out.println("Case 10: Sort student Decending by Marks");
			System.out.println("case 11: Display students with marks between 50–80.");
			System.out.println("Case 0: Exit.");
			System.out.println("================================================");

			System.out.println("enter the choice");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			
			case 1:
				cl.addStudet();
				break;
				
			case 2:
				cl.getStudent();
				break;
				
			case 3:
				System.out.println("Enter the Search Id");
				int id = sc.nextInt();
				cl.searchStudentById(id);
				break;
				
			case 4:
			    System.out.println("Enter the Search Name");
				String name = sc.nextLine();
				cl.searchStudentByName(name);
				break;
			case 5:
			    System.out.println("Enter the Email");
				String email = sc.nextLine();
				cl.delateByEmail(email);
				break;

			case 6:
			     cl.deleteByMarks();
				break;

			case 7:
			     System.out.println("Enter the Search Id");
				 id = sc.nextInt();
				 cl.updateCourceById(id);
				break;
			case 8:
			    System.out.println("Enter the Search Name");
				name = sc.nextLine();
				cl.updateContactByName(name);
				break;
			case 9:
			    cl.sortStudentById();
				break;
			case 10:
			    cl.sortStudentByMarks();
				break;
			case 11:
			    cl.displayBetweenMarks();
			case 0:
			    cl.exit();
				break;
			default:
				System.out.println("Invalid Input");
			}

		} while (true);

	}
}
