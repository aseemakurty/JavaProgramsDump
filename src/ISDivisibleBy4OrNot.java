public class ISDivisibleBy4OrNot {
    static boolean check(String num){
        if(num.length()==0)
            return false;
        if(num.length()==1)
            return (num.charAt(0)%4==0);

        int last = num.charAt(num.length()-1);
        int secondLast = num.charAt(num.length()-2);
        return (((secondLast*10)+last)%4==0);
    }

    public static void main(String args[]){
        String str = "76952";
        if(check(str))
            System.out.print("Yes, divisible by 4");
        else
            System.out.print("No, not divisible by 4");
        }
 }
