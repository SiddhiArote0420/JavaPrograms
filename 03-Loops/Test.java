import java.util.*;
public class Test
{
	
	public static int[] displayArray(int b[],int s)  // Function defination
	{
		return b;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Array :");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter The Value Of Array :");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[]=displayArray(a,size);
		System.out.println("Display The Value Of Array :");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
			
		
		
	