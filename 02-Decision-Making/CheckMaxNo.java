//Write a java program to find the maximum between two numbers.

import java.util.*;
public class CheckMaxNo
{
 public static void main(String x[])
 {
   Scanner maxNo = new Scanner(System.in);
   
   System.out.println("Enter The Three Numbers :");
   int n1 = maxNo.nextInt();
   int n2 = maxNo.nextInt();
   int n3 = maxNo.nextInt();
   
   if (n1>n2 && n1>n3)
   {
     System.out.println("Maximum Number is : "+n1);
   }else if (n2>n1 && n2>n3)
   {
     System.out.println("Maximum Number is : "+n2);
   }else
   {
     System.out.println("Maximum Number is : "+n3);
   }
   
  }
 }