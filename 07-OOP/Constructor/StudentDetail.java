/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once*/
 
 import java.util.*;
 class Student{
    private int rollNo;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private int total;
	
	public Student(int rollNo, String name, int m1,int m2, int m3)
	{
	   this.rollNo = rollNo;
	   this.name = name;
	   this.m1 = m1;
	   this.m2 = m2;
	   this.m3 = m3;
	   this.total = m1+m2+m3;
	}
	
	public void desplayDetail()
	{
	  System.out.println("Roll No.: "+rollNo);
	  System.out.println("Name: "+name);
	  System.out.println("Marks Sub1: "+m1);
	  System.out.println("Marks Sub2: "+m2);
	  System.out.println("Marks Sub3: "+m3);
	  System.out.println("...................");
	  System.out.println("Total Marks: "+total);
	}
 }
	
public class StudentDetail{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		int id = sc.nextInt();
		
		System.out.println("Enter Student Name");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Enter the 1st subject mark");
		int m1 = sc.nextInt();
		
		System.out.println("Enter the 2st subject mark");
		int m2 = sc.nextInt();
		
		System.out.println("Enter the 3st subject mark");
		int m3 = sc.nextInt();
		
		Student stud = new Student(id,name,m1,m2,m3);
		stud.desplayDetail();
 }
}