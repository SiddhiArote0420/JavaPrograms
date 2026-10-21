/*
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1

*/

		
		

import java.util.*;
public class Pattern_60
{
	public static void main(String x[]){
	     int num =2,a=0; boolean flag = true;
		for(int i=1; i<=5; i++)
		{ 
	      for(int j=1; j<=9;j++)
		  {
			if(j>=6-i && j<=4+i && flag)
			{   
		        if(j==6-i || j==4+1){
				   System.out.print("1");
			    }else{
				   if(j<=5){
                      System.out.print(num);
                      num++;				
				      flag = false;
				         if(j==5)
					     num = a;
				   }else{
					   System.out.print(a);
					   a--;
				       flag = false;
				   }
			}
			}else{
				System.out.print(" ");
				flag = true;
		  }
		}System.out.println();
	}
}
}