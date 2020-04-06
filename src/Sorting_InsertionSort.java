public class Sorting_InsertionSort {

    public static void insertionSort(int arr[]){
        int i,j;
        for(i=1;i<arr.length;i++){
            int key = arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {12, 11, 13, 5, 6};
        Sorting_InsertionSort.insertionSort(arr);
    }
}
