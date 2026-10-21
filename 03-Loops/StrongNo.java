/* Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,

*/
import java.util.*;
public class StrongNo
{
	public static void main(String x[])
	{
		Scanner CheckStrong = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = CheckStrong.nextInt();
		
		int i,j=1,fact = 1,sum=0,temp=n,sum1=0;
		while(n!=0)	//145
		{    i=n%10;//5
	        j=1;
			fact=1;
	        while(j<=i)//t
        	{
			 fact = fact*j;//1
			 //sum = sum + fact;
			 j++;
			}
			System.out.println("fact="+fact);
			sum =sum+fact; 
			n=n/10;//14
		
		}
		
		n=temp;
		if (n == sum )
		{
			System.out.println("Number is a Strong Number");
		}else{
			System.out.println("Number is a Not Strong Number");
		}
	}
}
			


