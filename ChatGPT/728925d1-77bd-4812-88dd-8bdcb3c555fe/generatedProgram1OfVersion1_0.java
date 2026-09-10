// Java program to create a basic thread that prints Hello

// Create a class that implements the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Print Hello
        System.out.println("Hello");
    }
}

// Create an instance of the MyRunnable class
MyRunnable runnable = new MyRunnable();

// Create a new thread and pass the runnable object to it
Thread thread = new Thread(runnable);

// Start the thread
thread.start();
