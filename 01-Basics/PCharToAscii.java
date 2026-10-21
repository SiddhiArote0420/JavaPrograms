// print character for a given ASCII value

public class PCharToAscii
{ 
    public static void main(String x[])
	{
	
	int ascii = Integer.parseInt(x[0]);
	char cha = (char)ascii;
	
	System.out.println("character of given ascii value: "+ cha);
	}
}