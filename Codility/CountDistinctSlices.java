package com.saopayne;

import java.util.Arrays;

/**
 * Time Complexity O(N)
 * Space Complexity O(M)
 */
public class CountDistinctSlices {

    public static void main(String[] args) {
        CountDistinctSlices sol = new CountDistinctSlices();
        int[] A = {3,4,5,5,2};
        System.out.println(sol.solution(6, A));
    }

    int solution(int M, int A[]) {
        int prev = -1;
        int result = 0;
        int[] hash = new int[M+1];
        Arrays.fill(hash, -1);

        for (int i = 0; i < A.length; i++) {
            if (hash[A[i]] > prev) {
                prev = hash[A[i]];
            }

            result += i - prev;
            hash[A[i]] = i;
            if (result > 1000000000) {
                return 1000000000;
            }
        }

        return result;
    }
}