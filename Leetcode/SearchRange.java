package com.saopayne;

/**
 * Created by ademola on 23/03/2018.
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1, tmp = 0;
        int[] rst = {-1,-1};
        if (nums==null || nums.length==0) return rst;

        while (left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                tmp = mid;
                right = mid-1;
            }
            else if (nums[mid] > target) {
                right = mid-1;
            }
            else{ left = mid+1; }
        }

        if (nums[tmp] != target) return rst;
        else rst[0] = tmp;

        left = tmp;
        right = nums.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] == target){
                tmp = mid; left = mid+1;
            }
            else if(nums[mid] < target) left = mid+1;
            else right = mid-1;
        }
        rst[1] = tmp;

        return rst;
    }

}
