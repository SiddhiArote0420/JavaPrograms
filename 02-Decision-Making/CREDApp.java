/* To access CRED programs, one needs to have a credit score of 750750 or more.
Given that the present credit score is XX, determine if one can access CRED programs or not.
If it is possible to access CRED programs, output \text{YES}YES, otherwise output \text{NO}NO.
*/

import java.util.*;
public class CREDApp
{
  public static void main(String x[])
  {
	  Scanner ob = new Scanner(System.in);
	  
	  //System.out.println("Enter the crediti score need to entry :");
	  //int xx = ob.nextInt();
	  
	  System.out.println("Enter the present credit score :");
	  int yy = ob.nextInt();
	  
	  if(yy >= 750)
	  {
		  System.out.println("Yes");
	  }else{
		  System.out.println("No");
	  }
  }
}