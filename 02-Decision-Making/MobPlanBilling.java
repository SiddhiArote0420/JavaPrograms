/* Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.
*/
 import java.util.*;
 public class MobPlanBilling
 {
	 public static void main(String x[])
	 {
		 Scanner planBilling = new Scanner(System.in);
		 
		 System.out.println("Enter the Minutes used in month : ");
		 int minutes = planBilling.nextInt();
		 
		 double bill, min;
		 
		 if(minutes > 0 && minutes <= 100)
		 {
			 bill = 199;
		 }else if(minutes >= 101 && minutes <= 300){
			 //min = minutes - 100;
			  //bill = 199 + min*1;
			  bill = 199 + (minutes - 100)*1;
	     }else if (minutes >= 301 && minutes <= 500){
			 //min = minutes - 100;
			 //bill = 199 + min*1.5;
			 bill = 199 + (minutes - 100)*1;
         }else {
			 //min = minutes - 100;
			 //bill = 199 + min*2;
			 bill = 199 + (minutes - 100)*1;
		 }
		 System.out.println("Total Monthly Bill : "+bill);
		 
		}
	}
		 