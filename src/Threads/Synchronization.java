package Threads;

public class Synchronization {
    public static class MathClass
    {
        private final static Object obj = new Object();
         void printNumbers(int n) throws InterruptedException
        {
            synchronized (obj)
            {
                for (int i = 1; i <= n; i++)
                {
                    System.out.println(Thread.currentThread().getName() + " :: "+  i);
                    Thread.sleep(500);
                }
            }
        }
    }
    public static void main(String args[])
    {
        MathClass mathClass = new MathClass();
        Runnable r = new Runnable()
        {
            public void run()
            {
                try {
                    mathClass.printNumbers(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r, "ONE").start();
        new Thread(r, "TWO").start();
    }
}
