public class MaxContigousSumInArray {

    public static int maxSubArraySum(int A[]){
        int max_so_far =0; int max_ending_here =0;
        for(int i=0;i<A.length;i++){
            max_ending_here = max_ending_here + A[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here <= 0){
                max_ending_here =0;
            }
        }
        return max_so_far;
    }
    public static void main(String args[]){
        int A[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Contiguous Sum in Array "+maxSubArraySum(A));
    }
}
