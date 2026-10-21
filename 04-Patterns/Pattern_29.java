/*
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *
*/





import java.util.*;
public class Pattern_29
{
   public static void main(String x[])
   {
	   
	   int j,i;
	   for(i=1;i<=10;i++)
	   {  
	     for(j=1; j<=9;j++)
	     {
			 if(i<=5 && j==6-i || j==4+i )
			 {
				 System.out.print("*");
			 }else if(i>5 && j==i-5 || j==15-i )
			 {
				 System.out.print("*");
			 }else{
				 System.out.print(" ");
			 }
		 }System.out.println();
	   }
   }
}