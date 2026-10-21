


import java.util.*;
public class Que5
{
	public static int Series(int n,int limit){
		int y = n;
		int count=0;
		while(count <= limit)
		{
			System.out.print(y+" ");
			y = y*2;
			count++;
		}
		return y;
	}
 public static void main(String args[])
 { 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the limit");
    int limit = sc.nextInt();

    int n=3;
    Series(n,limit);	
  } 
}
