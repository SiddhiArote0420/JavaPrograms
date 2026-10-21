// convert minutes to hourse

public class ConvertMTH
{
 public static void main(String x[])
  {
	int minutes =Integer.parseInt(x[0]);
	//int seconds=Integer.parseInt(x[0]);
	int Hours =  minutes/60;

	System.out.println(minutes+ " Minutes = " + Hours + " Hours");
	
  }
}