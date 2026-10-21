/*
0        0
01      10
010    010
0101  1010
0101001010


0        0
10      01
010    010
1010  0101
0101010101
*/

/*import java.util.*;
public class Pattern_47_test
{
   public static void main(String x[])
   {
	   boolean flag = true; int a=0;
     for(int i = 1; i<=5 ; i++)
	 {    //int a=0;
	   for(int j = 1; j<=10 ; j++)
	   {
	     if( j<=i || j>= 11-i)
		 {  
		    System.out.print(a);
			a= 1-a;
		 }else{
			   System.out.print(" ");
			   if(j==5)
				   a=0;
		   }
			   
		}System.out.println();
	 }
	}
}*/

public class Pattern_47_test{
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // LEFT pattern
            for (int j = 0; j <= i; j++) {
                System.out.print(j % 2);
            }

            // MIDDLE spaces
            for (int s = 0; s < 2 * (n - i) - 1; s++) {
                System.out.print(" ");
            }

            // RIGHT pattern
            for (int j = 0; j <= i; j++) {
                System.out.print((j + i) % 2);
            }

            System.out.println();
        }
    }
}

