public class Dump1 {
     static int number = 10;

    public Dump1(int i) {
        this.number = i;
    }

    public static class Hello{
        static int i =10;
        static void display(){
            System.out.println("Static method");
        }
    }

    public static void main(String args[]){
//        Dump1 dump1 = new Dump1(12);
//        Dump1 dump2 = new Dump1(13);
//        //dump1.number = 12;
//        System.out.println("Number is :"+dump1.number);
//        System.out.println("Number is :"+dump2.number);
//        double x =0.1;
//        double y = 0.2;
//        double z = x+y;
//        System.out.println(z);
//
//        //Immutable
//String s = "Ananya";
// s = "Ananya1";
//
// System.out.println(s);

 Hello hello1 = new Hello();
 hello1.display();

        String s = new String("a");
        StringBuilder builder = new StringBuilder("b");
       // builder.
    }



}
