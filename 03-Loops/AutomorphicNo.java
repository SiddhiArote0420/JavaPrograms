/*. Write a Java program to print all automorphic numbers between 1 and n.
 An automorphic number’s square ends with the number itself (e.g., 5² = 25).*/
 
 import java.util.*;
 public class AutomorphicNo
 {
	 public static void main(String x[])
	 {
		 Scanner ob = new Scanner(System.in);
		 
		 System.out.println("Enter the limit");
		 int limit = ob.nextInt();
		 
		 
		 for(int num = 1;num <= limit;num++)
		 {
		  int temp = num;//5
		  int square = num*num;//25
		  
		  //int digits = String.valueOf(num).length();// // Find number of digits in num
		
		  //count digits in number 
		     int count =0;
		    while(temp!=0)//25
			{
				count++; // 1 2
				temp = temp/10; //2
			}
			 
            int mod = (int)Math.pow(10, count);// Create modulus = 10^digits
		   
		    //num = temp;
		    if (square % mod == num)//625%100
			{ 
			  System.out.println(num);
		    }
		 }
	 }
 }
		 
		 
 
      