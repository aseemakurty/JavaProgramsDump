public class Sorting_QuickSort {

    public int partition(int arr[],int start,int end){
        int pIndex = start;
        int pivot = arr[end];
        for(int i=start;i< end;i++){
            if(arr[i]<= pivot){
                swap(i,pIndex,arr);
                pIndex= pIndex+1;
            }
        }
        swap(pIndex,end,arr);

        return pIndex;
    }

    public void swap(int i, int j,int arr[]){
        int temp;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void quickSort(int[] arr,int start,int end){
        if(start<end){
            int pIndex = partition(arr,start,end);
            quickSort(arr,start,pIndex-1);
            quickSort(arr,pIndex+1,end);
        }
    }
    public static void main(String args[]){
        Sorting_QuickSort func = new Sorting_QuickSort();
        int[] arr = {2,3,1,4,6,5,7};
        int start = 0;
        int end = arr.length-1;
        func.quickSort(arr,start,end);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
