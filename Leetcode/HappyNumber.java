package com.saopayne;

/**
 * Created by ademola on 24/03/2018.
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        int i = 0;
        int newNum = n;
        while (i < 100) {
            int num = sum(newNum);
            if (num == 1) {
                return true;
            }
            newNum = num;
            i++;
        }
        return false;
    }

    private int sum(int n) {
        String nStr = Integer.toString(n);
        char[] arr = nStr.toCharArray();
        int sum = 0;
        for (char anArr : arr) {
            int pa = Integer.parseInt(String.valueOf(anArr));
            sum += pa * pa;
        }
        return sum;
    }

}
