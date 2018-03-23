package com.saopayne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ademola on 23/03/2018.
 */
public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {

        int total = intervals.size();
        int[] starts = new int[total];
        int[] ends = new int[total];
        for (int i = 0; i < total; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        List<Interval> list = new ArrayList<Interval>();

        for (int i = 0, j = 0; i < total; i++) {
            if (i == total-1 || starts[i+1] > ends[i]) {
                list.add(new Interval(starts[j], ends[i]));
                j = i + 1;
            }
        }
        return list;
    }

    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
}
