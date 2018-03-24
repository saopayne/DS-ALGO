package com.saopayne;

/**
 * Created by ademola on 24/03/2018.
 */
public class TrailingZeros {

    public int trailingZeroes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        int r = 0;
        while (n > 0) {
            n /= 5;
            r += n;
        }
        return r;
    }

    public static void main(String[] args) {
        TrailingZeros zeros = new TrailingZeros();
        System.out.println(zeros.trailingZeroes(13));
    }

}
