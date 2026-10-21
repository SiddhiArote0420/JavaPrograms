//. Write a java program to find a minimum between three numbers.



import java.util.*;
public class MinimunNo
{
	public static void main(String x[])
	{
		Scanner min_no = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int n1 = min_no.nextInt();
		
		System.out.println("Enter second number : ");
		int n2 = min_no.nextInt();
		
		System.out.println("Enter third number : ");
		int n3 = min_no.nextInt();
	   
	    String max = (n1 < n2 && n1 < n3)? n1+" Is a minimum" :
		             (n2 < n1 && n2 < n3)? n2+" is a minimum" : n3+ " is a minimum";
					 
        System.out.println(max);
	}
}
		