package leetcode.栈;

import java.util.Stack;

public class 删除最外层的括号 {

    public static void main(String[] args) {
        removeOuterParentheses("(()())(())(()(()))");
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ')') {
                if (stack.empty())
                    stack.push(')');
            } else {
                if (!stack.empty())
                    sb.append('(' + stack.pop());
            }
        }
        return sb.toString();

    }
}
