//Write a java program to find positive and negative number in array.



import java.util.*;
public class PositiveNegative
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   int odd, even;
	   	for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   System.out.print("EVEN Number ");
	   
	   for(int i=0 ; i<arr.length ; i++)
	   {    
		   if(arr[i]>=0)
		   {
			   System.out.print(+arr[i]+" ");
		   }
	   }
	   System.out.println();
	   System.out.print("ODD Number ");
	   for(int i=0 ; i<arr.length ; i++)
	   {    
		   if(arr[i]<0)
			     System.out.print(arr[i]+" ");
	   }  
   }
}
