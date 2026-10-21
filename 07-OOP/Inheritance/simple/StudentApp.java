/* Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.
Explanation:
 This tests inheritance for common fields and customized result display logic.
*/

import java.util.*;
class Student{
   String name;
   int[] marks;
   Student(String name, int[] marks)
   {
	   this.name = name;
	   this.marks = marks;
   }
   
   void isStudPass()
   {
	   System.out.println("it is not for base case");
   }

}
class EngineeringStudent extends Student{
   EngineeringStudent(String name, int[] marks)
   {
	   super(name, marks);
   }
   
   void isStudPass(){
	   boolean isPass = false;
	   for(int i=0; i<marks.length; i++)
	   {
		   if(marks[i] < 50){
			   isPass = true;
		       break;
		   }
	   }
	   
	   if(!isPass)
	   {
		    System.out.println("Engineering Student " + name + " is Pass");
	   }else{
            System.out.println("Engineering Student " + name + " is Fail");
	   }
   }
}

class MedicalStudent extends Student{
     MedicalStudent(String name, int[] marks)
   {
	   super(name, marks);
   }
     void isStudPass(){
	   boolean isPass = false;
	   for(int i=0; i< marks.length; i++)
	   {
		   if(marks[i] < 50){
			   isPass = true;
		       break;
		   }
	   }
	   
	   if(!isPass)
	   {
		    System.out.println("Engineering Student " + name + " is Pass");
	   }else{
            System.out.println("Engineering Student " + name + " is Fail");
	   }
   }
}

public class StudentApp{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Engineering Student detail
		System.out.println("Enter name of Engineering Student");
		String nameE = sc.nextLine();
		
		int marksE[] = new int[3];
		System.out.println("Enter Marks of 3 sub (Engineering student)");
		for(int i=0; i<marksE.length; i++)
		{
		    marksE[i] = sc.nextInt();
		    
		}
		sc.nextLine();
		
		// Medical Student
		System.out.println("Enter name of Medical Student");
		String nameM = sc.nextLine();
		
		int marksM[] = new int[3];
		System.out.println("Enter Marks of 3 sub (medical student)");
		for(int i=0; i<marksM.length; i++)
		{
		    marksM[i] = sc.nextInt();
		    
		}
		
		EngineeringStudent eng = new EngineeringStudent(nameE, marksE);
		eng.isStudPass();
		
		MedicalStudent m = new MedicalStudent(nameM, marksM);
		m.isStudPass();
	}
}