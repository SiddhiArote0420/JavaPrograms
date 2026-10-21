/*
Check Palindrome Using Two Pointers
Check if a string is a palindrome using the two-pointer approach.
*/

import java.util.*;
public class String_is_palindrome_OrNot
{
   public static void main(String x[])
   {
	   Scanner sc = new Scanner(System.in);
	   
	   String [] arr = new String[5];
	   
	   System.out.println("Enter the values in array");
	   for(int i = 0; i < arr.length ; i++)
	   {
		   arr[i] = sc.next();
	   }
	   
	   boolean flag = false;
	   for(int i=0 , k=arr.length-1 ; i < k  ; i++ , k--)//(i < arr.length/2 && k > arr.length/2 )
	   {
		   if(arr[i].equals(arr[k]))
		   {
			   flag = true;
		   }else{
			   flag = false;
			   break;
		   }
	   }
	   if(flag)
	   {
		   System.out.println("It is a Palindrom");
	   }else{
		   System.out.println("It is not Palindrom");
	   }
   }
}