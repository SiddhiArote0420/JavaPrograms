/*
Temperature Logger**

**Description:**

* Ask the user to enter daily temperatures.
* Use **continue** if the entered temperature is negative (invalid reading).
* Use **break** if the user enters "stop".
* Keep looping with do-while until break condition.*/


import java.util.*;
public class Temperature_Logger
{  
    private static final String Result = "Stop";

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String opinion;
		int temp;
		do{
			System.out.println("You want to countinue (Stop/continue)");
			opinion = sc.next();
	
				 if(opinion.equalsIgnoreCase(Result))
			        break; 
		
		  if(!opinion.equalsIgnoreCase(Result)){
		    System.out.println("Enter Your daily temperature :");
		    temp = sc.nextInt();
			 
		       if(temp < 0){
		           System.out.println("invalid reading. Please Enter Valid reading");
                   continue ;
		       }
			   
			 System.out.println("Accepted");   
			
		  }
			 
		}while(true);
		
		System.out.println("Temperature logging stopped."); 
		sc.close();
	}
}
		 
			 