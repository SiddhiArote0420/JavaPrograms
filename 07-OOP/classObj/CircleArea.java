/*Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
*/

import java.util.*;
public class CircleArea{
	double r;
	void inputAccept(){
		Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the the radiusof a circle");
	    r = sc.nextDouble();
	}  
	
        void findArea(){ 
		    double area = 3.14 * r * r;
            System.out.println("Area of a Circle is : "+ area);  
        }
	
   public static void main(String x[]){
        
	   CircleArea obj = new CircleArea();
	   
	   obj.inputAccept();
	   obj.findArea();
	   
	   
   }
}