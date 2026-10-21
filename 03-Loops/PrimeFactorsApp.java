// Write a java program to find all prime factors of a number.
/*Prime factors of a number are the prime numbers that multiply together to give the original number.
Number = 12
Step-by-step prime factorization:

12 ÷ 2 = 6
6 ÷ 2 = 3
3 ÷ 3 = 1

Prime factors = 2, 2, 3*/


import java.util.*;
public class PrimeFactorsApp
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
         
        System.out.println("Enter the Number :");
        int num = ob.nextInt();//24

        int i = 2;
	
        while(i<=num) // 2<=24
		{     
	        
			while(num%i==0)// 24%2==0
			{
			 System.out.println(num+" divisible "+ i);
            num = num / i;// 12 , 6 , 3
			i = 2;
			}
			 
			i++;
		}
		
			 		
	}
}		
			
			
			
			
			
			
			
			
			
			
		   
	