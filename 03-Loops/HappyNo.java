/*Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number 
is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it
 with digits square sum, we reach 1.
*/

import java.util.*;
public class HappyNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = ob.nextInt();
		
		int sum=0,rem;
		
	
		while(num!=1 && num!=4)
		{
			sum=0;
			
			while(num!=0)
			{
			rem = num%10;
			sum+=rem*rem;
			num = num/10;
			}
			num=sum;
		}
		if(sum==1)
	   {
	    	System.out.println("It is Happy Number");
	   }else{
		    System.out.println("It is a Not Happy Number");
	    }
	  
	}
}
			