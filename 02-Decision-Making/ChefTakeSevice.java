/*The chef has to travel to another place. For this, he can avail any one of two cab services.
·        The first cab service charges XX rupees.
·        The second cab service charges YY rupees.
The chef wants to spend the minimum amount of money. Which cab service should the Chef take?
*/

import java.util.*;
public class ChefTakeSevice
{
	public static void main(String x[])
	{
		Scanner cabSrvice = new Scanner(System.in);
		
		System.out.println(" The first cab service charges rupees : ");
		int xx = cabSrvice.nextInt();
		
		System.out.println(" The second cab service charges rupees : ");
		int yy = cabSrvice.nextInt();
		
		if(xx < yy)
		{
			System.out.println("Chef take sevice from 1st cab");
		}else if(xx > yy)
		{
			System.out.println("Chef take sevice from 2st cab");
		}else
		{	
			System.out.println("Chef take sevice from Any cab");
		}
	}
}
	