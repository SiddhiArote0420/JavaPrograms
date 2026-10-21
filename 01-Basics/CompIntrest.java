// Write a java program to calculate the compound intrest

public class CompIntrest
{
  public static void main(String x[])
  {
    int Principal = Integer.parseInt(x[0]);
	int rateOfInterest = Integer.parseInt(x[1]);
	int TimeInYears = Integer.parseInt(x[2]);
	
	double compoundIntrest = Principal*(Math.pow((1+rateOfInterest/100),TimeInYears));
	
	//System.out.printf("Amout is:%f\n", Amount);
	System.out.printf("Compound Intrest is : %f\n", compoundIntrest);
	
   }
  }
	