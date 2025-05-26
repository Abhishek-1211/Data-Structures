package DP;

import java.util.*;

import static java.io.IO.print;
import static java.io.IO.println;

/*
You are required to find all possible combination to make 'N' as sum of 1,3,5.Two solutions are different
only when count of any one element is different
e.g if N=6 then no. of  possible combinations = 4
[1,1,1,1,1,1]
[1,1,1,3] is same as [1,1,3,1],[1,3,1,1],[3,1,1,1]
[3,3]
[1,5] is same as [5,1]
 */
public class CombinationSum1 {

    void main(){
        int[] nums = {1,3,5,6,9,7,4};
        int target = 18;

        int ans = combinationSum(nums,target);
        println(ans);
    }

    int combinationSum(int[] nums, int target) {
        HashMap<List<Integer>,Integer> dp = new HashMap<>();

        int ans = combinationSumUtil(nums,nums.length-1,target,dp);
        //int ans = combinationSumUtil(nums,nums.length-1,target);
        for(Map.Entry entrySet:dp.entrySet()){
            println(entrySet);
        }
//
        return ans;
    }

    int combinationSumUtil(int[] nums, int i, int target,HashMap<List<Integer>,Integer> dp) {

        if(target==0)
            return 1;

        if(i<0)
            return 0;

        if(dp.containsKey(Arrays.asList(i,target))){
            println("cache hit" + Arrays.asList(i,target));
            return dp.get(Arrays.asList(i,target));
        }


        if(target<nums[i])
            return combinationSumUtil(nums,i-1,target,dp);

        int include = combinationSumUtil(nums,i,target-nums[i],dp);
        int exclude = combinationSumUtil(nums,i-1,target,dp);
        //int[]pair= new int[]{i,target};


        if(!dp.containsKey(Arrays.asList(i,target)))
            dp.put(Arrays.asList(i,target),include+exclude);
//
//        if(target>0 && !dp.containsKey(Arrays.asList(i,target)))
//            return combinationSumUtil(nums,i,target,dp);

        println("include "+nums[i]+ " "+include);
        println("exclude "+nums[i]+ " "+exclude);

        /*for input N=18 and set = {1,3,5,6,9,7,4} total no of lines = 1476 lines
        with dp and caching its 175 lines
        */

        //return include+exclude;
        return dp.get(Arrays.asList(i,target));
    }
}
