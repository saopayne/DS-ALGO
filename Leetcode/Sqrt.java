package com.saopayne;

/**
 * Created by ademola on 24/03/2018.
 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0) return 0;
        int start = 1, end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1))
                // result found, return that
                return mid;
            else if (mid > x / mid)
                // check the left hand side
                end = mid;
            else
                // check the right hand side
                start = mid + 1;
        }
        return start;
    }

}
