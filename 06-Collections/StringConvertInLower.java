/*. WAP to input string and convert lower case string to upper case without using 
toUpperCase() */


import java.util.*;
public class StringConvertInLower{
      public static void main(String x[]){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the String in lowercase");
		String s = sc.nextLine();
		
		String newStr ="";
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{   
	       if(ch[i] >= 'a' && ch[i] <='z'){
		   char c = (char) ((int)ch[i] - 32);
			newStr = newStr + c;
		   }else{
			   newStr = newStr + ch[i];
		   }
		}
		
		System.out.println(newStr);

	  }
}