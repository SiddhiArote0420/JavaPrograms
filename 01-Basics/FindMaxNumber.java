// Write a java program to find a maximum between three numbers.

import java.util.*;
public class FindMaxNumber
{
 public static void main(String x[])
 {
   Scanner findMax = new Scanner(System.in);
   
   System.out.println("Enter 3 Numbers :");
   int num1 = findMax.nextInt();
   int num2 = findMax.nextInt();
   int num3 = findMax.nextInt();
   
   if(num1 > num2 && num1 > num3)
   {
    System.out.println("Maximun Number is : "+num1);
   }else if( num2 > num1 && num2 >num3)
   {
    System.out.println("Maximum number is :"+num2);
   }else
   {
   System.out.println("Maximum Number is : " +num3);
   }
   
  }
 }