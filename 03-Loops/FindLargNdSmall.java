/* Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.
*/

import java.util.*;
public class FindLargNdSmall
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int num = ob.nextInt();
		
		int max = 0;// max is greater then 0
		int min = 9;// min is less than 9
		int rem;
		while(num!=0)// compaire
		{
		  rem = num%10; 
          num = num/10;

          if(rem > max)// check max
		  {
             max = rem;
		  }	
          if(rem < min)
		  {
            min = rem;
		  }	
        }
        System.out.println("Max Number :"+max);	
        System.out.println("Min Number :"+min);		
		
	}
}


		/*while(num!=0)
		{////3475
	    
		 int a = num%10;//5
		 num = num/10;//347
		int tempa= a;
		int temp = num;
		while(num!=0)//347
		{
			
			int b = num%10;//7
			num = num/10;//34
			
			if(a > b) //5>7
			{
			   a= a;	
			}else
			{
				a=b;
			}
		}
		System.out.println("Largest : "+a);
		
		num = temp;
		 a= tempa;
		while(num!=0)
		{
			int b = num%10;
			num = num/10;
			
			if(a < b) 
			{
			   a= a;	
			}else
			{
				a=b;
			}
		}
		System.out.println("Smallest : "+a);
		}*/