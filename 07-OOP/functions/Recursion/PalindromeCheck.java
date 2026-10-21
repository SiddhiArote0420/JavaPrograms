/*Write a program to check whether a given number is a palindrome using recursion*/

import java.util.*;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }
	
    private static int reverse(int n, int rev) {
        if (n == 0) {                     
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }
}
