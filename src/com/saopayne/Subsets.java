package com.saopayne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ademola on 23/03/2018.
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        ans.add(new ArrayList());

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i ++) {

            int curSize = ans.size();

            for (int j = 0; j < curSize; j ++) {

                ArrayList cur = new ArrayList(ans.get(j));

                cur.add(nums[i]);

                ans.add(cur);

            }

        }

        return ans;
    }

}
