public class Sorting_SelectionSort {

    public static void SelectionSort(int[] arr){
        int i,j,temp=0;
        for(i=0;i<arr.length-1;i++){
            int min_index = i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        Sorting_SelectionSort.SelectionSort(arr);
    }
}
