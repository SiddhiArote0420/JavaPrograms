// Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.
//·        Example: a → A, Z → z.

/*import java.util.*;
public class CaseConverter
{
	public static void main(String x[])
	{
		Scanner charCaseToggle = new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		char ch = charCaseToggle.next().charAt(0);
	
		int ascii =  (int)ch;
		int result = (ascii >= 65 && ascii <= 90)? (ascii+32) : (ascii-32);

        char toggleChar = (char)result;		
		
		System.out.println("Toggled character is: " + toggleChar);
	}
}
*/
import java.util.*;
public class CaseConverter
{
	public static void main(String[] x)
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the character");
		char ch = ob.next().charAt(0);
		
		int num = (int)ch;
		System.out.println(num);
		int result = (num >= 65 && num <= 90)?(num + 32):(num - 32);
		
		char a = (char)result;
		System.out.println(a);
	}
}
		
