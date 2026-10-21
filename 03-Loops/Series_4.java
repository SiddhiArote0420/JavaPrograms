/*Write a java program to display following series :
           	1  2  4  7  11  16  22  29  37  46.
*/

import java.util.*;
public class Series_4
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the Limit ");
	 int limit = sc.nextInt();
	 
	 int n = 0,num=1,count=0;
	 while(count<=limit)
	 { 
        num = num+1;
        int a = num+n; 
        System.out.println(a);
		num = a;
		n++;
		count++;
	 }
 }
}