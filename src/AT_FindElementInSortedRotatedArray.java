public class AT_FindElementInSortedRotatedArray {

    public static int circularArray(int[] arr, int n, int x){
        int low =0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]<= arr[high]){//It means my right sub array is sorted
                if(x>arr[mid] && x<=arr[high])
                    low = mid+1;
                else
                    high = mid -1;
            }else{//It means my left sub array is sorted
                if(arr[low]<=x && x< arr[mid])
                    high = mid-1;
                else
                    low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]= {5,6,7,8,9,10,1,2,3};
        int len = arr.length;
        int key = 3;
        System.out.println("Element "+key+ " is found with Index : "+circularArray(arr,9,3));
    }
}
