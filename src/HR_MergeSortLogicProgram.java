public class HR_MergeSortLogicProgram {

    public static void main(String args[]){
        int i=0,k=0;
        int arr1[] = {1,2,3,4,5,6,8,15,16,17};
        int arr2[] = {12,11,10,9,8,7,6};
        int arr3[] = new int[arr1.length+arr2.length];
        int j = arr2.length-1;
        while(i<arr1.length && j>0){
            if(arr1[i] < arr2[j]){
                arr3[k]= arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j--;
            }
            k++;
        }
        while(j>=0){
            arr3[k] = arr2[j];
            j--;
            k++;
        }
        while(i<arr1.length){
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[l]+" ");
        }
    }
}

