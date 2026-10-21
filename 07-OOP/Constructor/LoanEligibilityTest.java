/* Create a class LoanApplicant with:
Fields: name, age, annualIncome, creditScore, existingLoans
Constructor: Initialize all fields.
Logic Method: isEligible()
 Return true only if all the following conditions match:
age between 21 and 55
annualIncome ≥ 3,50,000
creditScore ≥ 700
existingLoans < 3
If creditScore is between 650–699 → income must be ≥ 5,00,000
If existingLoans = 2 → creditScore must be ≥ 750
Task:
 Create 3 applicants and check eligibility for each.
Focus: Compound conditions + nested logic + constructor handling.
*/

import java.util.*;
class LoanApplicant {

    String name;
    int age;
    double annualIncome;
    double creditScore;
    int existingLoans;   

    LoanApplicant(String name, int age, double annualIncome, double creditScore, int existingLoans) {
        this.name = name;
        this.age = age;
        this.annualIncome = annualIncome;
        this.creditScore = creditScore;
        this.existingLoans = existingLoans;
    }

    boolean isEligible() {

        // Age must be between 21 and 55
        if (age < 21 || age > 55) {
            return false;
        }

        // Existing loans must be less than 3
        if (existingLoans >= 3) {
            return false;
        }

        // Credit score rules
        if (creditScore >= 700) {
            if (annualIncome < 350000) {
                return false;
            }
        }
        else if (creditScore >= 650 && creditScore <= 699) {
            if (annualIncome < 500000) {
                return false;
            }
        }
        else {
            return false; // credit score < 650
        }

        // Special rule: if existingLoans == 2
        if (existingLoans == 2 && creditScore < 750) {
            return false;
        }

        return true;
    }
}

public class LoanEligibilityTest {
    public static void main(String[] args) {
        LoanApplicant prital = new LoanApplicant("Prital", 30, 400000, 710, 1);
        LoanApplicant gopal = new LoanApplicant("Gopal", 40, 480000, 680, 0);
        LoanApplicant aditya = new LoanApplicant("Aditya", 28, 600000, 720, 2);
        LoanApplicant pradnya = new LoanApplicant("Pradnya", 35, 350000, 650, 1);

        LoanApplicant[] applicants = {prital, gopal, aditya, pradnya};

        for (LoanApplicant applicant : applicants) {
            System.out.println(applicant.name + " eligibility: " + applicant.isEligible());
        }
    }
}	
	