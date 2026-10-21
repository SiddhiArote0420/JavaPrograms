/* Write a java program to display following series :
           	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 */
			


import java.util.*;
public class Series_2
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		//System.out.println("Enter the limit");
		//int limit = ob.nextInt()'
		
		int num=1;
		int count=9;
		
		
			for(int i=1; i<=9;i++)
			{ 	
					
					int a = num*2;//2
					
					int b =count*count*count;//8
					System.out.print(a+" ");
					System.out.print(b+" ");
                    num = num+1;
                    count--;					
		    }
	}
}
			
            
		    
			
		
	
