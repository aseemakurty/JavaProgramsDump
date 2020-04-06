import java.util.LinkedHashMap;
import java.util.Map;

public class HR_FirstNonRepeatedCharacter {

    public static void main(String args[]){
        String name = "ananyal";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c: name.toCharArray()){
            map.put(c,map.containsKey(c)? map.get(c)+1 :1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
