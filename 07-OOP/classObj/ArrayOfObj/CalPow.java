/*WAP to create class name as Power with function 
  void setNum(): this function accept two values first is base and second is index 
  void showPower(): this function can calculate the power of two numbers and display it.
*/

import java.util.*;
class Power{
    int base;
	int index;
	
	void setNum(int base, int index)
	{
		this.base = base;
		this.index = index;
	}
	
	void showPower()
	{
		int pow = 1;
		for(int i=1; i<=index ; i++)
		{
			 pow = pow * base;
		}
		System.out.println("Power is: "+pow);
	}


}

public class CalPow{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Base: ");
		int base = sc.nextInt();
		
		System.out.println("Enter the Index: ");
		int index = sc.nextInt();
		
		Power p = new Power();
		p.setNum(base, index);
		p.showPower();
	}
}