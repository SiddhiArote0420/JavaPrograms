/*Write a java program to display following series using function recursion. 
            1  4  9  16  25  36  49  64  81  100 
			(1^2 2^2 3^2.................*/
		
		
import java.util.*;
public class SerieseUsingRecursion{
public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the limit");
	 int limit = sc.nextInt();
	 
	 
	 printSeriese(1,limit,0,3);
 }
 public static void printSeriese(int n, int limit,int count,int p)
 {   
	 if(count >= limit)
		 return;
	 
	 System.out.print(n +" ");//n*n
	 printSeriese(n + p, limit, count+1, p+2);
	  
 }
}

	 