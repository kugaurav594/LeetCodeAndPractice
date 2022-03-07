package Array.easy;

import java.util.Stack;

public class BracketIssue {
    public static void main(String[] args) {
        String bracket = "{[]}(){";
        boolean status = checkBracketStatus(bracket);
        if(status)
            System.out.println("Bracket is complete");
        else
            System.out.println("Bracket is not complete");

    }

    private static boolean checkBracketStatus(String bracket) {
        Stack stack = new Stack();
        boolean flag = true;
        char[] ch = bracket.toCharArray();
        for(int i =0; i<ch.length; i++){
            if(ch[i] == '[' || ch[i] == '{' || ch[i] == '('){
                stack.push(ch[i]);
                continue;
            }
            char popChar = (char) stack.pop();
            switch (ch[i]){
                case ']':
                    if(popChar== '{' || popChar == '(')
                        flag = false;
                    break;

                case '{':
                    if(popChar == '[' || popChar == '(')
                        flag = false;
                    break;

                case '(':
                    if(popChar== '{' || popChar == '[')
                        flag = false;
                    break;
            }

        }
        if(!stack.isEmpty())
            flag = false;
        return flag;
    }
}
