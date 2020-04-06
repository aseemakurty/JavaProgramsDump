public class HR_ReverseWordsInSentence {

    public static void main(String args[]){
        // this will reverse the whole sentence
        String sentence = "Climate seems pleasant today";
        String reverse = "";
        for(int i=sentence.length()-1;i>=0;i--){
            reverse = reverse+sentence.charAt(i);
        }
        System.out.println(reverse);

        // this will reverse only the words in the sentence
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.trim().split("\\s");

        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
            stringBuilder.append(' ');
        }

        System.out.println(stringBuilder.toString().trim());

    }
}
