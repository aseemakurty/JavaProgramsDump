import java.util.regex.Pattern;

public class HR_CheckStringContainsOnlyDigits {

    public static void main(String args[]){
        String name = "abcd123";
        Pattern pattern = Pattern.compile(".*[^0-9].*]");
        System.out.println(!pattern.matcher(name).matches() ? "Yes, string contains only digits": "No, string is combination of digits and alphabets");
    }
}
