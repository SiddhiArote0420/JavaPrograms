//Write a java program to check array is palindrome or not.




import java.util.*;
public class palindromeArray2
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   boolean  flag = false;
	   for(int i=0 ; i<=(arr.length/2) ; i++)
	   {
		   if(arr[i] == arr[(arr.length-1)-i])
		   {
			   flag = true;
		   }else{
			   flag = false;
			   break;
		   }
	   }
	   if(flag){
         System.out.println("It is a palindrome");
		}else{
         System.out.println(" It is Not palindrome");	
		}	
   }
}
			   
		   
	   