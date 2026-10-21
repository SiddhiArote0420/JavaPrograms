/* Print Parity and Divisibility by 3.
Print :
"Even & Div by 3"
"Even"
"Div by 3"
"None"
*/

import java.util.*;
public class ParityNo
{
	public static void main(String x[])
	{
		Scanner parity_no = new Scanner(System.in);
		
		System.out.println("Enter first digit:");
		int num = parity_no.nextInt();
		
		String prity = (num%2==0 && num%3==0)? "Even & Div by 3":
		               (num%2==0 && num%3!=0)? "Even":
					   (num%2!=0 && num%3==0)? "Div by 3" :"None";
					   
	    System.out.println(prity);
	}
}