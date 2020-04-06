import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerRank1 {
    // Given a list of numbers. Subtract the combination and fin out the least number left

    public static void main(String args[]){
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(7);

        Collections.reverse(numberList);

        for(int i=0;i<numberList.size();i++){
            if(numberList.get(i)==(numberList.get(i+1))){
                numberList.remove(numberList.get(i));
                numberList.remove(numberList.get(i+1));
            }
        }

        numberList.forEach(number->{
            System.out.println(number);
        });
    }
}
