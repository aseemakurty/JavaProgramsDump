import javax.xml.soap.SOAPPart;

public class Z_Rough {

    public static void main(String[] args){
        final String s1 = "Ananya";
        String s2 = new String("Ananya");
        String s3 = s1;


        System.out.print(s1+ " "+ s2 +" "+ s3);
        if(s1==s2){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }

        if(s3==s2){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
