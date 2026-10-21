/*A telecom company has plans for Prepaid and Postpaid users.
 Bill calculation changes based on type.
Requirement:
Create parent class UserPlan.
 Create child classes Prepaid and Postpaid.
 Use parent reference to calculate total bill.
Input: User Type: Prepaid
Calls Used: 120
Rate Per Call: 1
Output: Total Bill for Prepaid User: 120
Explanation:
Main class should depend on the parent reference:
 UserPlan plan = new Prepaid();
 Switching to Postpaid must be possible easily → Loose Coupling.
 */
 
 
 import java.util.*;
 class UserPlan{
   int useCall;
   int ratePerCall;
   void setUserPlan(int useCall, int ratePerCall)
   {
      this.useCall = useCall;
	  this.ratePerCall = ratePerCall;
	}
	
	void calculateBill()
	{
	  //
	}
	
 }
 class Prepaid extends UserPlan{
    void calculateBill()
	{
	  System.out.println("Total Bill for Prepaid User: "+ (useCall*ratePerCall));
	}
 }
 class Postpaid extends UserPlan{
    void calculateBill()
	{
	  System.out.println("Total Bill for Postpaid User: "+ (useCall*ratePerCall));
	}
 }
 
 class CalBill{
   
   void printResult(UserPlan u){
     u.calculateBill();
	}
 
 }
 
 public class TelecomCompanyBill{
	 public static void main(String[] x)
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Your plan(prepaid / postpaid)");
		 String plan = sc.nextLine();
		 
		 System.out.println("Enter Calls Used");
		 int useCall = sc.nextInt();
		 
		 System.out.println("Enter Rate Per Call");
		 int ratePerCall = sc.nextInt();
		 
		 UserPlan u;
		 if(plan.equalsIgnoreCase("prepaid"))
		 {
			 u = new Prepaid();
		 }else{
			 u = new Postpaid();
		 }
		 
		 u.setUserPlan(useCall, ratePerCall);
		 CalBill b = new CalBill();
		 b.printResult( u);
	 }
 }
  