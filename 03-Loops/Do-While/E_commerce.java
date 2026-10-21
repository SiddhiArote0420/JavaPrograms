/*
Write a menu-driven program using switch and do-while to perform:
Enter product price and quantity, calculate total bill
Apply discount (10% if bill > ₹1000)
Calculate GST on bill amount (18%)
Compare final bill amount with a given value
Exit the program
*/

import java.util.*;
public class E_commerce
{   
	public static void main(String x[ ])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		int price=0,quant=0,totalBill=0,finalBill=0;
		System.out.println("Enter the product price");
		price= sc.nextInt();
			
	    System.out.println("Enter the product quantity");
	    quant= sc.nextInt();
		
		do{
			
			System.out.println("......MENU......");
			System.out.println("1.calculate total bill");
			System.out.println("2.Apply discount(10% if bill > ₹1000)");
			System.out.println("3.Calculate GST on bill amount (18%)");
			System.out.println("4. Compare final bill amount with a given value");
		    System.out.println("5. Exit");
			
			System.out.println("Enter which operation you want to perform");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				    totalBill = price*quant;
					System.out.println("Total Bill is :"+totalBill);
					break;
					
				case 2:
				    int disAmt;
					if(totalBill > 1000)
					{
						disAmt = (totalBill *10)/100;
						finalBill = totalBill - disAmt;
						System.out.println("Total bill with Discount :"+finalBill);
					}else{
						System.out.println("You don't have any discount your bill is less than 1000");
					}
					break;
					
				case 3:
				    int gstAmt;
					gstAmt = (totalBill*18)/100;
					finalBill = totalBill + gstAmt;
					System.out.println("Total bill with GST :"+finalBill);
					break;
					
				case 4:
				    System.out.println("Enter your value you want compair");
					int compairVal = sc.nextInt();
					
					if(compairVal > finalBill)
					{
					   System.out.println("Your amount is Greter");
					}else if(compairVal < finalBill)
					{
					   System.out.println("Your amount is less");
					}else{
                        System.out.println("Your amount is equal");
					}
                    break;	
 
                case 5:	
                    System.out.println("You Are Exit");
                    break;
					
				default :
                    System.out.println("Invalid Input");
                    break; 
			}	 
			System.out.println("Do you want to Countinue(y/n)");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
	}
} 
					
						