 /*Write a java program to print 1 to nth Strong number. 

*/
import java.util.*;
public class Que2_1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");// how many digit you want print
		int limit = sc.nextInt();
		
		int count =0, n=1;
	while(count < limit){
		int sum=0,temp=n;
		while(n!=0)// get last digit 	
		{   int i=n%10;
	        int j=1;
			int fact=1;
	        while(j<=i)// cal factorital
        	{
			 fact = fact*j;
			 //sum = sum + fact;
			 j++;
			}
			
			sum =sum+fact; 
			n=n/10;
		
		}
		
		n=temp;
		if (n == sum )
		{
			System.out.println(n +" ");
			count++;
		}
		n++;
	}
}
}
			


