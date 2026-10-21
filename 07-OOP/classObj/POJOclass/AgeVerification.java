/*Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.*/
 
 
 import java.util.*;
 class Person{
    private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge(){
		return age;
	}
 }
 
 public class AgeVerification{
	 public static void main(String [] x)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Age: ");
		 int age = sc.nextInt();
		 
		 Person per = new Person();
		 per.setAge(age);
		 
		 if(per.getAge() >= 18)
		 {
			 System.out.println("the person is eligible to vote");
		 }else{
			 System.out.println("the person is not eligible to vote");
		 }
		 
	 }
 }
		 