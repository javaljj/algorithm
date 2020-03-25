package leetcode.栈;

import java.util.Stack;

public class 使括号有效的最少添加 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))(("));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else {//)
                if (stack.empty()) {
                    len++;
                } else if (stack.peek() == ')') {
                    stack.pop();
                }
            }
        }

        return len + stack.size();

    }

}
