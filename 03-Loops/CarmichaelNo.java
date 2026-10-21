/*Write a Java program to display all Carmichael Numbers up to n.
 A Carmichael number is a composite number n which satisfies Fermat’s little theorem for
 every integer that is relatively prime to n. (Tip: For practice, find numbers like 561, 1105, 1729 up to n.)
*/

import java.util.*;
public class CarmichaelNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int limit = ob.nextInt();
		
		for(int i=2; i<=limit; i++)// number 
		{
			for(int j=2; j<=i/2;j++)// check i is prime
			{
			  if(i%j!=0)//check
			  {
				  for(int a=2; a > i; a++)
				  {
				    if(a/i !=0 )
				   {
					   int result = (int)(Math.pow(a, i-1));
					   int finalRes = result%1;
					   if(finalRes == 1)
						   System.out.println(finalRes);
					  
				   }
				  
			     }
			  }
		   }
		}
	}
}
				
				
			
