// convert days into years,weeks and day 

public class convertDays
{
	public static void main(String x[])
	{
		int days = Integer.parseInt(x[0]);
		
		int year = days/365;
		int remain = days%365;
		
		int month = remain/30;
		remain = remain%30;
		days = remain;
		
		
		System.out.printf(year+" year = "+month+" Month "+ days+" Days ");
		//System.out.printf(days+" Days = "+year+" Year \n");
		//System.out.printf(month+" month = "+yearCToMonth+" Year \n");
    }
}	
	