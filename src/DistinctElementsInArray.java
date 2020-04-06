import java.util.HashMap;
import java.util.Map;

public class DistinctElementsInArray {

    public static void main(String args[]){
        Integer[] arr = {2,3,1,2,4};
        final int[] count = {0};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length ;i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                value = value+1;
                map.put(arr[i],value);
            }else{
                map.put(arr[i],1);
            }
        }
        map.forEach((k,v)-> {
            if(v==1){
                count[0]++;
            }
        });
        System.out.println(count[0]);
    }
}
