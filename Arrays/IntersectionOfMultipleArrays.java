package Arrays;

import java.util.*;

public class IntersectionOfMultipleArrays {

    public List<Integer> intersection(int[][]nums){
        int countArray = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> numCountMap = new HashMap<>();

        for(int i =0; i<nums[0].length;i++){
            numCountMap.put(nums[0][i],1);
        }

        System.out.print(numCountMap);

        for(int i =1; i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(numCountMap.containsKey(nums[i][j])){
                    numCountMap.put(nums[i][j],numCountMap.get(nums[i][j])+1);
                }
            }
        }

        for(Map.Entry<Integer,Integer> entry:numCountMap.entrySet()){
            int num = (int) entry.getKey();
            int numCount = (int) entry.getValue();
            if(numCount==countArray)
                res.add(num);
        }

        Collections.sort(res);
        return res;
    }
    void main(){

        int[][]nums = new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        int[][]nums1 = new int[][]{{3,1,2},{4,5,6}};


        IntersectionOfMultipleArrays myClass = new IntersectionOfMultipleArrays();
        System.out.println(myClass.intersection(nums1));
    }
}
