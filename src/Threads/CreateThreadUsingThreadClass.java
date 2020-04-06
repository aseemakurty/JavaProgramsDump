package Threads;

public class CreateThreadUsingThreadClass extends Thread {
    public void run(){
        System.out.println("I am overriding the run method of super class thread, even I don't override the run method it still works");
    }
    public static void main(String args[]){
        CreateThreadUsingThreadClass obj = new CreateThreadUsingThreadClass();
        obj.start();
    }
}
