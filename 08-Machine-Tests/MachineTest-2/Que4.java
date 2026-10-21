/*. Write a java program to print this pattern. 
 
      * 
    * * * 
   *  *  * 
  *   *   * 
* * * * * * * * * 
  *   *   * 
   *  *  * 
    * * * 
     *
	 */
	
import java.util.*;
public class Que4
{
	public static void main(String  x[])
	{
		int num = 3;
		for(int i = 1 ; i<=9;i++)
		{
			for(int j=1; j<=9 ; j++)
			{	
		       if(i == 5 || j==5 || (i<=5 && j== 6-i || j== 4+i)||(i>5 && j==14-i || j==i-5+1))
			   {
				   System.out.print("*");
			   }else{
				   System.out.print(" ");
			   }
			}
			System.out.println();
		}
	}
}