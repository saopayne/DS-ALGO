package com.saopayne;

import java.util.PriorityQueue;

/**
 * Created by ademola on 23/03/2018.
 */
public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for (int i: nums) {
            q.offer(i);

            if (q.size()>k) {
                q.poll();
            }
        }

        return q.peek();
    }

}
