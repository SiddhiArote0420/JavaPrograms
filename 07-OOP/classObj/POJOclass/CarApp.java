/*Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:
1. Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
2. Find the car with the best mileage.
3. Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.
*/

import java.util.*;
class Car{
   private int carId;
   private String model;
   private float fuelConsumed; 
   private float distanceTravelled;

   void setCarId(int carId)
   {
	   this.carId = carId;
   }
   public int getCar(){ return carId; }
   
   void setModel(String model)
   {
	   this.model = model;
   }
   public String getModel(){ return model; }
   
   void setFuelConsumed(float fuelConsumed)
   {
	   this.fuelConsumed = fuelConsumed;
   }
   public float getFuelConsumed(){ return fuelConsumed; }
   
   void setDistanceTravelled(float distanceTravelled)
   {
	   this.distanceTravelled = distanceTravelled;
   }
   public float getDistanceTravelled(){ return distanceTravelled; }
   
   //
   public float calMileage()
   {
	   float mileage = distanceTravelled / fuelConsumed;
	   return mileage;
   }
	   
   
}

public class CarApp{
	public static void main(String [] args)
	{
	   Scanner sc = new Scanner(System.in);
	   
	   Car c[] = new Car[3];
	   
	   System.out.println("Enter the car Detail");
	   for(int i=0; i<c.length; i++)
	   {
		   c[i] = new Car();
		   System.out.println("Enter the car Id: ");
		   int carId = sc.nextInt();
		   sc.nextLine();
		   
		   System.out.println("Enter the model: ");
		   String model = sc.nextLine();
		   
		   System.out.println("Enter the fuel Consumed");
		   float fuelConsumed = sc.nextFloat();
		   
		   System.out.println("Enter the distance Travelled");
		   float distanceTravelled = sc.nextFloat();
		   
		   System.out.println();
		   c[i].setCarId(carId);
		   c[i].setModel(model);
		   c[i].setFuelConsumed(fuelConsumed);
		   c[i].setDistanceTravelled(distanceTravelled);
		   
		   
	   }
	       
	       
		   	//Calculate the mileage of each car
		System.out.println("Milege of each car");
		for(Car a : c)
		{
			System.out.println(a.getModel() +" ===> " + a.calMileage());
			
		}
		System.out.println();
		CarApp car = new CarApp();
		car.bestMilege(c);
	   
	}
	

	//car with the best mileage
	
   public void bestMilege(Car[] c){
	   System.out.println(" best Milege car ");
	   Car bestMilege = c[0];
	   for(Car a : c)
	   {
		   if(a.calMileage() > bestMilege.calMileage())
		   {
			   bestMilege = a;
		   }
	   }
	   
	  System.out.println(bestMilege.getModel()+" ==> "+bestMilege.calMileage());
    }
}