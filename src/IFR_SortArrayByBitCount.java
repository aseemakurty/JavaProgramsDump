import java.util.Arrays;
import java.util.Comparator;

public class IFR_SortArrayByBitCount {

    public static void sortByBitSum(Integer arr[]){
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer int1 , Integer int2){
                int c1 = Integer.bitCount(int1);
                int c2 = Integer.bitCount(int2);
                if(c1<=c2)
                    return 1;
                else
                    return -1;
            }
        });

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String args[]){
        Integer arr[] = {1,2,3,4,5,6};
        int size = 6;
        sortByBitSum(arr);
    }
}
