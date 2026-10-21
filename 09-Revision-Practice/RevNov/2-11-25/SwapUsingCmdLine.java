//1.Write program to input two values using command line argument and perform its swapping?

class SwapUsingCmdLine{
	public static void main(String x[])
	{
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}