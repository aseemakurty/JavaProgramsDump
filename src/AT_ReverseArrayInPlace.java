import java.util.Arrays;
import java.util.Comparator;

public class AT_ReverseArrayInPlace {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5} ;
        int size = arr.length;
        int success = reverse(arr, size);
        if (success == 1)
            System.out.println("Array reversed properly");
        else
            System.out.println("Array reversing failed");
    }


    static int reverse(int arr[], int size) {
        int temp = 0;
        int i = 0;
        if (size == 0)
            return 0;
        if (size == 1)
            return 1;

        int size1 = size - 1;
        for (i = 0; i < (size / 2); i++) {
            temp = arr[i];
            arr[i] = arr[size1 - i];
            arr[size1 - i] = temp;
        }

        System.out.println("Numbers after reversal are ");
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        return 1;
    }
}
