/* Create a class Compare that extends a base class Value and overrides getResult() to return the greater of the two numbers.
Create another class Check that accepts only a Compare object and displays the result.
Demonstrate tight coupling by passing only Compare object to Check.

Input : Enter numbers: 12 7
Output : Greater number is 12
*/

import java.util.*;

class Value {
    int a, b;

    Value(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getResult() {
        return 0;
    }
}

class Compare extends Value {

    Compare(int a, int b) {
        super(a, b);
    }

    @Override
    int getResult() {   // corrected overriding method
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

class Check {

    // tight coupling: ONLY Compare object allowed
    void displayResult(Compare c) {
        int result = c.getResult();
        System.out.println("Greater number is " + result);
    }
}

public class GreaterNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Compare com = new Compare(a, b); // corrected constructor
        Check c = new Check();

        c.displayResult(com);  
    }
}


/*"In Java, constructor chaining ensures that the parent class’s constructor executes before the child class’s constructor.
 When I create a Compare object with parameters, the Compare constructor receives them first.
 Using super(a,b), it explicitly forwards those parameters to the Value constructor.
 Value initializes the fields a and b. Since Compare extends Value, these fields become directly accessible to Compare.
 Hence, the greater number logic works on inherited and initialized fields.*/