/* Create a Student class with 3 subject marks:
 m1, m2, m3 (initialize via constructor)
Write a method:
calculateResult()
Total = m1 + m2 + m3
Percentage = total / 3
If any subject < 35 → print “Fail”
Else print Percentage and Grade:


≥ 75 → Distinction
≥ 60 → First Class
≥ 50 → Second Class
Else → Pass


Explanation:
 This requires combined logic:
OR logic for fail
Else-if ladder for grading
Arithmetic + constructor initialization
*/

import java.util.*;
class Student{
   private int m1, m2,m3;
   
     Student(int m1, int m2, int m3)
	 {
		 this.m1 = m1;
		 this.m2 = m2;
		 this.m3 = m3;
	 }
	 
	 void calculateResult(){
		 int total = m1+m2+m3;
		 float per = total/3;
		 
		 if(m1 < 35 || m2 < 35 || m3 < 35)
		 {
			 System.out.println("Fail");
		 }else if( per >= 75)
		 {
			 System.out.println("Distinction");
		 }else if( per < 75 && per >= 60)
		 {
			 System.out.println("First Class");
		 }else if( per < 60 && per >= 50)
		 {
			 System.out.println("Second Class");
		 }else{
			 System.out.println("Pass");
		 }
	 }

}

public class StudentMarks{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the marks of 3 student");
		 int m1 = sc.nextInt();
		 int m2 = sc.nextInt();
		 int m3 = sc.nextInt();

          Student stud = new Student(m1,m2,m3);
          stud.calculateResult();

    }
}