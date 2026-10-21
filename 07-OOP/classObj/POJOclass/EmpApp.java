package org.techhub;

import java.util.*;

/*
Student Management System
Create a POJO class Student with fields: id, name, email, contact, c.ourse, marks
Create a College class, pass multiple Student objects using var-args.
Implement operations in the main class:


1.Add Student Details.
2.Show All Student Details.
3.Search Student Using:
id
name

4.Delete Student Using:
email
marks < 40 (failed students).


5.Update Student Using:
id → update course.
name → update contact.


6.Sort Students:
By id ascending.
By marks descending.
7.Display the topper (highest marks).
8.Display students with marks between 50–80.
9.Exit.
*/

class Student {
	private int id;
	private String name;
	private String email;
	private String contact;
	private String course;
	private int marks;

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}

class College {
	Student[] stud;

	College(Student... stud) {
		this.stud = stud;
	}
}

public class EmpApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] stud = new Student[5];

		College cl = new College(stud);
		
		do {
			
		}while(true);

	}
}
