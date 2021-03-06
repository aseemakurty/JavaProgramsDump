import java.util.Stack;

public class BalancedParams {

    public static boolean isMatchingPair(char char1, char char2){
        boolean matched = false;

        if(char1 == '(' && char2 == ')')
            matched = true;
        else if(char1 == '{' && char2 == '}')
            matched = true;
        else if(char1 == '[' && char2 == ']')
            matched = true;
        else
            matched = false;

        return matched;
    }
    public static boolean areParenthesisBalanced(char exp[]){
        //boolean status = false;

        Stack stack = new Stack();
        for(int i=0; i< exp.length; i++){

            if(exp[i] == '{' || exp[i] == '(' || exp[i]== '[')
                stack.push(exp[i]);

            if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatchingPair((Character) stack.pop(), exp[i])) {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
        //return status;
    }

    public static void main(String args[]){

        //char exp[] = {'{','(',')','}','[',']'};
        char exp[] = {']'};
        if(areParenthesisBalanced(exp)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}
