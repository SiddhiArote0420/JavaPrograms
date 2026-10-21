/*
    *
   ***
  * * *
 *  *  *
*********
 *  *  *
  * * *
   ***
    *
	
	*/


import java.util.*;
public class Diamond
{
public static void main(String[] args){
	
	for(int i=1 ; i<=9; i++)
	{
		for(int j=1; j<=9; j++)
		{
			if(j==5 || i==5  ||(i<=5 && 6-i == j || 4+i==j)||(i>5 && i-4==j || 14-i==j))
			{
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}System.out.println();
	}
}
}