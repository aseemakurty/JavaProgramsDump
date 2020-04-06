import java.util.HashMap;
import java.util.Map;

public class HR_DuplicateCharactersOfString {

    public static void main(String args[]){
        String name = "Ananya".toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<name.length();i++){
            if(map.containsKey(name.charAt(i))){
                map.put(name.charAt(i),map.get(name.charAt(i))+1);
            }else{
                map.put(name.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1)
                System.out.print(entry.getKey()+ " ");
        }
    }
}
