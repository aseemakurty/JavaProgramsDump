public class HR_FindSubArrayWithSumK {

    public static void main(String args[]){
        int[] arr = {4,2,-3,-1,0,4};
        int size =0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum==k)
                    System.out.println(i+"...."+j+ " Size is : "+(j-i));
            }

        }
    }
}
