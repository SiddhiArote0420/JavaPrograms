/*Count Even and Odd Numbers in an Array
o   Write a class to implement a method to count how many numbers are even and odd in an integer array.
 Explanation: Learn conditional checks and iteration in arrays.
*/

import java.util.*;
class CountEvenOdd{
   
   public int[] countOddEven(int [] arr){
	   int evenCount = 0;
	   int oddCount = 0;
	   for( int i=0; i<arr.length; i++)
	   {
		 if(arr[i]%2 == 0)
		 {
           evenCount++;
		 }else{
           oddCount++;
		 }		   
	   }
	   
	   int returnCount[] = new int[2];
	   returnCount[0]= evenCount;
	   returnCount[1]= oddCount;
	   return returnCount;
     
}
}
public class EvenOddCount{
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
		
		CountEvenOdd m = new CountEvenOdd();
		int[] result = m.countOddEven(arr);
		System.out.println("Even Number is: "+result[0]+" , Odd Number is: "+result[1] );
	}
}