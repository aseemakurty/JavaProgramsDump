import java.util.HashMap;
import java.util.Map;

public class FindLargestSubArrayWith0And1 {

    public static void main(String args[]){
        int arr[] = {0,0,1,0,1,0,0};
        int res = 0;
        //Map<Integer,Integer> map = new HashMap<>();
        for(int k=0;k<arr.length;k++){
            if(arr[k]==0){
                arr[k]=-1;
            }
        }
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum = sum +arr[j];
                if(sum==res)
                    System.out.println(i+" "+j);
            }
        }
    }
}
