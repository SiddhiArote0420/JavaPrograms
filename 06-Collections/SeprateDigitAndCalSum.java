/*. WAP to input string and separate digit from string and calculate its sum? 
Example: abc123mno456; 
Output:1+2+3+4+5+6 =21 */


import java.util.*;
public class SeprateDigitAndCalSum{
    public static void main(String x[]){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the String in lowercase");
		String s = sc.nextLine();
		
		String newStr ="";
		char[] ch = s.toCharArray();
		
		int sum =0;
		for(int i=0; i<ch.length;i++)
		{   
	        if(ch[i] >= '0' && ch[i]<= '9')
			{
				//int a = (int)(ch[i]) - 48;
				int a = Integer.parseInt(String.valueOf(ch[i]));
				sum += a;
				System.out.println(ch[i]+"->"+sum);
			}
		}
		System.out.println(sum);
    }
}