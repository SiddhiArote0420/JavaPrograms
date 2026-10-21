/*
Write a menu-driven program using switch and do-while to perform operations on a single number:
Count the number of digits
Count how many digits are even
Find the product of all odd digits
Check if the number is an Armstrong number
Exit the program
*/

import java.util.*;
public class OperatnsOn_SingleNo
{   
	public static void main(String x[ ])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		int num;
		do{
		    System.out.println("Enter the number");
			num = sc.nextInt();
			
			System.out.println("......MENU......");
			System.out.println("1.Count the number of digits");
			System.out.println("2. Count how many digits are even");
			System.out.println("3. Find the product of all odd digits");
			System.out.println("4. Check if the number is an Armstrong number");
		    System.out.println("5. Exit");
			
			System.out.println("Enter which operation you want to perform");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				     int count = 0;
				    for(; num!=0 ;)
					{
					  num = num/10;
					  count++;
					}
					System.out.println("Number of digit in number is :"+count);
					break;
					
				case 2:
				   count=0;
				   int a;
				   for(; num!=0; )
				   {
					 a = num%10;
                     num = num/10;
                       if(a%2==0)
                            count++;
				   }
				   System.out.println("Number of Even digits is :"+count);
 				   break;
				   
				  case 3:
				      int product = 1;
					  for(; num!=0;)
					  {
						  a = num%10;
						  num = num/10;
						  if(a%2!=0)
						  {
							  product = product *a;
						  }
					  }
					  System.out.println("Product of odd digit is :"+product);
					  break;
					  
				  case 4:
				    count = 0;
					int temp = num, sum = 0;;
					for(; temp!=0 ;)
					{
					  temp = temp/10;
					  count++;
					}
					temp = num;
					for(; temp!=0;)
					{
						a = temp %10;
						temp = temp/10;
						sum = sum + ((int)Math.pow(a, count));
					}
					if(sum == num){
						System.out.println("the number is an Armstrong number");
					}else{
						System.out.println("the number is not Armstrong number");
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