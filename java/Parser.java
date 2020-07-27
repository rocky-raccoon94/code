package java;

import java.util.Stack;

public class Parser {
    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(')
                stack.push(c);
            else if (!stack.isEmpty() && (c == '}' && stack.peek() == '{') || (c == ')' && stack.peek() == '('))
                stack.pop();
            else
                return false;

        }
        return true;

    }



}