//Write a Java program to convert seconds to hours, minutes and seconds.

public class ConvertApp
{
 public static void main(String x[])
  {
	int seconds =Integer.parseInt(x[0]);
	
	int hours =  seconds/3600;
	int remain = seconds%3600;
	
	
	int minutes =remain/60;
	remain = remain%60;
	 
	seconds = remain;


	System.out.println(hours + " Hours : " +minutes+" Minutes : " +seconds+ " seconds ");

  }
}
	
	