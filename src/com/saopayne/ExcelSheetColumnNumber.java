package com.saopayne;

/**
 * Created by ademola on 24/03/2018.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        char[] alphabets = {'-','A','B','C', 'D','E', 'F', 'G', 'H', 'I', 'J', 'K', 'L','M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        // formula is alphabets[0]*26+alphabets[1]
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            String arrayStr = String.valueOf(alphabets);
            sum += Math.pow(26, len-1-i) * arrayStr.indexOf(curr);
        }

        return sum;
    }

}
