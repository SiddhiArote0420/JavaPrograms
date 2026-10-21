// calculate square and squareroot of num
//using scanner class

import java.util.*;
public class SquareAndSRoot1
{
	public static void main(String x[])
	{
		Scanner findSqure_root = new Scanner(System.in);
		
		double Square,SquareRoot;
		
		System.out.println("Enter the Number : ");
		int n = findSqure_root.nextInt();
		
		
		Square = n*n;
		SquareRoot = Math.sqrt(Square);
		
		System.out.printf("Squre is :%f\n", Square);
		System.out.printf("SquareRoot is :%f",SquareRoot);
		
	}
}
		