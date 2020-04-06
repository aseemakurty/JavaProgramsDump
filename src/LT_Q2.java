import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LT_Q2 {

    public static void main(String args[]){
        List<Integer> numberList = new ArrayList<>();
        numberList.add(4);numberList.add(1);numberList.add(2);numberList.add(5);numberList.add(2);numberList.add(1);numberList.add(4);numberList.add(6);
        //FInd out the first non repeating integer in the list
        //Solution 1
        int count =1;
        Map<Integer, Integer> map = new HashMap<>();
        numberList.forEach(number-> {
            if(!map.containsKey(number)){
                map.put(number,count);
            }else{
                int existingCount = map.get(number);
                map.put(number,existingCount+1);
            }
        });
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) {
                System.out.println("Te first non repeated key is : " + entry.getKey());
                break;
            }
        }

        //System.out.println("The first non repeated key is : "+ map.entrySet().stream().filter(entry -> entry.getValue()==1).findFirst());

    }
}
