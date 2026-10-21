// Write a java program to enter a number and print it in words.


import java.util.*;

public class NoInWord1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = ob.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Number out of range!");
            return;
        }

        int temp = num;

        // Thousands place
        if (temp >= 1000) {
            int thousands = temp / 1000;
            switch (thousands) {
                case 1: System.out.print("One Thousand "); break;
                case 2: System.out.print("Two Thousand "); break;
                case 3: System.out.print("Three Thousand "); break;
                case 4: System.out.print("Four Thousand "); break;
                case 5: System.out.print("Five Thousand "); break;
                case 6: System.out.print("Six Thousand "); break;
                case 7: System.out.print("Seven Thousand "); break;
                case 8: System.out.print("Eight Thousand "); break;
                case 9: System.out.print("Nine Thousand "); break;
            }
            temp = temp % 1000;
        }

        // Hundreds place
        if (temp >= 100) {
            int hundreds = temp / 100;
            switch (hundreds) {
                case 1: System.out.print("One Hundred "); break;
                case 2: System.out.print("Two Hundred "); break;
                case 3: System.out.print("Three Hundred "); break;
                case 4: System.out.print("Four Hundred "); break;
                case 5: System.out.print("Five Hundred "); break;
                case 6: System.out.print("Six Hundred "); break;
                case 7: System.out.print("Seven Hundred "); break;
                case 8: System.out.print("Eight Hundred "); break;
                case 9: System.out.print("Nine Hundred "); break;
            }
            temp = temp % 100;
        }

        // Tens and Units place
        if (temp >= 20) {
            int tens = temp / 10;
            switch (tens) {
                case 2: System.out.print("Twenty "); break;
                case 3: System.out.print("Thirty "); break;
                case 4: System.out.print("Forty "); break;
                case 5: System.out.print("Fifty "); break;
                case 6: System.out.print("Sixty "); break;
                case 7: System.out.print("Seventy "); break;
                case 8: System.out.print("Eighty "); break;
                case 9: System.out.print("Ninety "); break;
            }
            temp = temp % 10;  // process unit
        }

        // Handle 1 to 19
        if (temp > 0 && temp < 20) {
            switch (temp) {
                case 1: System.out.print("One"); break;
                case 2: System.out.print("Two"); break;
                case 3: System.out.print("Three"); break;
                case 4: System.out.print("Four"); break;
                case 5: System.out.print("Five"); break;
                case 6: System.out.print("Six"); break;
                case 7: System.out.print("Seven"); break;
                case 8: System.out.print("Eight"); break;
                case 9: System.out.print("Nine"); break;
                case 10: System.out.print("Ten"); break;
                case 11: System.out.print("Eleven"); break;
                case 12: System.out.print("Twelve"); break;
                case 13: System.out.print("Thirteen"); break;
                case 14: System.out.print("Fourteen"); break;
                case 15: System.out.print("Fifteen"); break;
                case 16: System.out.print("Sixteen"); break;
                case 17: System.out.print("Seventeen"); break;
                case 18: System.out.print("Eighteen"); break;
                case 19: System.out.print("Nineteen"); break;
            }
        }

        System.out.println(); // End line
        ob.close();
    }
}
