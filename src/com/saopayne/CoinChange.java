package com.saopayne;

import java.util.Arrays;

/**
 * Created by ademola on 24/03/2018.
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        /**
         * Initialize an array of amounts (up to and including `amount`),
         * which stores the smallest number of coins yet found to get to
         * that index-amount.
         */
        int[] change = new int[amount+1];
        Arrays.fill(change, -1);
        change[0]=0;

        for (int i = 1; i <= amount; i++){
            boolean flag = false;
            int min = Integer.MAX_VALUE;
            for (int coin : coins){
                if ( i >= coin && change[i-coin] != -1){
                    flag = true;
                    min = Math.min(min, change[i-coin]);
                }
            }
            if (flag) {
                change[i] = 1 + min;
            }
        }

        return change[amount];
    }

}
