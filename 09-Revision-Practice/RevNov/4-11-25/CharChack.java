/* Write program to create class name as CheckChar with two functions
        void setChar(char ch): this function accept single character as input
      boolean checkChar(): this function can check character is alphabet or digit of special  symbol if
	  character is alphabet or digit return true if character is digit then return false.
*/


import java.util.*;
public class CharChack
 {
	 public static void main(String x[])
	 {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		char ch = sc.nextLine().charAt(0);
		
		CheckChar check = new CheckChar();
		check.setChar(ch);
		boolean result = check.checkChar();
		
		
		if(result)
		{
			System.out.println("It is a Character");
		}else{
			System.out.println("It is Not Character");
		}
	 }
 }
 class CheckChar{
	 private char ch;
	 
	 void setChar(char ch)
	 {
		 this.ch = ch;
	 }
	 
	 public boolean checkChar(){
		 boolean flag = false;
		 if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		 {
            flag = true;
		 }
		 return flag;
	 }
 }

            			 