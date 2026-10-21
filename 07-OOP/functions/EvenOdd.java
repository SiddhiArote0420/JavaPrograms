/*Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.
*/

import java.util.*;
public class EvenOdd
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Number");
      int n = sc.nextInt();

      boolean result = isEven(n);  // call the function

      if (result) {
          System.out.println("Number is Even");
      } else {
          System.out.println("Number is Odd");
      }
  }

  // function that returns true if number is even, false otherwise
  public static boolean isEven(int n)
  {
      return n % 2 == 0;
  }
}
