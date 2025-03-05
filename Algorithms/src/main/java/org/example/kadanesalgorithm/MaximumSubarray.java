package org.example.kadanesalgorithm;

// https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int msf = -100000;
        int meh = 0;
        for (int i = 0; i < nums.length; i++) {
            meh = meh + nums[i];
            if(meh < nums[i]) {
                meh = nums[i];
            }
            if(meh > msf) {
                msf = meh;
            }
        }
        return msf;
    }
}
