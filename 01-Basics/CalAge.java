// calculate age from year of birth

public class CalAge
{
	public static void main(String x[])
	{
		int curYear = Integer.parseInt(x[0]);
		int birthYear = Integer.parseInt(x[1]);
		
		int age = curYear-birthYear;
		
		System.out.println("Age is : "+age);
	}
}
		