public class CircleADC
{
  public static void main(String x[])
   {
     int radius = Integer.parseInt(x[0]);
     int diameter = 2 * radius;
     double circumference = 2 * 3.14 * radius;
     double area = 3.14 * radius * radius;
 
      System.out.printf("Diameter of circle =%d\n Circumference of circle =%f\n Area of circle =%f\n", diameter, circumference, area);
   }
}  