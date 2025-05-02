public class MoveZeros {
    public void moveZeroes(int[] nums) {

        //2-pointer approach
        int i=0,j=0;
        while(j<nums.length){

            if(nums[i]==0 && nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j++;
            } else if (nums[i]!=0 && nums[j]!=0) {
                i++;
                j++;
            }
//            else if (nums[i]==0 && nums[j]==0) {
//                j++;
//            } else if (nums[i]!=0 && nums[j]==0) {
//                j++;
//            }
            else
                j++;
        }

//        int[] resArray = new int[nums.length];
//        int zerosCount = 0;
//        for(int i=0;i<nums.length;i++){
//            resArray[i]=nums[i];
//        }
//
//        for(int i=0;i<resArray.length;i++){
//            if(resArray[i]==0){
//                zerosCount++;
//                nums[nums.length-zerosCount]=0;
//            }
//        }
//
//        for(int i=resArray.length-1;i>=0;i--){
//            if(resArray[i]!=0){
//                nums[nums.length-1-zerosCount]=resArray[i];
//                zerosCount++;
//            }
//        }
    }

    public static void main(String []args){
        //contraint 1<=nums[i]<=100
        int [] nums = {0,1,0,3,12};
        MoveZeros obj = new MoveZeros();
        obj.moveZeroes(nums);
        for(int i =0 ;i<nums.length;i++)
        System.out.print(nums[i]+" ");
    }
}
