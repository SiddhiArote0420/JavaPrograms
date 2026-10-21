/* Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate a cube of a number and return it.
*/

import java.util.*;
 class Cube
{   int x;
	void setValue(int x)
	{
		this.x = x;
	}
	int getCube(){
		int cube = x*x*x;
		return cube;
	}
}
public class CubeApp{	
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	
	Cube obj = new Cube();
	obj.setValue(n);
	int result = obj.getCube();
	System.out.println("Cube is:"+result);
}
}