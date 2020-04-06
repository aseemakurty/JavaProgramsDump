import java.util.Arrays;

public class HR_CheckAnagramsOrNot {

    public static void main(String args[]){
        // Solution 1
        String name1 = "ananya";
        String name2 = "anuhya";

        if(name1.length() != name2.length())
            System.out.print("The given strings are not anagrams.");

        char[] name1arr = name1.toLowerCase().toCharArray();
        char[] name2arr = name2.toLowerCase().toCharArray();

        Arrays.sort(name1arr);
        Arrays.sort(name2arr);

        System.out.println(Arrays.equals(name1arr,name2arr)==false? "Not anagrams" : "Anagrams");

        //Solution 2
        char[] firstArray = name1.toCharArray();
        StringBuilder secondName = new StringBuilder(name2);

        for(int i=0;i< firstArray.length;i++){
            char charAtIndex = firstArray[i];
            int index = secondName.indexOf(""+charAtIndex);
            if(index != -1)
            secondName.deleteCharAt(index);
        }
        if(secondName.length()==0)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
