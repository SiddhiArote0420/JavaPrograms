/*Q1. Problem:
Exam class with marks of 5 subjects.
 Rules:
Pass only if each subject ≥ 40
Division based on percentage:
≥ 75 → Distinction
≥ 60 → First
≥ 45 → Second
Else → Pass


Functions:
isPass()
calculatePercentage()
getDivision()
*/

import java.util.*;
class ResultCal{

      boolean isPass(int[] arr){
		for(int i=0; i<arr.length; i++){
	      if(arr[i] < 40)
		  {
			return false;
		  }
		}
		return true;
		
	  }
	  
	  double calculatePercentage(int[] arr){
	    int sum = 0; 
		for(int i=0 ; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
			
		return sum/arr.length;
	  }
	  
	  void getDivision(double per, boolean pass){
		  if (!pass) {
            System.out.println("Fail");
            return;
          }
		
	    if(per >= 75)
		{
		  System.out.println("Distinction");
		}else if(per >=	60){
      	  System.out.println("First");
		}else if(per >= 45 ){
          System.out.println("Second");
        }else{	
          System.out.println("Pass");
		}		  
	  }
}


public class DisplyResult{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the five subject Marks");
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		ResultCal r = new ResultCal();
		
		boolean pass = r.isPass(arr);
		if(pass)
		{
			System.out.println("Student is pass");
		}else{
			System.out.println("Student is Fail");
		}
		
		double per = r.calculatePercentage(arr);
		System.out.println("Student parrcentage is: "+ per);
		
		System.out.println("Division: ");
		r.getDivision(per, pass);
	}
}
		
