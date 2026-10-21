/*

*/

import java.util.*;
public class Pattern2{
public static void main(String[] args){
	
	for(int i=1 ; i<=9; i++)
	{
		for(int j=1; j<=9; j++)
		{
		  if((i<=5 && (6-i>=j || 4+i <= j))||(i>5 && (i-4 >=j || 14-i <=j)))
		  {
		    System.out.print("*");
		  }else{
		  System.out.print(" ");
		  }
		}System.out.println();
	}
	}
}