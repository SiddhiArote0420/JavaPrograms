/*Loan Interest System
Concept: Abstract class + financial logic
Conditions:
Abstract class Loan
Fields: amount, years
Abstract method calculateInterest()
Loan Types:
HomeLoan → 7%
CarLoan → 9%
PersonalLoan → 12%
If years > 5 → reduce interest by 1%
Logic:
 Percentage logic + conditional reduction.*/
 

import java.util.*;

abstract class Loan {
    double amount;
    int years;

    Loan(double amount, int years) {
        this.amount = amount;
        this.years = years;
    }

    public abstract void calculateInterest();
}

class HomeLoan extends Loan {
    HomeLoan(double amount, int years) {
        super(amount, years);
    }

    public void calculateInterest() {
        double rate = 0.07;

        if (years > 5) {
            rate = rate - 0.01;
        }

        double interest = amount * rate * years;
        System.out.println("Home Loan Interest: " + interest);
    }
}

class CarLoan extends Loan {
    CarLoan(double amount, int years) {
        super(amount, years);
    }

    public void calculateInterest() {
        double rate = 0.09;

        if (years > 5) {
            rate = rate - 0.01;
        }

        double interest = amount * rate * years;
        System.out.println("Car Loan Interest: " + interest);
    }
}

class PersonalLoan extends Loan {
    PersonalLoan(double amount, int years) {
        super(amount, years);
    }

    public void calculateInterest() {
        double rate = 0.12;

        if (years > 5) {
            rate = rate - 0.01;
        }

        double interest = amount * rate * years;
        System.out.println("Personal Loan Interest: " + interest);
    }
}

public class LoanApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter loan years: ");
        int years = sc.nextInt();

        System.out.println("Choose Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Car Loan");
        System.out.println("3. Personal Loan");

        int choice = sc.nextInt();

        Loan loan;

        if (choice == 1) {
            loan = new HomeLoan(amount, years);
        } else if (choice == 2) {
            loan = new CarLoan(amount, years);
        } else if (choice == 3) {
            loan = new PersonalLoan(amount, years);
        } else {
            System.out.println("Invalid choice");
            return;
        }

        loan.calculateInterest();
    }
}
