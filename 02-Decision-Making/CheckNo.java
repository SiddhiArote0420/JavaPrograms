/*Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.
*/

import java.util.*;
public class CheckNo
{
	public static void main(String x[])
	{
		Scanner noCheck = new Scanner(System.in);
		
		System.out.println("Enter the Numbers");
		int n1 = noCheck.nextInt();
		int n2 = noCheck.nextInt();
		
		if(n1 > n2 )
		{
			 System.out.println("First number is greater than second number.");
		}else if(n1 < n2){
			 System.out.println("First number is smaller than second number.");
		}else{
			 System.out.println("Both number are Equal");
		}
		
	}
}