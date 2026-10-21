// Write a java program to find all prime factors of a number.
/*Prime factors of a number are the prime numbers that multiply together to give the original number.
Number = 12
Step-by-step prime factorization:

12 ÷ 2 = 6
6 ÷ 2 = 3
3 ÷ 3 = 1

Prime factors = 2, 2, 3*/


import java.util.*;
public class PrimeFactors
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
         
        System.out.println("Enter the Number :");
        int num = ob.nextInt();//12

        int i = 2;
		 boolean flag = true;
        while(num >= i)//12>=2
		{
		   System.out.println(num+" divisible "+ i);
		   
            num = num /i;//12/2=6
			int j=i;
			while(num>=j)//6>=2    3>=3
			{
				System.out.println(num+" divisible "+ j); //2 3 
								num=num/j;//6/2=3   3/3=1 

				j++;//3
			}
            if(num == 1)
			{
               flag = true;
               break;
            }
		 i++;//3
		}
	}
}	