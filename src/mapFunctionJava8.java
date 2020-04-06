import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapFunctionJava8 {

    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("12");
        list.add("24");
        list.add("37");

        List<Integer> intList = list.stream().map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> newIntList = list.stream().map(l -> Integer.valueOf(l)).collect(Collectors.toList());
        List<Integer> evenList = list.stream().map(Integer::valueOf).filter(even-> even%12==0).collect(Collectors.toList());
        List<Integer> oddList = list.stream().map(Integer::valueOf).filter(odd-> odd%12!=0).collect(Collectors.toList());
        System.out.println(evenList);
        System.out.println(oddList);

        String name = "Ananya";
        System.out.print(name.substring(1,name.length()));
    }
}
