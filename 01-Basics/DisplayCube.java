// Write a Java program that reads a number and display the cube.

public class DisplayCube
 {
	 public static void main(String x[])
	 {
		 int num = Integer.parseInt(x[0]);
		 int cube = num*num*num;
		 
		 System.out.printf("Cube of "+num+" is:%d\n",cube);
	 }
 }