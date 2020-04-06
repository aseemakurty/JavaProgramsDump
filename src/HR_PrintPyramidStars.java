public class HR_PrintPyramidStars {

    public static void main(String args[]){
        //stars printing
//        *
//        * *
//        * * *
//        * * * *
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //stars printing
//        * * * *
//        * * *
//        * *
//        *
        System.out.println();

        for(int i=1; i<=4; i++){
            for(int j=4 ;j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // stars printing
//              *
//            * *
//          * * *
//        * * * *
        System.out.println();

        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //stars printing
//        * * * *
//          * * *
//            * *
//              *
        System.out.println();

        for(int i=1;i<=4;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //printing stars
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
        System.out.println();

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //printing stars
//             *
//           * * *
//         * * * * *
//       * * * * * * *
        System.out.println();
        for(int i=1;i<=4;i++){
            for(int j=4-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        //printing numbers
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
        System.out.println();

        System.out.println();
        for(int i=1;i<=5;i++){
            int number=1;
            for(int j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }

            System.out.println();
        }


        int num=1;
        System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
