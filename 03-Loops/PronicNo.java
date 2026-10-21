/*Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
*/

import java.util.*;
public class PronicNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit = ob.nextInt();
		
		for(int num = 1; num <= limit; num++)
		{
			int a = num*(num+1);
			System.out.println(a);
		}
	}
}
		
		