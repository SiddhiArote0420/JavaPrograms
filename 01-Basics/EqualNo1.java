// chack if two float numbers are approximately equal
//using scanner class

import java.util.*;
public class EqualNo1
{
	public static void main(String x[])
	{
		Scanner eqChack = new Scanner(System.in);
		
		float n1,n2;
		
		System.out.println("Enter the first number");
		n1 = eqChack.nextFloat();
		
		System.out.println("Enter the second number");
		n2 = eqChack.nextFloat();
  
        String str = n1==n2 ? "Number are equal" : "Number are not equal";
  
        System.out.println(str);
	}
}	