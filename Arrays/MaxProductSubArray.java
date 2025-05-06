package Arrays;

public class MaxProductSubArray {

    public int maxProduct(int[] nums) {

        int maxProduct = nums[0],leftProduct=1,rightProduct=1;
        for(int i =0; i< nums.length;i++){
            leftProduct *= nums[i];
            if(leftProduct == 0){
                leftProduct = 1;
            }

            rightProduct *= nums[nums.length-1-i];
            if(rightProduct == 0){
                rightProduct = 1;
            }
            maxProduct = Math.max(maxProduct,Math.max(leftProduct,rightProduct));
        }

        return maxProduct;
    }

    public static void main(String []args){
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxProductSubArray obj = new MaxProductSubArray();
        System.out.print(obj.maxProduct(nums));
    }
}
