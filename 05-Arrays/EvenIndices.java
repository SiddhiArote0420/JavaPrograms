//Print array elements at even indices.
//Input: arr = [4, 9, 7, 11, 6]

import java.util.*;
public class EvenIndices
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   int odd, even,sumEven=0;
	   
	   	for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   System.out.print("Even Number indices : ");
	   for(int i=0 ; i<arr.length ; i++)
	   {    
		   if(i%2==0)
		   {
			   System.out.print(arr[i]+" ");
		   }
	   }
   }
}
