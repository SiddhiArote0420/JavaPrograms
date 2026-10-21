// print character for a given ASCII value
// using scanner class 

import java.util.*;
public class PCharToAscii1
{ 
    public static void main(String x[])
	{
	   Scanner chToAscii = new Scanner(System.in);
	   int ascii ;
	   char cha;
	
	    System.out.println("Enter the ASCII value : ");
		ascii = chToAscii.nextInt();
		
	    cha = (char)ascii;
	
	System.out.println("character of given ascii value: "+ cha);
	}
}
