// Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.


import java.util.*;
public class VCAPP
{ public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
	  char ch;
	  System.out.println("Enter character from keyboard");
	  ch=xyz.nextLine().charAt(0);
	  if(ch>=65 && ch<=90)
	  { ch=(char)(ch+32);
	  }
	  switch(ch)
	  {
	     case 'a','i','o','u','e':
		 
		 System.out.println("Vowel");
		 break;
		 default:
		  System.out.println("Consonent");
	  }
   }
}

