

    class Test1{

        int i;

    }

    class Test{

        public static void main(String args[]){

            Test1 t = new Test1();

            System.out.println(t.i);

            char c1 = 72, c2 = 78 , c3 = 81;

            System.out.println(c2);
            System.out.println(c3);

            char a = ')', b = '$';
            char x = (a>b)?'>':'<';
            System.out.println(x);

            Integer i1 = 99;

            Integer i2 = 99;

            System.out.println(i1 == i2);

            Long i3 = 144l;

            Long i4 = 144l;

            System.out.println(i3 == i4);

            double d=100.04;

            float f= (float) d;

            System.out.println("Float value "+f);

        }

}
