package DP;

import static java.io.IO.println;

/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of
money stashed,the only constraint stopping you from robbing each of them is that adjacent houses have security
systems connected and it will automatically contact the police if two adjacent houses were broken into on the
 same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can
rob tonight without alerting the police.
*/
public class HouseRobber {

    void main(){

        int[] nums={1,2,3,1,7,9,4,6};
        println(rob(nums));

    }

    public int rob(int[] nums) {
        return Math.max(robUtil(nums.length-1,nums),
                robUtil(nums.length-2,nums));
    }

    int robUtil(int idx, int[]nums){
        if(idx < 0 )
            return Integer.MIN_VALUE;

        if(idx<=1)
            return nums[idx];

        return nums[idx]+ Math.max(robUtil(idx-2,nums),robUtil(idx-3,nums));
    }
}
