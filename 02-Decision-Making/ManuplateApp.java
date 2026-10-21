/* Ezio can manipulate at most XX number of guards with the apple of Eden.
Given that there are a YY number of guards, predict if he can safely manipulate all of them.
*/

import java.util.*;
public class ManuplateApp
{
  public static void main(String x[])
  {
	  Scanner ob = new Scanner(System.in);
	  
	  System.out.println("Enter the number of Guards :");
	  int xx = ob.nextInt();
	  
	  System.out.println("Enter the number of capacity :");
	  int yy = ob.nextInt();
	  
	  if(xx <= yy)
	  {
		  System.out.println("he predict can safely manipulate all of them");
	  }else
	  {
		  System.out.println(" he Not predict can safely manipulate all of them");
	  }
  }
}
	  