/*Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
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
   private int marks[] = new int[3];

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
   int[] getMarks(){
	   return marks;
   }
   
   int getTotalMark()
   {
	   int sum = 0;
	   for(int i : marks)
	   {
		  sum = sum + i;
	   }
      return sum;
   }

    int getHighAvgMark()
	{
        return (getTotalMark() / marks.length);
	}
	
	boolean hasFail()
	{
		for(int i : marks)
		{
			if(i < 35)
			{
				return true;
			}
		}
	  return false;
	}
	

}
class StudentDispalyInfo{
	Student stud[];
	Scanner sc = new Scanner(System.in);
	
	StudentDispalyInfo(Student... stud)
	{
		this.stud = stud;
	}

    void calTotalMarks(){
		for(int i =0; i < stud.length; i++)
		{
			System.out.println(stud[i].getName()+" = "+ stud[i].getTotalMark());
		}
	}
	
	void calHighestAvg(){
		int highAvg = 0;
		Student topper = null;

		for(Student i : stud)
		{
		   if(i.getHighAvgMark() > highAvg)
		   {
             highAvg = 	i.getHighAvgMark();
			 topper =i;
		   }
        }
		
    
		System.out.println("\nStudent with Highest Average Marks:");
        
        System.out.println(topper.getName()+" has highest avg marks. marks is = "+ highAvg);
	}

    void failStudent(){
		System.out.println("Student who fail");
		boolean anyFail = false;
       for(Student i : stud)
	   {
         if(i.hasFail())
		 {
            System.out.println(i.getName());
			anyFail = true;
		 }
	   }
	   if(!anyFail)
	   {
		   System.out.println("Not any student fail");
	   }
	}
	void exit()
		{
			System.out.println("You are Exit successfully");
			System.exit(0);
		}
		 
	
}
public class StudInfo{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in); 
		
	    Student[] stud = new Student[2];
        StudentDispalyInfo info = new StudentDispalyInfo(stud);	
  
        for (int i = 0; i < stud.length; i++) {
            stud[i] = new Student();

            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Roll No: ");
            stud[i].setRollNo(sc.nextInt());
            System.out.print("Name: ");
            stud[i].setName(sc.next());

            int[] marks = new int[3];
            System.out.print("Enter marks for 3 subjects: ");
            for (int j = 0; j < 3; j++)
                marks[j] = sc.nextInt();

            stud[i].setMarks(marks);
        }

		do{
		System.out.println("..............MENU..............");
		System.out.println("1. Calculate total marks of each student");
		System.out.println("2. Find the student with the highest average marks");
		System.out.println("3.Display the list of students who have failed in any subject (marks < 35).");
		System.out.println("0. exit ");
		
        System.out.println("Enter the number");
		int choice = sc.nextInt();
		
		
        switch (choice){
            case 1 :
                info.calTotalMarks();
                break;

            case 2:
                info.calHighestAvg();
                break;

            case 3:
                info.failStudent();
                break;

            case 0:
                info.exit();
				break;
			default:
				System.out.println("Invalid Input");
			}

		} while (true);			
    }
}