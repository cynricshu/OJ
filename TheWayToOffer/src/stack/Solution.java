package stack;

import java.util.Stack;

/**
 * Created by Cynric on 02/10/2016.
 */
public class Solution {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> helpStack = new Stack<>();
    int min = -(2 ^ 31);


    public void push(int node) {
        mainStack.push(node);
        if (node < min) {
            min = node;
        }
        helpStack.push(min);
    }

    public void pop() {
        mainStack.pop();
        helpStack.pop();
        min = helpStack.peek();

    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return min;
    }
}
