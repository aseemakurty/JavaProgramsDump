public class HR_RepeatingCharactersOnASCIIOrder {

    static char count[] = new char[256];

    static void repeatingCharacters(String name){
        for(int i=0;i<name.length();i++){
            count[name.charAt(i)]++;
        }
        char character = 0;
        char min = 'z';
        for(int j=0;j<name.length();j++){
            if(count[name.charAt(j)]>1){
                character = name.charAt(j);
                if(character<min)
                    min = character;
            }
        }
        System.out.print(min);
    }
    public static void main(String args[]){
        String name = "anany";
        repeatingCharacters(name);
    }
}
