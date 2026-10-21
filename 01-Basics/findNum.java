//Write a program to find first and last digit of a number without using loop in three digit.

/*public class findNum
{
	public static void main(String x[])
	{
		int num = Integer.parseInt(x[0]);
		
		int lastNo = num%10;
		int firstNo = num /100;
		//char firstNo = (x[0]).charAt(0);
		
		System.out.println("Last Number ="+lastNo);
		System.out.println("First Numbetr = "+firstNo);
	}
}*/


public class findNum
{
	public static void main(String x[])
	{
		int num = Integer.parseInt(x[0]);
		
		int lastNo = num%10;
		int firstNo = num/100;
		
		System.out.println("Last : "+lastNo+" First : "+firstNo);
	}
}