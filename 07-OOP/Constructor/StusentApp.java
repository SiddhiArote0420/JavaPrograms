/*Q1. Create a Student class with fields: name, marks.
 Use a parameterized constructor to initialize both fields.
 Write a method checkResult() that prints "Pass" if marks ≥ 35, otherwise "Fail".
 Create 3 student objects and print their results.
Concepts Used:
 ✔ Parameterized constructor
 ✔ If–else logic
Explanation:
The constructor sets the student’s name and marks.
Then you apply simple logical condition (≥ 35).*/

class Student{
  private String name;
  private int marks;
  
  Student(String name, int marks)
  {
	  this.name = name;
	  this.marks = marks;
  }
  
  public void checkResult() {
	  if(marks >= 35)
	  {
		  System.out.println(name+ " of is pass");
	  }else{
		  System.out.println(name+" is fail");
	  }
  }

}
public class StusentApp{
     public static void main(String x[])
	 {
		 Student stud1 = new Student("sakshi" ,56);
		 stud1.checkResult();
		 
		 Student stud2 = new Student("siddhi",34);
		 stud2.checkResult();
		 
		 Student stud3 = new Student("parth",35);
		 stud3.checkResult();
		 
	 }
		 

}
