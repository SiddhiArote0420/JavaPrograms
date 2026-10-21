/* Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.*/
 
 
 import java.util.*;
 class BankAccount{
    
	double principle;
	int time;
	
	void setActDetails(double p,int t){
		this.principle = p;
		this.time = t;
	}
	
	void culateInterest()
	{
		System.out.println("Interest calculation not defined for base class");
	}
		
 }
 //Inheritance
 class SavingsAccount extends BankAccount{
	 //Method Overriding
	 void culateInterest(){  
		 int interest = 5;
		 double Interest = (principle*interest*time)/100;
		 System.out.println("Savings Account Interest is: "+Interest);
	 }
 
 }
 //Inheritance
 class CurrentAccount extends BankAccount{
	 //Method Overriding
    void culateInterest(){
		 int interest = 3;
		 double Interest = (principle*interest*time)/100;
		 System.out.println("Current Account Interest is: "+Interest);
	 }
 }
 
 public class BankManagement{
  public static void main(String[] x)
  {
    SavingsAccount s = new SavingsAccount();
	s.setActDetails(5000,3);
	s.culateInterest();
	
	CurrentAccount c = new CurrentAccount();
	c.setActDetails(2000,2);
	c.culateInterest();
	
  
  }
}