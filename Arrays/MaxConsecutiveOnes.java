package Arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        //
        int maxOnes = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
                maxOnes = Math.max(count,maxOnes);
            }
            else{
                count = 0;
            }

        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 1, 0, 1, 1, 1,0,1,1,1,1,1};
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int res = obj.findMaxConsecutiveOnes(num);
        System.out.print(res);
    }
}
