package com.saopayne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ademola on 23/03/2018.
 */
public class LetterCombinations {

    public static List<String> letterCombinations(String digits) {

        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<String>();

        if (digits.length() == 0 || digits == ""){
            return result;
        }
        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            result = combine(digitletter[digits.charAt(i) - '0'], result);
        }

        return result;
    }

    public static List<String> combine(String digit, List<String> combinationList) {

        List<String> result = new ArrayList<String>();

        for (int i = 0; i < digit.length(); i++) {
            for (String x: combinationList) {
                result.add(x + digit.charAt(i));
            }
        }

        return result;
    }

}
