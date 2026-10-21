/*Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 1 
while pressing the volume down button decreases the volume by 1. The chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.
Input Format
*/

import java.util.*;
public class TvVolume
{
	public static void main(String x[])
	{
		Scanner volumeTv = new Scanner(System.in);
		
		System.out.println("Enter the Current Volume : ");
		int xx = volumeTv.nextInt();
		
		System.out.println("Enter the Want Change : ");
		int yy = volumeTv.nextInt();
		
		int pressButton,a;
		
		if(xx < yy){
			a = yy - xx;
			pressButton = a*1;
		}else {
			a = xx - yy;
			pressButton = a*1;
		}
			System.out.println("Prese Button :"+pressButton);
	}
}
		
  