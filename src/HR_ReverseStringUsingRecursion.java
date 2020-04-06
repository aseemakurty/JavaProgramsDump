public class HR_ReverseStringUsingRecursion {

    public static String reverseString(String name){
        if (name.isEmpty()){
            return name;
        }
        return reverseString(name.substring(1))+name.charAt(0);
    }
    public static void main(String args[]){
        String name = "ananya";
        String reverse = "";
        //Using iteration
        for(int i=name.length()-1;i>=0;i--){
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        // using recursion
        String reverseString = reverseString(name);
        System.out.println(reverseString);

    }

}
