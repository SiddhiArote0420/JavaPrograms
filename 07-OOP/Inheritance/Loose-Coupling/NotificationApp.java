/*App sends notifications through SMS or Email.
 Logic for sending notification must be switchable.
Requirement:
Create parent class Notification.
 Create SMSNotification and EmailNotification classes.
 Use parent reference to trigger notification message.
Input : Notification Type: SMS
Message: "Order Confirmed"
Output:SMS Sent: Order Confirmed
Explanation:
Your main code should use:
 Notification n = new SMSNotification();
 Switching to Email should not disturb core logic, giving loose coupling.

*/
import java.util.Scanner;

// Parent class
class Notification {
    String message;

    void setMessage(String message) {
        this.message = message;
    }

    void sendNotification() {
        // overridden by child classes
    }
}

// Child class for SMS
class SMSNotification extends Notification {

    @Override
    void sendNotification() {
        System.out.println("SMS Sent: " + message);
    }
}

// Child class for Email
class EmailNotification extends Notification {

    @Override
    void sendNotification() {
        System.out.println("Email Sent: " + message);
    }
}

// Sender class (loose coupling)
class SendNotification {

    void notify(Notification n) {
        n.sendNotification();   // parent reference
    }
}

// Main class
public class NotificationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Notification Type (SMS / EMAIL): ");
        String type = sc.nextLine();

        System.out.println("Enter Message: ");
        String message = sc.nextLine();

        Notification n;

        if (type.equalsIgnoreCase("SMS")) {
            n = new SMSNotification();
        } else {
            n = new EmailNotification();
        }

        n.setMessage(message);

        SendNotification sender = new SendNotification();
        sender.notify(n);   // core logic never changes
    }
}
/*
// Parent class (same as Circle)
class Notification {
    String message;

    void setMessage(String message) {
        this.message = message;
    }

    void send() {
        // placeholder method
    }
}

// Child class (same as Area)
class SMSNotification extends Notification {

    void send() {
        System.out.println("SMS Sent: " + message);
    }
}

// Child class (same as Cirm)
class EmailNotification extends Notification {

    void send() {
        System.out.println("Email Sent: " + message);
    }
}

// Calculator/Processor class (same as CircleCalculator)
class NotificationSender {

    void sendNotification(Notification n) {
        n.send();   // runtime polymorphism
    }
}

// Main class (same as CircleCalculatorApplication)
public class NotificationApp {

    public static void main(String[] args) {

        NotificationSender sender = new NotificationSender();

        Notification n = new SMSNotification();
        n.setMessage("Order Confirmed");
        sender.sendNotification(n);   // behaves as SMS

        n = new EmailNotification();
        n.setMessage("Order Confirmed");
        sender.sendNotification(n);   // behaves as Email
    }
}
*/