//reverse 3 numbers

import java.util.*;
public class Revers_no
{
	public static void main(String x[])
	{
		Scanner reverseNo = new Scanner(System.in);
		
		System.out.println("Enter the Number :");//345
        int num = reverseNo.nextInt();

        //int sum=0, prod =1, rem;

        /*rem = num%10;  // 5
        sum = sum+rem; // 0+5=5
		prod = prod*rem; //1*5=5
        num = num/10;  //345/10 = 34
   
        rem = num%10;  // 34%10=4
        sum = sum+rem; // 5+4=9
		prod = prod*rem; //5*4=20
        num = num/10;   //3
		*/
		
		int rev = (num%10)*100+((num/10)%10)*10+(num/100);
		
		System.out.println(rev);
		 
	}
}
		
        		