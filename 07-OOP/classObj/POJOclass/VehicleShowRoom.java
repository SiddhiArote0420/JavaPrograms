/* WAP to create POJO class name as Vehicle with field id, name and price and we have one
more class name as ShowRoom with two methods

void setVehicle(Vehicle vehicle): this method can accept Vehicle as parameter
void showVehicle(): this method can show the vehicle details
*/

import java.util.*;
class Vehicle{
   private int  id;
   private String name;
   private int price;
   
   void setId(int id) { this.id = id; }
   int getId(){ return id; }
	
	void setName(String name){  this.name = name; }
	String getName(){ return name; }
	 
	void setPrice(int price){ this.price = price; }
    int getPrice(){ return price; }

}
class ShowRoom{
	Vehicle v ;
	void setVehicle(Vehicle v)
	{
		this.v = v;
	}
	
	void showVehicle(){
		System.out.println("Vehicle Id: "+v.getId());
		System.out.println("Vehicle Name: "+v.getName());
		System.out.println("Vehicle Price: "+ v.getPrice());
	}
		

}

public class VehicleShowRoom{
  public static void main(String[] x)
  {
  
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Id of Vehicle: ");
	int id = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter the Name of Vehicle: ");
	String name = sc.nextLine();
	
	System.out.println("Enter the Price of vehicle: ");
	int price = sc.nextInt();
	
	Vehicle v = new Vehicle();
	v.setId(id);
	v.setName(name);
	v.setPrice(price);
	
	ShowRoom s = new ShowRoom();
	s.setVehicle(v);
	s.showVehicle();
	
  }
}
	
	