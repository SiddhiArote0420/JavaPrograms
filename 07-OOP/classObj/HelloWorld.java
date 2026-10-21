/*1. Create a Class and Print a Message
Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called.
*/



class HelloWorld {

    void printMessage() {
        System.out.println("Hello, World!"); // Display message
    }

    // Main method: program execution starts here
    public static void main(String[] args) {
        // Create an object of the HelloWorld class
        HelloWorld obj = new HelloWorld();

        // Call the printMessage method using the object
        obj.printMessage();
    }
}
