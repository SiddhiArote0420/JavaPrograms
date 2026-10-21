/*Find Maximum of Two Numbers
Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.
*/

/*Find Maximum of Two Numbers
Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.
*/

import java.util.*;

public class FindMax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Call the function
        int result = findMax(num1, num2);

        System.out.println("Max is: " + result);
    }

    // function that returns maximum of two numbers
    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

