package Sigtuple;

public class GreatestElementOnRight {
    public static void findGreatest(int[] arr){
        int max_of_right = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int j=arr.length-2;j>=0;j--){
            int temp = arr[j];
            arr[j]= max_of_right;
            if(temp>max_of_right)
                max_of_right=temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {16,17,4,3,5,2};
       // int arr[] = {4,5,2,25};
        findGreatest(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
