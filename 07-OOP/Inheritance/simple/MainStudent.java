/*Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.
*/
import java.util.*;
class Student{
    String name;
	int marks ;
	
	Student(String name , int marks)
	{
	  this.name = name;
	  this.marks = marks;
	}
	
	void checkResult()
	{
	  System.out.println("result not defined for base class");
	}
	
}
class EngineeringStudent extends Student{
      EngineeringStudent(String name,int marks)
	  {
	      super(name,marks);
	  }
	  
	  void checkResult(){
	     if(marks >= 50)
		 {
		    System.out.println(name+" is pass");
		 }else{
		   System.out.println(name+" is fail");
		  }
	}
}

class MedicalStudent extends Student{
       MedicalStudent(String name,int marks)
	  {
	      super(name,marks);
	  }
	  
	  void checkResult(){
	     if(marks >= 50)
		 {
		    System.out.println(name+" is pass");
		 }else{
		   System.out.println(name+" is fail");
		  }
	}
}
public class MainStudent{
 public static void main(String[] x)
 {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the name of Engineering Student");
   String name1 = sc.nextLine();
   System.out.println("Enter the marks of Engineering Student");
   int mark1 = sc.nextInt();
   
   
   System.out.println("Enter the name of Medical Student");
   sc.nextLine();
   String name2 = sc.nextLine();
   
   System.out.println("Enter the marks of Medical Student");
   int mark2 = sc.nextInt();
   
   EngineeringStudent e = new EngineeringStudent(name1,mark1);
   e.checkResult();
   
   MedicalStudent m = new MedicalStudent(name2 , mark2);
   m.checkResult();
   
   }
 }
   
   