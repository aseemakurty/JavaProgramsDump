package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureCallableProgram implements Callable<Integer> {
    public Integer number;
    public FutureCallableProgram(Integer number){
        this.number=number;
    }
    @Override
    public Integer call() throws Exception{
        int result =1;
        if((number ==0) && (number==1))
            return 1;
        else{
            for(int i=2;i<=number;i++){
                result = result*i;
            }
        }
        System.out.println("Result for the number "+number+" --> "+result);
        return result;
    }

    public static void main(String args[]){
        int random = 4;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        List<Future<Integer>> resultList = new ArrayList<>();

        FutureCallableProgram futureCallableProgram = new FutureCallableProgram(random);
        Future<Integer> future = threadPoolExecutor.submit(futureCallableProgram);
        resultList.add(future);
        try {
            System.out.println("Future is --> "+future.get()+" and task done? "+future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        threadPoolExecutor.shutdown();

    }
}
