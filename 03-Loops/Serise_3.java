/* Write a java program to display following series :
           	1  4  9  16  25  36  49  64  81  100
*/

import java.util.*;
public class Serise_3
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the Limit");
	  int limit = sc.nextInt();
	  
	  for(int num =1; num<=limit; num++)
	  {
		  int a = num*num;
		  System.out.printf("\t"+a);
	  }
  }
}