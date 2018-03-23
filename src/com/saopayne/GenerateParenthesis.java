package com.saopayne;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ademola on 23/03/2018.
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        if (n > 0) generateParenthesisCore("", n, n, result);
        return result;
    }

    private void generateParenthesisCore(String prefix, int left, int right, List<String> result){
        if (left == 0 && right == 0) result.add(prefix);
        // Has left Parenthesis
        if (left > 0) generateParenthesisCore(prefix+'(', left-1, right, result);
        // has more right Parenthesis
        if (left < right) generateParenthesisCore(prefix+')', left, right-1, result);
    }

}
