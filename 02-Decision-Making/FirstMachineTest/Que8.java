/* Write a java program to find the total number of notes in a given 
amount.   
Enter the amount: 2528  
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1*/

import java.util.*;
public class Que8
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the amount");
	 int amt = sc.nextInt();
	 
	 int rs500=0,rs100=0,rs50=0,rs20=0,rs10=0,rs5=0,rs2=0,rs1=0;
	 if(amt >= 500)
	 {
		 rs500 = amt/500;
		 amt = amt % 500;
	 } if(amt >= 100){
		 rs100 = amt/100;
		 amt = amt % 100;
	 }if(amt >= 50){
         rs50 = amt/50;
		 amt = amt % 50;
	 }if(amt >= 10){
         rs20 = amt/20;
		 amt = amt % 20;
	 }if(amt >= 10){
         rs10 = amt/10;
		 amt = amt % 10;
	 }if(amt >= 5){
         rs5 = amt/5;
		 amt = amt % 5;
	 }if(amt >= 2){
         rs2 = amt/2;
		 amt = amt % 2;
	 }	
	 if(amt>=1)
	 { 
       rs1 = amt/1; 
	 }
	 
	 System.out.println("500 = "+rs500+", 100 = "+rs100+", 50 = "+rs50+", 20 ="+rs20+", 10 = "+rs10+", 5 = "+rs5+", 2 = "+rs2+", 1 = "+rs1);
}
}	 