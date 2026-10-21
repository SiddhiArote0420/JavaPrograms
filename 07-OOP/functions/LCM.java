/* Write a function to find the LCM of two numbers using HCF.*/

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = findLCM(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

   
    public static int GCDCal(int n1, int n2)
   { int gcd = 0;
	 for(int i=1 ; i<=n1/2 && i<=n2/2 ; i++)
	  {
		if(n1%i==0 && n2%i==0)
		{	
	      if(gcd < i)
			gcd = i;  
	    }
	  }
	   return gcd ;          
    }
		
	public static int findLCM(int a, int b) {
      int gcd = GCDCal(a, b);
        return (a * b) / gcd;
    }
}
