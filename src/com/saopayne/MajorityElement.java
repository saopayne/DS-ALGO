package com.saopayne;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by ademola on 24/03/2018.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> keySet = map.keySet();
        int max = 0;
        int maxKey = 0;
        for (int num : keySet) {
            if (map.get(num) > max) {
                max = map.get(num);
                maxKey = num;
            }
        }

        return maxKey;
    }

}
