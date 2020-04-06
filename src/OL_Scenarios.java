public class OL_Scenarios {

//1    // We can overload methods with different return type and different datatype of params
//    public int foo(int a,int b){
//        return 1;
//    }
//    public char foo(char a, char b){
//        return 'a';
//    }
//    public char foo(int a, int b){return 'a';}

//2
//    public int foo(){
//        return 1;
//    }
//    // We cannot overload methods which differ only in return type
//    // Compile Time Issue
//    // foo() is already defined
//    public char foo(){
//        return 'a';
//    }

//3
// Static methods can be overloaded
    public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    public static void main(String args[])
    {
        OL_Scenarios.foo();
        OL_Scenarios.foo(10);
    }

//4
//static and a non Static method cannot be overloaded

//    public static void hello(){
//        System.out.print("Hello you");
//    }
//    public void hello(){
//        System.out.print("Hello you");
//    }

//5
// parent has a method and child overloads the same method
// Overloading means happening in the same class


}
