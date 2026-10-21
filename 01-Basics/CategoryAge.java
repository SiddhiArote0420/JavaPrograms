/*Given age, print category:
Teen (13–19)
Adult (20–59)
Senior (60+)*/

import java.util.*;
public class CategoryAge
{
	public static void main(String x[])
	{
		Scanner ageCategory = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int age = ageCategory.nextInt();
		
		String distribute = (age >= 13 && age <= 19 )? " Teen" :
		                    (age >= 20 && age <= 59 )? " Adult" :
                            (age >=60) ? "Senior" : "It is small than Teen";
  
        System.out.println(distribute);
	}
}	
