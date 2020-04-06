import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class HR_CountVowelsConsonantsInString {

    public static void main(String args[]){
        // Solution 1
        String name = "ananya";
        Set<Character> vowelsList = new HashSet<>();
        vowelsList.add('a');
        vowelsList.add('e');
        vowelsList.add('i');
        vowelsList.add('o');
        vowelsList.add('u');
        int vowelCount =0;
        int consonantCount =0;

        for(int i=0;i<name.length();i++){
            if(vowelsList.contains(name.charAt(i)))
                vowelCount++;
            else
                consonantCount++;
        }
         System.out.println("Vowel Count: "+vowelCount+ " Consonant Count: "+consonantCount);

        //Solution 2
        String name1 = "hello";
        int vowels =0; int consonants=0;
        Pattern pattern = Pattern.compile("[aeiou]");
        for(int i=0;i<name1.length();i++){
        if(Pattern.matches("[aeiou]",Character.toString(name1.charAt(i))))
                vowels++ ;
        else
            consonants++;
        }
        System.out.println(vowels);
        System.out.println(consonants);

        }
    }

