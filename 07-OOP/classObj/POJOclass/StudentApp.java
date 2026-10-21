/*Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.
*/

import java.util.*;
class Student{
    private int rollNo;
	private String name;
	private int[] marks = new int[3];
	
	
	void setRollNo(int rollNo){
      this.rollNo = rollNo;
	}
	int getRollNo(){
	 return rollNo;
	}
	
	void setName(String name){
      this.name = name;
	}
	String getName(){
	 return name;
	}
	
	void setMarks(int[] marks){
      this.marks = marks;
	}
	int[] marks(){
	 return marks;
	}
	
	
	
	public int findTotalMarks(){
		
			int sum = 0;
			for(int m : marks)
			{
				 sum += m;
			}
			return sum;
	}
	
	
	public double highestAvg(){
		return findTotalMarks()/3.0;
	}

    public boolean isFailed(){
     for(int m : marks)
	 {
        if(m < 40 )
		{
            return true;
		}	
	 }		
	return false;
   }
}   

public class StudentApp{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Student stud[] = new Student[5];
		
		for(int i=0; i<stud.length; i++)
		{
			stud[i] = new Student();
			System.out.println("enter the roll No of " +(i+1)+" st Student: ");
			stud[i].setRollNo(sc.nextInt());
			sc.nextLine();
			
			System.out.println("enter the Name: ");
			stud[i].setName(sc.nextLine());
			
           System.out.println("enter the Marks of " +(i+1)+" st Student: ");
		   int marks[] = new int[3];
		   for(int j =0; j<marks.length; j++)
		   {
			  marks[j] = sc.nextInt();
		   }
		   stud[i].setMarks(marks);
		}
		
		// total marks
		System.out.println("Toatl marks of student");
		for(Student s : stud)
		{
			System.out.println( s.getName() +" ===> "+ s.findTotalMarks());
		}
		
		// Highest average
		
		Student avg = stud[0];
		for(Student s : stud)
		{
			if( avg.highestAvg() < s.highestAvg())
			{
				avg = s;
			}
		}
		System.out.println("Highest Avarge Student: "+avg.getName()+", avg is: "+ avg.highestAvg());
		
		//faild stud
		System.out.println("The Failed Student: ");
		for(Student s : stud)
		{
			if(s.isFailed())
			{
				System.out.println( s.getName());
			}
		}
	}
}
		
		