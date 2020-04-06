import java.util.ArrayList;
import java.util.List;

public class Sorting_BubbleSort {

    public static void bubbleSort(int arr[]){
        int i,j,temp;
        boolean flag = false;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    flag = true;
                }
            }
            if(flag== false)
                break;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        Sorting_BubbleSort.bubbleSort(arr);
    }
}
