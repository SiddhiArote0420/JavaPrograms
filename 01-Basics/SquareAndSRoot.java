// calculate square and squareroot of num

public class SquareAndSRoot
{
	public static void main(String x[])
	{
		int n = Integer.parseInt(x[0]);
		
		double Square = n*n;
		double SquareRoot = Math.sqrt(Square);
		
		System.out.printf("Squre is :%f\n", Square);
		System.out.printf("SquareRoot is :%f",SquareRoot);
		
	}
}
		