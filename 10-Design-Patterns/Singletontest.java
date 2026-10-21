// Singleton class
class Singleton {
    // Step 1: Create a private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Private constructor (so no one can create object from outside)
    private Singleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Step 3: Public method to get the single instance (thread-safe)
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Main test class
public class Singletontest {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton obj = Singleton.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName()
                    + " | Object HashCode: " + obj.hashCode());
        };

        // Creating 3 threads with names
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}