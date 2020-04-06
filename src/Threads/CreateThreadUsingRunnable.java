package Threads;

public class CreateThreadUsingRunnable implements Runnable {

    public void run(){
        System.out.print("As am implementing Runnable, run() should be overrided for sure");
    }

    public static void main(String args[]){
        CreateThreadUsingRunnable obj = new CreateThreadUsingRunnable();
        obj.run();
        // if we call run() directly it will execute the code in run() without creating any thread.
        // The above code means the main thread is running using Runnable.
        CreateThreadUsingRunnable obj1 = new CreateThreadUsingRunnable();
        Thread thread = new Thread(obj1);
        thread.start();
        // if we call start(), it creates a new thread and executes the code in run()
        // The above code means we can explicitly create a thread for the runnable class obj and start the thread.
    }
}
