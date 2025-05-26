package MyArray;

import static java.io.IO.print;

/*
You are given an array ‘ARR’ containing ‘N’ integers, you need to sort the array such that a wiggle sequence
is formed.
A wiggle sequence satisfies the following property: ARR[0] < ARR[1] > ARR[2] < ARR[3] > ARR[4] < ARR[5] …..
If there are multiple answers, you may print any of them.
all elements are distinct.

input = { 1, 2, 3, 4, 5 }

output: { 1, 4, 2, 5, 3 } or { 2, 4, 3, 5, 1 } or { 3, 5, 1, 4, 2} are also considered correct.
 */
public class WiggleSort {

    void main(){
        int []nums ={1, 9,2,3,4,5,6};

        for(int n:nums)
            print(n +" ");

        wiggleSort(nums);

        print("\n");
        for(int n:nums)
            print(n +" ");

    }

    void wiggleSort(int[] nums) {
        int idx;
        int temp;
        for(idx=0;idx<nums.length-1;){
            swap(nums,idx,idx+1);
            //print("hello");
//            if(nums[idx]>nums[idx+1]){
//                temp = nums[idx];
//                nums[idx]=nums[idx+1];
//                nums[idx+1]= temp;
//            }
            idx +=2;
        }

        print('\n');
        for(int n:nums)
            print(n +" ");
        idx=1;
        for(;idx<nums.length-1;){
            swap(nums,idx+1,idx);
            //print("hello");

            idx += 2;
        }
    }

    void swap(int[] nums, int idx, int idx2) {
        int temp;
        if(nums[idx]>nums[idx2]){
            temp = nums[idx];
            nums[idx]=nums[idx2];
            nums[idx2]= temp;
        }

    }


}
