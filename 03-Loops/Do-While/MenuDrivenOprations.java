/* 
 Write a menu-driven program using do-while and switch-case to:
Check if a number is prime.
Find the sum of digits of a number.
Reverse a number.
Exit.
Perform operations repeatedly until the user selects exit.
*/

import java.util.*;
public class MenuDrivenOprations
{    private static final String EXIT = "exit";
	public static void main(String x[ ])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;	
		String ch;
		do{
			System.out.println("......MENU......");
			System.out.println("1.Check if a number is prime");
			System.out.println("2. Find the sum of digits of a number.");
			System.out.println("3. Reverse a number");
			System.out.println("4. Exit");
		
			System.out.println("Enter Your choice. if you want to exit type 'exit'");
			ch = sc.next();
			   if(ch.equalsIgnoreCase(EXIT))
			        break;
			
			 int choice = Integer.parseInt(ch);
            
			switch(choice)
			{
				case 1:
				    System.out.println("Enter the Number");
					num = sc.nextInt();
					int count=0;
                    for(int i=2 ; i<=num/2;i++)
					{
					   if(num%i==0)
					   {
                         count++; 		
					   }
					}
					if(count == 0){
						System.out.println("Number is a prime number");
					}else{
						System.out.println("Number is not a prime Number");
					}
					break;
				
				case 2:
				   System.out.println("Enter the Number");
				   num = sc.nextInt();
				    
					int a,sum=0;
				   while(num!=0)
				   {
					   a = num%10;
					   num = num/10;
					   sum +=a;
				   }
				   System.out.println("Sum is :"+sum);
				   break;
				   
				case 3:
				    System.out.println("Enter the number");
					num = sc.nextInt();
					a=0;
					while(num!=0)
					{
						int b = num%10;
						num = num/10;
						 a = a*10+b;
					}
					System.out.println(a);
			        break;
					
                case 4:	
                    System.out.println("You Are Exit");
                    break;

                default	:
                    System.out.println("Invalid Input");
                    break;
					
			}
				
		}while(true);
	}
}
