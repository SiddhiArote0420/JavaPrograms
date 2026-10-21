/*Write a Java program using a switch case to input a month number (1-12) and display the number of
 days in that month. Consider leap year for February.
Explanation:
 Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.*/
 
 
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        switch (month) {
            
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: 
                System.out.println("This month has 31 days.");
                break;

            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("February has 29 days (Leap Year).");
                } else {
                    System.out.println("February has 28 days.");
                }
                break;
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                System.out.println("This month has 30 days.");
                break;

            default:
                System.out.println("Invalid month number. Please enter 1 to 12.");
        }

        sc.close();
    }
}

	     
 