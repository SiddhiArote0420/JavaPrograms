//Write a java program to check whether number is palindrome or not palindrome using   
//ternary operators. 

import java.util.*;
public class Que4
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the Number(enter only 3 digit)");
	 int num = sc.nextInt();
	 
	 int rev = (num%10)*100+((num/10)%10)*10+ num/100;
	 System.out.println("Rev :"+rev);
	 
	 String result = (num == rev)? "Number is Palindrome" : "Number is Not Palindrome";
	 System.out.println(result);
 }
}