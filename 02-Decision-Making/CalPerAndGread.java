/* Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F	
*/

import java.util.*;
public class CalPerAndGread
{
	public static void main(String x[])
	{
		Scanner calper_gread = new Scanner(System.in);
		
		System.out.println("Enter the 5 Subject marks :");
		int phy = calper_gread.nextInt();
		int chem = calper_gread.nextInt();
		int bio = calper_gread.nextInt();
		int math = calper_gread.nextInt();
		int com = calper_gread.nextInt();
		
		int total = phy+chem+bio+math+com;
		float percentage = (total*100.0f)/500;
		System.out.println("Persentage is : "+percentage);
		
		if(percentage >= 90 && percentage <= 100)
		{
			System.out.println("Grade 'A'");
		}else if(percentage >= 80 && percentage < 90)
		{
			System.out.println("Grade 'B'");
		}else if(percentage >= 70 && percentage < 80)
		{
			System.out.println("grade 'C'");
		}else if(percentage >= 60 && percentage < 70)
		{
			System.out.println("Grade 'D'");
		}else if ( percentage >= 40 && percentage < 60)
		{
			System.out.println("Grade 'E'");
		}else 
		{
			System.out.println(" Grade 'F'");
		}
		
	}
}