package Threads;

public class PrintSequenceUsingThreads implements Runnable {

    public int PRINT_NUMBERS_UPTO = 10;
    static int number = 1;
    int remainder;
    static Object lock = new Object();
    PrintSequenceUsingThreads(int remainder){
        this.remainder = remainder;
    }
    @Override
    public void run(){
        while(number < PRINT_NUMBERS_UPTO-1){
            synchronized (lock){
                while(number % 3!= remainder){
                    try{
                        System.out.println("Thread is waiting: "+Thread.currentThread().getName());
                        lock.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+ "  "+number);
                number++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String args[]){
        PrintSequenceUsingThreads runnable1 = new PrintSequenceUsingThreads(1);
        PrintSequenceUsingThreads runnable2 = new PrintSequenceUsingThreads(2);
        PrintSequenceUsingThreads runnable3 = new PrintSequenceUsingThreads(0);

        Thread t1 = new Thread(runnable1,"T1");
        Thread t2 = new Thread(runnable2,"T2");
        Thread t3 = new Thread(runnable3,"T3");

        t3.start();
        t2.start();
        t1.start();

    }
}
