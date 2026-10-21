/*Q5. Online Payment System
Concepts: Interface, multiple implementations
 Operations:
Interface Payment
Method: makePayment(double amount)
Implementing classes:
CreditCardPayment
UPIPayment
Apply transaction charges:
Credit Card → 2%
UPI → 1%
Show final amount paid
Explanation:
 Interface defines common behavior, implementation differs.
*/


// Interface
interface Payment {
    void makePayment();
}

// Credit Card Payment
class CreditCardPayment implements Payment {

    double amount;

    // Constructor
    CreditCardPayment(double amount) {
        this.amount = amount;
    }

    public void makePayment() {
        double charge = amount * 0.02;   // 2% charge
        double finalAmount = amount + charge;

        System.out.println("Payment Mode: Credit Card");
        System.out.println("Transaction Charge: 2%");
        System.out.println("Final Amount Paid: " + finalAmount);
    }
}

// UPI Payment
class UPIPayment implements Payment {

    double amount;

    // Constructor
    UPIPayment(double amount) {
        this.amount = amount;
    }

    public void makePayment() {
        double charge = amount * 0.01;   // 1% charge
        double finalAmount = amount + charge;

        System.out.println("Payment Mode: UPI");
        System.out.println("Transaction Charge: 1%");
        System.out.println("Final Amount Paid: " + finalAmount);
    }
}

// Main Class
public class PaymentApp {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(1000);
        p1.makePayment();

        System.out.println();

        Payment p2 = new UPIPayment(1000);
        p2.makePayment();
    }
}
