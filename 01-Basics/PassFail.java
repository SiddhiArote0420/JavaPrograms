// Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.

import java.util.*;
public class PassFail
{ 
  public static void main(String x[])
  {
	  Scanner chackResult = new Scanner(System.in);
	  
	  System.out.println("Enter The Student Score : ");
	  int score = chackResult.nextInt();
	  
	  String result = (score >= 40)? " Pass" : "Fail" ;
	  System.out.println(result);
  }
}
