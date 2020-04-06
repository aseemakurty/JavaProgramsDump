import java.util.Arrays;
import java.util.Collections;

public class SortInteger {

    public static void main(String args[]) {
//        int input = 3267495;
//        //Expected 2345679
//        int output = 0;
//
//        int length = String.valueOf(input).length();
//        Integer[] arr = new Integer[length];
//
//        for (int i = 0; i < length; i++) {
//            arr[i]= input%10;
//            input = input/10;
//        }
//        //Ascending
//        Arrays.sort(arr);
//        //Descending
//        Arrays.sort(arr, Collections.reverseOrder());
//        //9765432
//        for(int j=0;j<length;j++){
//            output = output*10+arr[j];
//        }
//        System.out.println(output);
        int input = 312405;
        int output = 0;
        int length = String.valueOf(input).length();
        Integer[] arr = new Integer[length];

        for(int i=0;i<length;i++){
            arr[i] = input%10;
            input = input/10;
        }
        //Ascending order of an integer
        Arrays.sort(arr);
         //0 1 2 3 4 5
        for(int j=0;j<length;j++){
            output = output*10+arr[j];
        }
        System.out.println(output);
    }

}

