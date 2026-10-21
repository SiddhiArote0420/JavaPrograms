//. Write a java program to find the minimum between two numbers.



import java.util.*;
public class FindMinNumber
{
 public static void main(String x[])
 {
   Scanner findMin = new Scanner(System.in);
   
   System.out.println("Enter two Numbers :");
   int num1 = findMin.nextInt();
   int num2 = findMin.nextInt();
   
   if(num1 < num2)
   {
    System.out.println("Minimun Number is : "+num1);
   }else 
   {
    System.out.println("Minimum number is :"+num2);
   }
   
  }
 }