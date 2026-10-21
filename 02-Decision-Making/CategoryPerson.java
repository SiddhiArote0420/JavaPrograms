/*Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
        	
*/

import java.util.*;
public class CategoryPerson
{
	public static void main(String x[])
	{
		Scanner ageCategory = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int age = ageCategory.nextInt();
		 
		 if(age > 0 && age < 13) 
		 {
		    System.out.println(" child");
		 }else if(age >= 13 && age <= 19 )
		 {
		    System.out.println(" Teen");
		 }else if(age >= 20 && age <= 59 )
		 {
		    System.out.println(" Adult") ;
		 }else 
		 {  
		    System.out.println("Senior"); 
		 }
  
	}
}	
