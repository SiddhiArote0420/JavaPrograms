//Write a java program to display the reverse array.


import java.util.*;
public class DisplayRev
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   System.out.print("Reverse Array : ");
	  /* for(int i = arr.length - 1; i >= 0; i--)
	   {
		   System.out.print(i +"--->"+ arr[i]+" ");
	   }*/
	   
	   /*int[] newArr =new int[arr.length];
	   int k=0;
	    for(int i = arr.length - 1; i >= 0; i--)
	   {
		   
		   newArr[k] = arr[i];
		   System.out.print(k +"--->"+newArr[k]+" " );
		   k++;
	   }  */
	   	   int end=arr.length-1;// size-1
		   int mid=arr.length/2;
		   
	   for(int i=0 ; i<=mid ; i++)
	   {      
           int temp = arr[i];
		   arr[i] = arr[end];
		   arr[end] = temp;
		   end--;
		   
       }
	   for(int i = 0; i < arr.length; i++)
	   {
		   System.out.print(i +"--->"+ arr[i]+" ");
	   }
}
}