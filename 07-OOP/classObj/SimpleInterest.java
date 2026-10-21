/* Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
*/

import java.util.Scanner;
class SimpleInterest{
 void calInterest(int p,int r, int t)
 {
    double si = ((p*r*t)/100);
   System.out.println("Simple interest : "+si);
 }
 
public static void main (String x[]){
  SimpleInterest obj = new SimpleInterest();
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Principal amount");
  int p =  sc.nextInt();
  
  System.out.println("Enter the Rate of interest per year");
  int r =  sc.nextInt();
  
  System.out.println("Enter the Time period");
  int t =  sc.nextInt();

  obj.calInterest(p,r,t);
}  
}