import java.util.Arrays;
import java.util.Collections;

public class SortDigits {
        public static void main(String[] args) {
            int inp=57437821;
            int len=Integer.toString(inp).length();
            Integer[] arr=new Integer[len];
            for(int i=0;i<len;i++)
            {
                arr[i]=inp%10;
                inp=inp/10;
            }
            Arrays.sort(arr, Collections.reverseOrder());
            int num=0;
            for(int i=0;i<len;i++)
            {
                num=(num*10)+arr[i];
            }
            System.out.println(num);
        }
}
