package Threads;

public class SecondLargestIntegerInArray {
    public static void main(String args[]){
        int arr[] = {12,3,1,4,10,2};
        int i,first,second;
        first = second = Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++){
            if(arr[i]>first){
                second =first;
                first = arr[i];
            }else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
        System.out.print(" "+ first + " "+second);
    }
}
