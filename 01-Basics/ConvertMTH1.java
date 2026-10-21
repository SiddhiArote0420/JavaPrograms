// convert minutes to hourse
// using scanner convert

import java.util.*;
public class ConvertMTH1
{
 public static void main(String x[])
  {
	Scanner conMtoH = new Scanner(System.in);
	int minutes,hours;
	
	System.out.println("Enter Minutes : ");
	minutes = conMtoH.nextInt();
	
	hours =  minutes/60;

	System.out.println(minutes+ " Minutes = " + hours + " Hours");
	
  }
}