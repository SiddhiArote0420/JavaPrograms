/*
Q49. There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity
of MM students that can register for it. If there are KK other students who have already enrolled in the course,
 determine if it will still be possible for all the NN friends to do so or not.
*/

import java.util.*;
public class FriendsApp
{
  public static void main(String x[])
  {
	  Scanner ob = new Scanner(System.in);
	  
	  System.out.println("Enter the Number of Friends :");
	  int nn = ob.nextInt();
	  
	  System.out.println("Enter the capacity of members :");
	  int mm = ob.nextInt();
	  
	  System.out.println("Enter Other Student Alredy Register :");
	  int kk = ob.nextInt();
	  
	  int a = mm-kk;
	  
	  if( nn <= a){
		  System.out.println("they enroll in a course together");
	  }else{
		  System.out.println("they Not enroll in a course together");
	  }
  }
}
