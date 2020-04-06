package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelismInThread {
    public static void processTask(String name){
        System.out.println(name);
        //return name;
    }
    public static void main(String args[]){
        //ParallelismInThread parallelismInThread = new ParallelismInThread();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running 1st thread");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running 2nd thread");
            }
        }).start();

        new Thread(()-> {

        }).start();
        //Above code is to create 2 different threads separately , instead of that I can create a thread pool
        List<String> nameList = new ArrayList<>();
        ExecutorService es = Executors.newFixedThreadPool(4);
        es.submit(()-> processTask("Ananya"));
        es.submit(()-> processTask("Anuhya"));
    }
}
