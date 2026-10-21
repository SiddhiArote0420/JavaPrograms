import java.util.*;
public class PrintNthFibonacci{

       public static void main(String[] args){
	   
	       Scanner sc = new Scanner(System.in);

	          System.out.println("enter the Nth number you want to print in series");
			  int n = sc.nextInt();
			  
			  int a=0, b=1;
			  int count = 2;
			  
			  while(true){
				  
				  int temp = b;
				  b= b+a;
				  a= temp;
				  count++;
				  
				  if(count == n)
				  {
					  System.out.println( b);
					  break;
				  }
			  }
	   }
}
				  