// Write a java program to check whether number is neon or not.
//Input : 9
//Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.

import java.util.*;
public class chackNeonNo
{
   public static void main(String x[])
   {
	   Scanner neonChack = new Scanner(System.in);
	   int num,Squre,sum;
	   
	   System.out.println("Enter the number : ");
	   num = neonChack.nextInt();
	   
	   Squre = num*num;
	   int n1 = Squre % 10;
	   int n2 = Squre /10;
	   
	   System.out.println("Squre is : " + Squre);
	   
	   sum = n1+n2;
	   System.out.println(sum);
	   String neon = (sum == num)? "Number is Neon " : " Number is not Neon" ;
	   System.out.println(neon);
	   
	   
   }
}
