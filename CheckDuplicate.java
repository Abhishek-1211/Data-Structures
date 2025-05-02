public class CheckDuplicate {

    public boolean checkDuplicate(int [] nums){

        int [] indexArray =new int[100];
        for(int i =0;i<100;i++){
            indexArray[i]=0;
        }

        for(int i=0;i<nums.length;i++){

            int index=nums[i]-1;
            if(indexArray[index]==1)
                return true;

            indexArray[index]=1;
        }

        return false;

    }

    public static void main(String []args){
        //contraint 1<=nums[i]<=100
        int [] nums = {2,1,3,4,1,2,1,5,4};
        CheckDuplicate obj = new CheckDuplicate();
        System.out.print(obj.checkDuplicate(nums));
    }
}
