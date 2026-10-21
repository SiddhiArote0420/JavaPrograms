/*5.Create a Box class with fields length, width, height.
Initialize them with a constructor.
Write a method isValidVolume() that checks volume:
If volume > 0 → Print “Valid box”
 Else → Print “Invalid dimensions”
Concepts Used:
 ✔ Constructor
 ✔ Logical condition (volume > 0)
 ✔ Multiplication operation
Explanation:
 A box is valid only if all dimensions are positive, so the volume remains > 0.
*/

import java.util.*;

class Box{
  private float length;
  private float width;
  private float height;
  
  Box(float length, float width, float height)
  {
	  this.length = length;
	  this.width = width;
	  this.height = height;
  }
  
  public void isValidVolume(){
	  float volume = length * width * height;
	  if(volume > 0)
	  {
		System.out.println("Valid box");
	  }else{
        System.out.println("Invalid dimensions");
	  }
  }	  

}

public class Volume{
	public static void main(String[] aegs)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		float length = sc.nextFloat();
		
		System.out.println("Enter the width");
		float width = sc.nextFloat();
		
		
		System.out.println("Enter the height");
		float height = sc.nextFloat();
		
		Box b = new Box(length, width, height);
		b.isValidVolume();
	}
}