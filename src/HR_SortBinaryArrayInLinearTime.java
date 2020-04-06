public class HR_SortBinaryArrayInLinearTime {

    public static void main(String args[]){
        int[] arr = {1,0,0,1,0,1,1,0,0,1};
        int zeros = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zeros++;
        }
        int ones = arr.length - zeros -1;
        int k=0;
        while(zeros--!=0){
            arr[k]=0;
            k++;
        }
        while(ones--!=0){
            arr[k]=1;
            k++;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
