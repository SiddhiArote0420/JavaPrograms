/* There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR never remains empty as when the last k candies are left. JAR is refilled with new candies in such a way that JAR gets full.
Write a code to implement the above scenario. Display JAR at the counter with the available number of candies. Input should be the number of candies one customer can order at a point of time. Update the JAR after each purchase and display JAR at Counter.
Output should give the number of Candies sold and the updated number of Candies in JAR. If Input is more than candies in JAR, return: “INVALID INPUT”.
Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is the number of minimum candies that must be inside JAR ever.
*/

import java.util.*;
public class CANAPP
{ public static void main(String x[])
  {  Scanner xyz  = new Scanner(System.in);
      int M,N=10,K=5;
	  System.out.println("Enter candies count");
	  M=xyz.nextInt();
	  if(M>K || M<=0)
	  { System.out.println("Invalid input");
	  }
	  else
	  {
	    System.out.println("Candies server "+M);
		System.out.println("Candies Remain "+(N-M));
	  }
  
  }
}


