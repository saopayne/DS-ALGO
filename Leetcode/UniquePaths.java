package com.saopayne;

import java.util.Arrays;

/**
 * Created by ademola on 23/03/2018.
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        for (int[] row : paths){
            Arrays.fill(row, 1);
        }

        for (int row = 1; row < m; row++) {
            for (int column = 1; column < n; column++) {
                paths[row][column] = paths[row][column-1] + paths[row-1][column];
            }
        }

        return paths[m-1][n-1];
    }

}
