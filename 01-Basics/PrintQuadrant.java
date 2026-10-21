//Given (x, y), print quadrant I, II, III, IV or "Axis".
 
 import java.util.*;
 public class PrintQuadrant
 {
	 public static void main(String args[])
	 {
		 Scanner quadrantPrint = new Scanner(System.in);
		 
		 System.out.println("Enter x-Axix :");
		 int x = quadrantPrint.nextInt();
		 
		 System.out.println("Enter y-Axix :");
		 int y = quadrantPrint.nextInt();
		 
		 String quadrant = (x > 0 && y > 0)? " Quadrant I":
		                   (x < 0 && y > 0)? " Quadrant II":
						   (x < 0 && y < 0)? " Quadrant III": "Quadrant IV";
						   
		 System.out.println(quadrant);
	 }
 }