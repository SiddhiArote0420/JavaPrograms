import java.util.*;
public class ArrayIndexAdd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter Array element");
		for(int i=0 ; i<size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		// count sum of index
		int indexSum =0;
		for(int i=0; i<arr.length ; i++)
		{
			indexSum += i;
		}
		System.out.println("Sum Of index: "+indexSum);
	}
}