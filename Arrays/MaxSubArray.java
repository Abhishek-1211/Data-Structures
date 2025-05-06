package Arrays;//import static jdk.nashorn.internal.objects.Global.print;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        long currentSum = Integer.MIN_VALUE, maxSum = Integer.MIN_VALUE;
        System.out.println(maxSum);
        for(int i=0; i< nums.length;i++){
            //if(nums[i])
            if(nums[i]>(nums[i]+currentSum)){
                currentSum = nums[i];
            }else{
                currentSum += nums[i];
            }
            maxSum = Math.max(maxSum,currentSum);
            System.out.print("maxSum"+maxSum);
            System.out.print("  currentSum"+currentSum);
            System.out.println();
        }
        return (int)maxSum;
    }

    public static void main(String []args){
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray obj = new MaxSubArray();
        //print("Hello");
        System.out.print(obj.maxSubArray(nums));



    }
}
