/*
 Menu-Driven Calculator**

**Description:**

* Display a menu with 4 operations: Add, Subtract, Multiply, Divide.
* Use a do-while loop to keep showing the menu until the user chooses "Exit".
* Use **continue** to skip calculation if the user enters an invalid choice.
* If the user enters "Exit", **break** the loop.
*/



import java.util.*;
public class Menu_Driven_Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    int num1=0, num2=0;
		char ch=' ';
		outerLoop:
		do{
			System.out.println("=== Menu Driven Calculator ===");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
		
			System.out.println("Enter your choise:");
			int choice = sc.nextInt();
			
			if (choice >= 1 && choice <= 4) {
                   System.out.println("Enter the First number:");
     			   num1 = sc.nextInt();
                   System.out.println("Enter the Second number:");
                   num2 = sc.nextInt();
             }

		
			switch (choice)
			{
				case 1:
				
					System.out.println("Addition is :"+ (num1+num2));
					break;
					
				case 2:
					System.out.println("Subtraction is :"+ (num1-num2));
					break;
					
				case 3:
					System.out.println("Multiplication is :"+(num1*num2));
					break;
					
				case 4:
				    /*if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        continue ;
                    }else{
					    System.out.println("Division is :"+ (num1/num2));
					break;
					}*/
					
					while (true) { // keep asking until valid
                        System.out.println("Enter the First number:");
                        num1 = sc.nextInt();
                        System.out.println("Enter the Second number:");
                        num2 = sc.nextInt();

                        if (num2 == 0) {
                            System.out.println("Division by zero is not allowed. Please enter again.");
                            continue; // retry only inside case 4
                        }
                        System.out.println("Division is :" + (num1 / num2));
                        break;
                    }
                    break;
				case 5:
				      System.out.println("Exiting......");
					  break outerLoop;
					
				default:
					System.out.println("Invalid");
					break;

			}
			System.out.println("Do you want to Continue(y/n)");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		sc.close();
	}
}