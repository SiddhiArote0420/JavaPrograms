import java.util.*;
public class rotateArray
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   int k = 2;
	   
	   for(int i = 0; i< 2; i++)
	   {
	      int temp = arr[arr.length-1];
	      for(int j=arr.length-2; j>=0; j--)
		  {
		     arr[j+1] = arr[j];
		  }
		  
		  arr[0]=temp;
		}
		
		for(int i=0 ; i< arr.length ; i++)
	   {
		   System.out.print(arr[i] +" ");
	   }
	 }
}