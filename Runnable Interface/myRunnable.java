//simple Java program that implements the Runnable interface:
class MyRunnable implements Runnable {
    // Implement the run() method from Runnable interface
    public void run() {
        // Code to execute when the thread is run
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        
        // Create a Thread object, passing MyRunnable instance as the target
        Thread thread = new Thread(myRunnable);
        
        // Start the thread
        thread.start();
    }
}
//OUTPUT : Thread is running...