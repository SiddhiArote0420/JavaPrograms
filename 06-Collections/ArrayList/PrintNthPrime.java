import java.util.*;
public class PrintNthPrime{

       public static void main(String[] args){
	   
	       Scanner sc = new Scanner(System.in);

	          System.out.println("enter the Nth number you want to print in series");
			  int n = sc.nextInt();
			  
			  int i=2;
			  int count =1;
			  
			  while(true){
				  
				  if(isPresent(i)){
					  count++;
				  }
				  
				  if(count == n)
				  {
					  System.out.println("Nth number is : "+i);
					  break;
				  }
				  
				  i++;
			  }
	   }
	   
	   public static boolean isPresent(int n){
		   for(int i = 2; i<=n/2; i++)
		   {
			   if(n%i==0){
				    return false;
			   }
		   }
		   return true;
	   }
}