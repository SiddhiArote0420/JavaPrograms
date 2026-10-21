//Write a java program to enter month number between(1-12) and print number of days in month using if else.
// How to print the number of days in a given month using if else in java programming.

import java.util.*;
public class DaysInMonth
{
	public static void main(String x[])
		{
			Scanner daysCount = new Scanner(System.in);
			
			System.out.println("Enter the Month number :");
			int month = daysCount.nextInt();
			
			/*if(month == 1){
				System.out.println("31 days in this Month");
			}else if(month == 2){
				System.out.println("28 Days in this Month");
			}else if(month == 3){
				System.out.println("31 Days in this Month");
			}else if(month == 4){
				System.out.println("30 Days in this Month");
			}else if(month == 5){
				System.out.println("31 Days in this Month");
			}else if(month == 6){
				System.out.println("30 Days in this Month");
			}else if(month == 7){
				System.out.println("31 Days in this Month");
			}else if(month == 8){
				System.out.println("30 Days in this Month");
			}else if(month == 9){
				System.out.println("31 Days in this Month");
			}else if(month == 10){
				System.out.println("30 Days in this Month");
			}else if(month == 11){
				System.out.println("31 Days in this Month");
			}else if(month == 12){
				System.out.println("30 Days in this Month");
			}else{
				System.out.println("Input is invalid");
			}*/
			
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 11 ){
				System.out.println("31 days in this Month");
			}else if(month == 2){
				System.out.println("28 Days in this Month");
			}else if(month == 4 || month == 6 || month == 8 || month == 10 || month == 12  ){
				System.out.println("30 Days in this Month");
			}else{
				System.out.println("Input is invalid");
			}
		}
	}
