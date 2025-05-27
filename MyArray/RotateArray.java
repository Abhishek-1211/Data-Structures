package MyArray;

import static java.io.IO.print;

/*


Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

 */
public class RotateArray {
    void main(){
        int[]nums={1,2,3,4,5,6,7};
        int k =3;
        rotateArray(nums,k);

        for(int num:nums)
            print(num+" ");
    }

    /*
    reverse first k elements
    reverse last k elements
    reverse entire array
    */
    void rotateArray(int[] nums, int k) {

        int start=0,end =nums.length-1-k;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }

        start= nums.length-k;
        end=nums.length-1;

        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }

        start=0;
        end= nums.length-1;

        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    void swap(int[] nums, int start, int end) {
        int temp= nums[start];
        nums[start]=nums[end];
        nums[end]=temp;

    }
}
