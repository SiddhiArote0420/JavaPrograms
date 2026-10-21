//swap to numbers without using third veriable and using binary opration.

import java.util.*;
public class swapUsingBinaryO
{
  public static void main(String x[])
  {
	  Scanner swapNo = new Scanner(System.in);
	  
	  System.out.println("Enter First Number :");
	  int a = swapNo.nextInt();
	  
	  System.out.println("Enter second Number :");
	  int b = swapNo.nextInt();
	  
	  a = a^b;
	  b = a^b;
	  a = a^b;
	  
	  System.out.printf("a=%d\n b=%d\n",a,b);
  }
}