import java.util.Arrays;
import java.util.HashSet;

public class HR4_PairsOfSumK {
    //Solution 1
    //O(n)
    public static void pairs(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int result = k - arr[i];
            if (set.contains(result))
                System.out.print("(" + result + "," + arr[i] + ")");
            else
                set.add(arr[i]);
        }
    }

    //Solution 2
    public static void pairs_2(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==k) {
                System.out.print("(" + arr[left] + "," + arr[right] + ")");
                left=left+1;
                right=right-1;
            }else if(arr[left]+arr[right]>k){
                right = right -1;
            }else{
                left = left +1;
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {2,1,3,-2,4,5};
        int sum =3;
        HR4_PairsOfSumK.pairs(arr,sum);
        System.out.println(" ");
        HR4_PairsOfSumK.pairs_2(arr,sum);
    }
}
