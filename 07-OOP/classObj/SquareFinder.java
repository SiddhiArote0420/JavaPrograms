/* Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/

import java.util.*;
public class SquareFinder{
	public static int square(int n ){
		
		//int square = n*n;
		return n*n;
	}
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int result = square(n);
		System.out.println("Square is :"+result);
	}
}