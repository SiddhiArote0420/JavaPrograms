/*Create a Car class with:
brand
mileage
Use a constructor to set values.
 Write a method getMileageRating():
mileage < 10 → “Poor”
10 to 15 → “Average”
15 to 20 → “Good”
20 → “Excellent”
Explanation:
 Use nested if-else or else-if ladder inside a class method.*/
 
 import java.util.*;
 class Car{
    private String brand;
	private float mileage;
	
	Car(String brand, float mileage)
	{
		this.brand = brand;
		this.mileage = mileage;
	}
	
	public void getMileageRating(){
		if(mileage > 20)
		{
			System.out.println("Excellent");
		}else if(mileage > 15 && mileage <= 20)
		{
			System.out.println("Good");
		}else if(mileage >= 10 && mileage <= 15)
		{
			System.out.println("Average");
		}else{
			System.out.println("poor");
		}
	}
 
 
 }
 public class CarMileage {
	 public static void main(String[] args)
	 {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter the brand name");
		 String brand = sc.nextLine();
		 
		 System.out.println("Enter the mileage");
		 float mileage = sc.nextFloat();
		 
		 Car c = new Car(brand, mileage);
		 c.getMileageRating();
	 }
 }