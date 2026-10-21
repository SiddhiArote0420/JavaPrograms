//Write a java program to search element in array , its element found or not.

import java.util.*;
public class SearchingEle
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   System.out.println("Enter the Searching element");
	   int searchEle = sc.nextInt();
	   
	   boolean flag = false;
	   for(int i=0 ; i<arr.length ; i++)
	   {
		  if(searchEle == arr[i]){
			   flag = true;
			   break;
		  }
		  
	   }
	       if(flag){
			   System.out.println("Element is Found");
		   }else{
			   System.out.println("Element is Not Found");
			  
		   }
	   
   }
}