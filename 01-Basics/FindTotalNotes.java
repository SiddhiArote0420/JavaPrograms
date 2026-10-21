//Write a java program to find the total number of notes in a given amount. 
/*Enter the amount: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
*/ 

import java.util.*;
public class FindTotalNotes
{
	public static void main(String x[])
	{
		Scanner totalNotes = new Scanner(System.in);
		
		System.out.println("Enter Amount :");
		int amount = totalNotes.nextInt();
		
		int rs500 = amount / 500;
		int remain = amount % 500;
		
		int rs100 = remain/100;
		remain = remain%100;
		
		int rs50 = remain/50;
		remain = remain%50;
		
		int rs20 = remain/20;
		remain = remain%20;
		
		int rs10 = remain/10;
		remain = remain%10;
		
		int rs5 = remain/5;
		remain = remain%5;
		
		int rs2 =remain/2;
		remain = remain%2;
		
		int rs1 = remain/1;
		
		System.out.println("500 = "+rs500+", 100 = "+rs100+", 50 = "+rs50+", 20 = "+rs20+", 10 = "+rs10+", 5 = "+rs5+", 2 = "+rs2+", 1 = "+rs1);
	}
}