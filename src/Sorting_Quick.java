public class Sorting_Quick {

    public static int partition(int[] arr,int start,int end){
        int temp;
        int pIndex= start;
        int pivot = arr[end];
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        temp = arr[end];
        arr[end]= arr[pIndex];
        arr[pIndex] = temp;


        return pIndex;
    }

    public static void Quicksort(int[] arr,int start, int end){
        if(start<end){
            int pIndex = partition(arr,start,end);
            Quicksort(arr,start,pIndex-1);
            Quicksort(arr,pIndex+1,end);
        }
    }
    public static void main(String args[]){
        int[] arr = {7,2,1,6,8,5,3,4};
        int start =0;
        int end = arr.length-1;
        Quicksort(arr,start,end);
        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
