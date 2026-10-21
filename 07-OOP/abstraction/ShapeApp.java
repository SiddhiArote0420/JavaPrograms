/*Shape Area & Perimeter Calculator
Concepts: Abstract class, method overriding
Operations:
Abstract class Shape
Abstract methods:
calculateArea()
calculatePerimeter()
Classes:
Rectangle
Circle
Perform calculations and display results
Logic:
 Same method names, different logic based on shape.
*/

import java.util.*;
abstract class Shape{
	abstract void calculateArea();
    abstract void calculatePerimeter();

}
class Rectangle extends Shape{
	double width;
	double length;
	
	Rectangle(){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Width of Rectangle: ");
	   this.width = sc.nextDouble();
	
	   System.out.println("Enter the Length of Rectangle: ");
	   this.length = sc.nextDouble();
	}
	
	void calculateArea(){
		double area = length*width;
		System.out.println("Area of Rectangle is: "+ area);
	}
	
	void calculatePerimeter(){
	  double perimeter=2*(length+width);
	  System.out.println("Perimeter of Rectangle is: "+ perimeter);
	}
}

class Circle extends Shape{
	double r;
	double pi;
	
	Circle(){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Radius of circle: ");
	  this.r = sc.nextDouble();
	  this.pi = 3.14;
	}
	
	void calculateArea(){
		double area = pi*r*r ;
		System.out.println("Area of Circle is: "+ area);
	}
	
	void calculatePerimeter(){
	  double perimeter = 2*pi*r;
	  System.out.println("Perimeter of Circle is: "+ perimeter);
	}
}

public class ShapeApp{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the which Shape area or Perimeter you want to calculate");
		System.out.println("(1-Rectangle, 2-Circle)");
		int choice = sc.nextInt();
		
		Shape s = null;
		if(choice == 1)
		{
			s = new Rectangle();
		}else if(choice == 2){
			s = new Circle();
		}else{
			System.out.println("Invalid input");
		}
		
		s.calculateArea();
		s.calculatePerimeter();
		
	}
}