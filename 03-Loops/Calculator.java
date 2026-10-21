/* Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/


	
	// Calculator class with basic arithmetic operations
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b; // cast to double for precise result
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    // Main method
    public static void main(String[] args) {
        Calculator obj = new Calculator(); // create object

        int num1 = 20;
        int num2 = 5;

        // Call methods and print results
        System.out.println("Addition: " + obj.add(num1, num2));
        System.out.println("Subtraction: " + obj.subtract(num1, num2));
        System.out.println("Multiplication: " + obj.multiply(num1, num2));
        System.out.println("Division: " + obj.divide(num1, num2));
    }
}
