import java.util.HashSet;

public class HR_FindPairsOfMaximumProduct {
    //o(n2)
    public static void findPairs(int[] arr){
        int maxProduct =0;
        int max_i=0,max_j=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(maxProduct < arr[i]*arr[j]){
                    maxProduct = arr[i]*arr[j];
                    max_i=arr[i];
                    max_j=arr[j];
                }
            }
        }
        System.out.println("Max Product is: "+maxProduct+ "...Pairs : ("+max_i+","+max_j+")");
    }

    //O(n)

    public static void main(String args[]){
        int[] arr={-10,-3,5,6,-2};
        findPairs(arr);
    }
}
