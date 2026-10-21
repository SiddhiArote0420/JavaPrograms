/*WAP to create POJO class name as Student with field name, id and per and we have class
name as Dept with two methods
void setStudent(Student student): this method is used for accept student as parameter
void showStudent(): this method is used for show the student details.
*/

import java.util.*;
class Student{
    private int id;
    private String name;
	private int per;

    void setId(int id)
	{
	   this.id = id;
	}
	int getId()
	{
	  return id;
	}
	
	void setName(String name)
	{
	   this.name = name;
	}
	String getName()
	{
	  return name;
	}
	
	void setPer(int per)
	{
	   this.per = per;
	}
	int getPer()
	{
	  return per;
	}
	
}
class Dept{
    Student student;
    void setStudent(Student student){
      this.student = student;
    }

    void showStudent(){
		System.out.println("Student Id: "+student.getId());
		System.out.println("Student Name: "+student.getName());
		System.out.println("Student Price: "+ student.getPer());
      
    }
}
public class StudentDetail{
  public static void main(String [] x)
  {
     Scanner sc = new Scanner(System.in);
	 
       System.out.println("Enter the id: ");
       int id = sc.nextInt();
       sc.nextLine();
	   
	   System.out.println("Enter the name: ");
       String name = sc.nextLine();
	   
	   System.out.println("Enter the Percentage: ");
       int per = sc.nextInt();
	 
	 Student s = new Student();
	 s.setId(id);
	 s.setName(name);
	 s.setPer(per);
	 
	 Dept d = new Dept();
	 d.setStudent(s);
	 d.showStudent();
	 
  }
}
	 
	 
	   