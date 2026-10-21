// Print the middle value among 3 distinct integers.

import java.util.*;
public class FindMiddle
{
	public static void main(String x[])
	{
		Scanner midFind = new Scanner(System.in);
		
		System.out.println("Enter first digit:");
		int n1 = midFind.nextInt();
		
		System.out.println("Enter first digit:");
		int n2 = midFind.nextInt();
		
		System.out.println("Enter first digit:");
		int n3 = midFind.nextInt();
		
		String middle = ((n1 > n2 && n1 < n3) || (n1 < n2 && n1 > n3))? n1+" is a Middle" :
		                ((n2 > n1 && n2 < n3) || (n2 < n1 && n2 > n3))? n2+" is a Middle" : n3+" is a Middle";
		System.out.println(middle);
	}
}
	
		