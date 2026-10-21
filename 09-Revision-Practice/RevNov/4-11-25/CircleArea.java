/*Write program to create class name as Area with constructor overloading
       Area(float radius): this function can accept radius as input and calculate circle Area.
       Area(int len,int width): this function can accept len and width as input and calculate area of rectangle
*/

import java.util.*;
class Area{

       private float radius;
	   private int len;
	   private int width;
	   
       Area(float radius)
	   {
		   this.radius = radius;
		   
		   
	   }
	   
	   Area(int len , int width)
	   {
		   this.len = len;
		   this.width = width;
	   }
	   
	   public void areaOfCircle()
	   {
		   float areaIs = (float)Math.PI*radius*radius;
		   System.out.println("Area of a circle: "+ areaIs);
	   }
	   
	   public void areaOfRactangle(){
		   int area = len*width;
		   System.out.println("Area of a Ractangle: "+ area);
	   }
   
}
public class CircleArea{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		
     System.out.println("Enter the radius of a circle");
	 float radius = sc.nextFloat();
	 
	 System.out.println("Enter the length of a rectangle");
	 int len = sc.nextInt();
	 
	 System.out.println("Enter the width of a rectangle");
	 int width = sc.nextInt();
	 
	 Area a1 = new Area(radius);
     Area a2 = new Area(len,width);
	 
	 a1.areaOfCircle();
	 a2.areaOfRactangle();
	}
}
     	 