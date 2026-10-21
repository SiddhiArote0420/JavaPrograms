/* Number Guessing Game**

**Description:**

* System generates a random number between 1–100.
* Use a do-while loop to let the user guess the number.
* If guess is too high or low, give a hint and **continue**.
* If the guess is correct, print "You guessed it!" and **break**.
*/


import java.util.*;
public class  NumberGuessing_Game
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

         int num = (int)(Math.random() * 100) + 1; // 100 for max & 1 is min
         char ch;
          do{
			  
			  System.out.println("Enter Your Choice(1-100) :");
			  int choice = sc.nextInt();
			  
			  if(num == choice)
			  {
				  System.out.println("You guessed it!" );
				  break;
			  }else if (choice > num)
			  {
				  System.out.println("guess is too high");
				  
			  }else{
				  System.out.println("guess is too low");
				  
			  }
			  
			  System.out.println("Do you want to Countinue(y/n)");
			  ch = sc.next().charAt(0);
		}while(ch == 'y');
		  
	}
}
				   
