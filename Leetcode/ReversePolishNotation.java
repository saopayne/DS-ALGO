package com.saopayne;

import java.util.Stack;

/**
 * Created by ademola on 24/03/2018.
 */
public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < tokens.length; i++) {
            switch(tokens[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-(stack.pop()) + stack.pop());
                    break;
                case "*":
                    int n = stack.pop();
                    int m = stack.pop();
                    stack.push(n*m);
                    break;
                case "/":
                    n = stack.pop();
                    m = stack.pop();
                    stack.push(m/n);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

}
