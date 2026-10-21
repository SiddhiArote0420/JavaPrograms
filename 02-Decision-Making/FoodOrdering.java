/*Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
*/

import java.util.*;
public class FoodOrdering
{
  public static void main(String x[])
  {
	  Scanner orderFood = new Scanner(System.in);
	  
	  
	  System.out.println("1: Burger");
      System.out.println("2: Pizza");
      System.out.println("3: Pasta");
      System.out.println("4: Sandwich");
	  System.out.println("Enter the Your choice");
	  int n = orderFood.nextInt();
	  
	  int quent,bill;
	  
	  switch(n)
	  {
		  case 1 :
		     System.out.println(" Prise : 1 Burger = 90Rs");
			 System.out.println("Enter the How many Burger you want");
			 quent = orderFood.nextInt();
			 
			 if(quent>=1){
			 bill = 90*quent;
			 System.out.println("Your Total bill is : "+bill+"rs");
			 }else {
				 System.out.println("Please Enter valid Item No");
			 }
			 break;
			 
			case 2:
			 System.out.println(" Prise : 1 Pizza = 120Rs");
			 System.out.println("Enter the How many Pizza you want");
			 quent = orderFood.nextInt();
			 
			 if(quent>=1){
			 bill = 120*quent;
			 System.out.println("Your Total bill is : "+bill+"rs");
			 }else {
				 System.out.println("Please Enter valid Item No");
			 }
			 break;
			 
			 case 3:
			 System.out.println(" Prise : 1 Pasta = 120Rs");
			 System.out.println("Enter the How many Pasta you want");
			 quent = orderFood.nextInt();
			 
			 if(quent>=1){
			 bill = 60*quent;
			 System.out.println("Your Total bill is : "+bill+"rs");
			 }else {
				 System.out.println("Please Enter valid Item No");
			 }
			 break;
			 
			 case 4:
			 System.out.println(" Prise : 1 Sandwich = 120Rs");
			 System.out.println("Enter the How many Sandwich you want");
			 quent = orderFood.nextInt();
			 
			 if(quent>=1){
			 bill = 70*quent;
			 System.out.println("Your Total bill is : "+bill+"rs");
			 }else {
				 System.out.println("Please Enter valid Item No");
			 }
			 break;
			 
			 default:
			  System.out.println("Plese Enter valid Item Number");
	   }
   }
}
			 