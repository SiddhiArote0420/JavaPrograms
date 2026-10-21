/* Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/
import java.util.*;

class Swapper
{
	int x,y;
	
	void setValues(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void swapValue()
	{
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("X Is :"+ x);
		System.out.println("Y Is :"+ y);
	}
}
public class SwapperApp
{
	public static void main(String args[])
	{
		Swapper s=new Swapper();
		
		int a=10,b=20;
		
		s.setValues(a,b);
		s.swapValue();
	}
		
}		
		