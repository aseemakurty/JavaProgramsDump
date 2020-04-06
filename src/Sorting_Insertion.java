public class Sorting_Insertion {

    public void sort(int[] arr){
        int value;
        int hole;
        for(int i=0;i<arr.length;i++){
            value = arr[i];
            hole = i;
            while(hole > 0 && arr[hole-1]>value){
                arr[hole]=arr[hole-1];
                hole--;
            }
            arr[hole] = value;
        }
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }
    }
    public static void main(String args[]){
        Sorting_Insertion sortingInsertion = new Sorting_Insertion();
        int[] arr= {5,7,1,4,6,2,3};
        sortingInsertion.sort(arr);
    }
}
