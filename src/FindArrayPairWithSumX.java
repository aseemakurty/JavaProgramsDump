import java.util.HashSet;

public class FindArrayPairWithSumX {

    //Method 1
    public static void printPairs(int A[], int sum){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<A.length;i++){
            int temp = sum-A[i];
            if(set.contains(temp)){
                System.out.println("The pair is ("+temp+","+A[i]+")"+i);
            }
            set.add(A[i]);
        }
    }
    public static void main(String args[]){
        int A[] = {1,2,2,-1,-4,3};//{5,2,3,6,-1,9,0};
        int sum = 0;
        printPairs(A,sum);
    }


}
