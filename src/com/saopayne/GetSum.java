package com.saopayne;

/**
 * Created by ademola on 24/03/2018.
 */
public class GetSum {

    public int getSum(int a, int b) {
        // the idea is to use XOR and bit shift
        while (b != 0) {
            int c = a ^ b;
            b = (a & b) << 1;
            a = c;
        }
        return a;
    }

    public static void main(String[] args) {
        GetSum getSum = new GetSum();
        System.out.println(getSum.getSum(2, 10));
    }
}
