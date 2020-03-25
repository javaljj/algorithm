package jzoffer;

import java.util.Stack;

public class 用两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.empty())
            return -1;

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int ans = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }

        return ans;
    }
}
