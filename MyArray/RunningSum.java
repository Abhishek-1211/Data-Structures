package MyArray;

import static java.io.IO.print;

public class RunningSum {

    void main(){
        int []nums = {1,3,7,9,4};
        runningSum(nums);

        print("[ ");
        for(int num:nums)
            print(num +" ");
        print("]");
    }

     void runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
    }
}
