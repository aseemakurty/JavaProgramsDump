import java.util.Arrays;

public class HR_OrderIntegersInNumber {

    public static void main(String args[]){
        int number = 3174;
        int[] arr = new int[4];

        for(int i=0;i<arr.length;i++){
            int rem = number %10;
            number = number/10;
            arr[i] = rem;
        }

        int num =0;
        Arrays.sort(arr); //1374  1*10
        for(int j=0;j<arr.length;j++){
           num = (num*10)+arr[j];
        }
        System.out.print(num);
    }
}
