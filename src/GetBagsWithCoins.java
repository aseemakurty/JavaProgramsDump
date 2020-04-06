public class GetBagsWithCoins {

    public static void main(String args[]) {
        int[] arr = {10, 15, 20, 30, 50};
        int money = 50;
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == money) {
                    System.out.print(arr[i] + " " + arr[j]);

                    //System.out.println(count);
                }
                }
            }
        }
    }
