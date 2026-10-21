import java.util.*;
public class KaprekarNo
{
 public static void main(String x[])
 {
  Scanner ob = new Scanner(System.in);
   
   System.out.println(" Enter the limit :");
    int lim = ob.nextInt();

		for(int i=1;i<=lim;i++)
		{
          int temp = i;//45
		  int square = i*i;//2025
		
		  
		    int count =0;
		    while(temp!=0) // 2
			{
				count++; 
				temp = temp/10; 
			}
			 
            int mod = (int)Math.pow(10, count);
		   	
			int a = square%mod; 
			square = square/mod; 
			if(a+square == i) 
			{
				System.out.println("Karpekar Number Is :"+ i);
			}
		}
 }
}