//Write a java program to find the maximum between two numbers.




import java.util.*;
public class MaximunNo
{
	public static void main(String x[])
	{
		Scanner max_no = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int n1 = max_no.nextInt();
		
		System.out.println("Enter second number : ");
		int n2 = max_no.nextInt();

	   
	    String max = (n1 > n2 )? n1+" Is a Maximun" :
		             n2+" is a maximum" ;
					 
        System.out.println(max);
	}
}
		