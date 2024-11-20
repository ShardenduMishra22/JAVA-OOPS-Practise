class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running!");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Example 1: Using Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();  // This will invoke the run() method for MyRunnable

        // Example 2: Using Thread class
        MyThread thread2 = new MyThread();
        thread2.start();  // This will invoke the run() method for MyThread
    }
}

// Why Use Threads?
// Efficiency: Multithreading allows tasks to be processed simultaneously, improving performance (especially on multi-core processors).
// Responsiveness: In GUI applications, one thread can handle user input while others can perform background tasks without freezing the interface.

// What are Threads?
// In both Java and computer science in general, a thread is a unit of execution within a process. A thread runs a sequence of instructions, and multiple threads can run in parallel, allowing programs to perform multiple tasks at once. This is known as multithreading.

// Threads can be thought of as the smallest unit of processing that can be scheduled by the operating system. In Java, each thread has its own execution path and works independently, but they share resources such as memory with other threads in the same process.

// Non-code Example (for General Understanding)
// Imagine you’re at a restaurant:

// One thread could be the chef preparing food.
// Another thread could be the waiter serving food.
// Both tasks are happening at the same time, independently of each other, and they’re working in parallel to make the entire process of serving food efficient.
// In a program, threads work similarly, allowing different tasks to be done at the same time (e.g., one thread can handle user input while another handles background tasks like downloading data).