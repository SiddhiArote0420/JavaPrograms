/* Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.
*/

import java.util.*;
public class DisplaySeason
{
	public static void main(String x[])
	{
		Scanner seasonDisplay = new Scanner(System.in);
		
		System.out.println("Enter the Month number");
		int monthNo = seasonDisplay.nextInt();
		
		if(monthNo == 1 || monthNo == 2 || monthNo == 12){
			System.out.println("Season is a  Winter");
		}else if(monthNo >=3 && monthNo <= 5){
			System.out.println("Season is a  Spring");
		}else if(monthNo >= 6 && monthNo <= 8){
			System.out.println("Season is a  Summer");
		}else if(monthNo >=9 && monthNo <= 11){
			System.out.println("Season is a  Autumn ");
		}else{
			System.out.println("Invalid Month");
		}
	}
}