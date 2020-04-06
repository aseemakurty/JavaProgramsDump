import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReverseString {

    public static void main(String args[]){
//        String name = "Ananya";
//        String reverse = "";
//        for(int i=name.length()-1;i>=0;i--){
//            reverse = reverse + name.charAt(i);
//        }
//        System.out.println(reverse);

        String name = "Ananya";
        String reverse = "";
        for(int i=name.length()-1;i>=0;i--){
            char element = name.charAt(i);
            reverse = reverse + element;
        }
        System.out.println(reverse);

        ////Count of the alphabets
        String nameNew = name.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<nameNew.length();i++){
            if(map.containsKey(nameNew.charAt(i))){
                int value = map.get(nameNew.charAt(i));
                value = value +1;
                map.put(nameNew.charAt(i),value);
            }else{
                map.put(nameNew.charAt(i),1);
            }
        }

        System.out.println(map.toString());
        // MAx and Min based on key values
        Character minKey = Collections.min(map.keySet());
        Character maxKey = Collections.max(map.keySet());

        //Max and min based on values of map
        Integer maxValue = Collections.max(map.values());


        System.out.println("Max Key - "+maxKey+" and its value - "+map.get(maxKey));
        System.out.println("Max Value required, its key - "+map+" its value - "+maxValue);
    }


}
