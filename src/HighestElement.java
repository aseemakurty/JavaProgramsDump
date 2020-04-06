public class HighestElement {

    //Highest element in the subarray

//    public static void highestElement(int arr[]){
//        int i,j;
//
//        for(i=0;i<arr.length-1;i++){
//            int maxValue = 0;
//            for(j=i+1;j<=arr.length-1;j++){
//                if(maxValue<arr[j])
//                    maxValue = arr[j];
//            }
//            System.out.println(maxValue);
//        }
//    }


    public static void highestElement(int arr[]) {
        int i, j;

        for (i = 0; i < arr.length - 1; i++) {
            int maxValue = arr[i + 1];
            int temp = i;
            for (j = temp + 1; j < arr.length; j++) {
                if (maxValue < arr[j]) {
                    maxValue = arr[j];
                    i = --j;

                }

            }
            System.out.println(maxValue);
        }
    }
    public static void main(String args[]){
        int arr[] = {3,15,13,16,14,4,1};
        HighestElement.highestElement(arr);

    }
}
