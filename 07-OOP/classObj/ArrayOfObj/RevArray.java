/*Reverse an Array
  Write a class to write a method to reverse the elements of an integer array.
 Explanation: Work with array indexing and swapping.*/
 
 import java.util.*;
class ReversArray{
   public int[] arrRev(int [] arr){
	   
	   int i =0;
	   int j = arr.length-1;
	   while(i< arr.length/2)
	   {
		 int temp = arr[i];
		 arr[i] = arr[j];
         arr[j] = temp;
		 i++;
		 j--;
	   }
	   
	   return arr;
    }
}
public class RevArray{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the value in array");
		for(int i=0; i< arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		ReversArray m = new ReversArray();
		int[] result = m.arrRev(arr);
		
		System.out.println("Reverse array");
		for(int i=0; i< result.length ; i++)
		{
			System.out.print(result[i] +" ");
		}
	}
}