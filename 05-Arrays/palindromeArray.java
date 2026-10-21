//Write a java program to check array is palindrome or not.




import java.util.*;
public class palindromeArray
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   System.out.print("Reverse Array : ");
	   
	   int[] newArr =new int[arr.length];
	   int k=0;
	    for(int i = arr.length - 1; i >= 0; i--)
	   {
		   
		   newArr[k] = arr[i];
		   System.out.print(k +"--->"+newArr[k]+" " );
		   k++;
	   } 
	   if(Arrays.equals(arr, newArr))
         {
            System.out.println("It is a palindrome");
         }else{
            System.out.println("It is Not palindrome");    
        }
		 
   }
}