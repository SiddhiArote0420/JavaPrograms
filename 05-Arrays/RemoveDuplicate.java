//Remove Duplicate Elements from Array


import java.util.*;
public class RemoveDuplicate
{
   public static void main(String x[])
   {
	   Scanner sc = new Scanner(System.in);
	   
	   int [] arr = new int[5];
	   
	   System.out.println("Enter the values in array");
	   for(int i = 0; i < arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   int []arr2 = new int[arr.length];
	   int j=0;
	   for(int i=0; i<arr.length;i++)
	   {
		   boolean isDuplicate = false;
		   for(int k=0;k<j;k++)
		   {
			   if(arr[i]==arr2[k]){
				   isDuplicate=true;
				   break;
			   }
		   }
		   if(!isDuplicate)
		   {
			   arr2[j] = arr[i];
			   j++;
		   }
	   }
	   System.out.print("Before remove duplicate:");
	   for(int i = 0; i < j ; i++)
	   {
		   System.out.print(arr2[i]+" ");
	   }
   }
}
			   