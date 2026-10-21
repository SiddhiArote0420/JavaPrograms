/*Write a java program to check Number Is Armstrong Number or Not Armstrong using 
function recursion.*/


import java.util.Scanner;

class Armstrong {

    // to store sum
    static int sum = 0;

    // function to count digits (recursion)
    static int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    // function to calculate power (recursion, no inbuilt)
    static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }

    // function to check Armstrong (recursion)
    static void checkArmstrong(int n, int original, int digits) {
        if (n == 0) {
            if (sum == original)
                System.out.println(original + " is Armstrong Number");
            else
                System.out.println(original + " is NOT Armstrong Number");
            return;
        }

        int digit = n % 10;
        sum = sum + power(digit, digits);
        checkArmstrong(n / 10, original, digits);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int digits = countDigits(num);
        checkArmstrong(num, num, digits);
    }
}