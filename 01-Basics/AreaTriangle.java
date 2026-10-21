// Write a java program to calculate area of an equilateral triangle.

public class AreaTriangle
{
  public static void main(String x[])
  {
    float a = Float.parseFloat(x[0]);
	double area = (1.732/4)*a*a; // area=(Math.sqrt(3)/4) *a*a;
	
	System.out.printf("Area of an equilateral triangle =%f\n", area);
  }
 }
    