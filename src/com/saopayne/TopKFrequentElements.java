package com.saopayne;

import java.util.*;

/**
 * Created by ademola on 23/03/2018.
 */
public class TopKFrequentElements {

//    public List<Integer> topKFrequent(int[] nums, int k) {
//
//        Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();
//        for(int num : nums) {
//            int count = counterMap.getOrDefault(num, 0);
//            counterMap.put(num, count+1);
//        }
//
//        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue()-b.getValue());
//        for (Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
//            pq.offer(entry);
//            if (pq.size() > k) pq.poll();
//        }
//
//        List<Integer> res = new LinkedList<Integer>();
//        while(!pq.isEmpty()) {
//            res.add(0, pq.poll().getKey());
//        }
//
//        return res;
//
//    }

}
