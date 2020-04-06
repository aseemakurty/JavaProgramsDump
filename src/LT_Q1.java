public class LT_Q1 {

    public static void main(String args[]){
        int[] arr = {4,1,2,5,7,6};
        int max =arr[0];
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min = arr[i];
            else if(max<arr[i])
                max = arr[i];
        }
        System.out.println(min);
        System.out.println(max);
        //Missing element
        boolean present = false;
        while(min<=max){
            present = false;
            for(int k=0;k<arr.length;k++){
                if(arr[k]==min)
                    present = true;
            }
            System.out.println(present == false ? min: "Present");
            min++;

        }


    }
}
