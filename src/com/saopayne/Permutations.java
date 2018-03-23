package com.saopayne;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ademola on 23/03/2018.
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (int n : nums) {
            int size = res.size();
            for (; size > 0 ; size--) {
                List<Integer> r = res.pollFirst();
                for (int i = 0; i <= r.size(); i++) {
                    List<Integer> t = new ArrayList<Integer>(r);
                    t.add(i, n);
                    res.add(t);
                }
            }
        }

        return res;
    }

}
