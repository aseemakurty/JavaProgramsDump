package Sigtuple;

import java.util.Stack;

public class NextGreaterElement {
    //o(n2)
    static void printNGE(int arr[], int n)
    {
        int next, i, j;
        for(i=0;i<n;i++){
            next = -1;
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" -> "+next);
        }
    }

    //o(n)
    static void printNGE_New(int arr[], int n){
        int i = 0;
        Stack s = new Stack();
        int noNGE = -1;
        int element =0, next=0;

        s.push(arr[0]);

        for(i =1;i<n;i++){
            next = arr[i];
            if(!s.isEmpty()){
                element = (int) s.pop();
                while(element < next) {
                    System.out.println(element + " -> " + next);
                    if (s.isEmpty() == true)
                        break;
                    element = (int)s.pop();
                    if (element > next)
                        s.push(element);
                }
            }
            s.push(next);
        }

        while (s.isEmpty() == false)
        {
            element = (int)s.pop();
            next = -1;
            System.out.println(element + " -> " + next);
        }
    }
    public static void main(String args[]){
        int arr[]= {11, 13, 21, 3};
        int n = arr.length;
        printNGE_New(arr, n);
    }
}
