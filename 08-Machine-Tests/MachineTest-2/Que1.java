/*Q1. Task: For a number n, calculate: 
   Sum of digits at even places (from right) 
   Sum of digits at odd places (from right) 
   Finally print the difference of these sums. 
   Example: n = 572631 → even places sum = 7+6+1 = 14,  
odd places sum = 5+2+3 = 10 → difference = 4.*/


import java.util.*;
public class Que1
{
	public static void main(String  x[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		
		int rev = 0;
		while(n!=0)
		{
			int a = n%10;
			rev = rev*10+a;
			n = n/10;
		}
		System.out.println("Rev : "+ rev);
			
		int sumEven=0, sumOdd=0;
		boolean flag = false;
		while(rev != 0)
		{
			int a = rev %10;
			rev /=10;
			if(flag)
			{
				sumEven += a ;
				flag = false;
				
			}else{
				sumOdd += a;
				flag = true;
			}
			
		}
	
			
		System.out.println("even places sum : "+ sumEven);
		System.out.println("Odd places sum : "+ sumOdd);
		
		
		if(sumEven < sumOdd)
		{
			int dif = sumOdd-sumEven;
			System.out.println("Diffrance : "+dif); 
		}else 
		{  int dif = sumEven-sumOdd;
	     System.out.println("Diffrance : "+dif); 
		}
		
	}
}

		