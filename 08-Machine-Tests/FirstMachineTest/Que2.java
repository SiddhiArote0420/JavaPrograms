//Write a java program swap two number without using third variable. 

import java.util.*;
public class Que2
{
 public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 /*System.out.println("Enter the First Number");
	 int a = sc.nextInt();
	 
	 System.out.println("Enter the Second Number");
	 int b = sc.nextInt();
	 
	 a = a+b;
	 b = a-b;
	 a = a-b;
	  System.out.println("a = "+a);
	  System.out.println("b = "+b);*/
	

/*
int a = 0;
if (false && ++a == 1)
    System.out.println("True");
System.out.println(a);
*/

/*int z = -5;
++z += (z++ - 9) + ++z;
System.out.println(z);*/

/*byte b = -10;  //  Valid: -10 is within byte range (-128 to 127)

byte c = 200;  //  Compile-time error
System.out.println(b);
System.out.println(c);*/

/*int a =4;
int b=2;
System.out .println(a&b);
System.out .println(a^b);*/

int x=0;
String b=((x++ == 1)? "Yes":(++x ==1) ? "No" : "Yes");
System.out.println(b);













	   
	  
 }
}